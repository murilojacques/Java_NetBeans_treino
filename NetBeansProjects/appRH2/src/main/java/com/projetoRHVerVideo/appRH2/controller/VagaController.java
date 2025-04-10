/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetoRHVerVideo.appRH2.controller;


import com.projetoRHVerVideo.appRH2.model.Candidato;
import com.projetoRHVerVideo.appRH2.model.Vaga;
import com.projetoRHVerVideo.appRH2.repository.CandidatoRepository;
import com.projetoRHVerVideo.appRH2.repository.VagaRepository;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VagaController {

	@Autowired
	private VagaRepository vr;
	
	@Autowired
	private CandidatoRepository cr;
        
        
        @RequestMapping(value = "/index", method = RequestMethod.GET)
        public String pagIndex(){
            return "index";
        }
        
	// CADASTRA VAGA
	@RequestMapping(value = "/cadastrarVaga", method = RequestMethod.GET)
	public String form() {
		return "formVaga";
	}

	@RequestMapping(value = "/cadastrarVaga", method = RequestMethod.POST)
	public String form(@Valid Vaga vaga, BindingResult result, RedirectAttributes attributes) {

		if (result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos...");
			return "redirect:/cadastrarVaga";
		}

		vr.save(vaga);
		attributes.addFlashAttribute("mensagem", "Vaga cadastrada com sucesso!");
		return "redirect:/cadastrarVaga";
	}

	// LISTA VAGAS

	@RequestMapping(value = "/vagas", method = RequestMethod.GET)
	public ModelAndView listaVagas() {
		ModelAndView mv = new ModelAndView("listaVaga");
		Iterable<Vaga> vagas = vr.findAll();
		mv.addObject("vagas", vagas);
		return mv;
	}

	//
	@RequestMapping(value = "/vagas/{id}", method = RequestMethod.GET)
	public ModelAndView detalhesVaga(@PathVariable("id") long id) {
		Vaga vaga = vr.findById(id);
		ModelAndView mv = new ModelAndView("detalhesVaga");
		mv.addObject("vaga", vaga);
                
                mv.addObject("newCandidato", new Candidato());
                
		Iterable<Candidato> canditados = cr.findByVaga(vaga);
		mv.addObject("candidatos", canditados);

		return mv;

	}

	// DELETA VAGA
	@RequestMapping("deletarVaga/{id}")
	public String deletarVaga(@PathVariable("id") long id) {
		Vaga vaga = vr.findById(id);
		vr.delete(vaga);
		return "redirect:/vagas";
	}

	// ADICIONAR CANDIDATO
	@RequestMapping(value = "/vagas/{id}", method = RequestMethod.POST)
	public String detalhesVagaPost(@PathVariable("id") long id, @Valid Candidato candidato,
			BindingResult result, RedirectAttributes attributes) {

		if (result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos");
			return "redirect:/vagas/" + id;
		}

		// rg duplicado
		if (cr.findByRg(candidato.getRg()) != null) {
			attributes.addFlashAttribute("mensagem_erro", "RG duplicado");
			return "redirect:/vagas/" + id;
		}

		Vaga vaga = vr.findById(id);
		candidato.setVaga(vaga);
                candidato.setId(null);
		cr.save(candidato);
		attributes.addFlashAttribute("mensagem", "Candidato adionado com sucesso!");
		return "redirect:/vagas/" + id;
	}

	// DELETA CANDIDATO pelo RG
	@RequestMapping("/deletarCandidato/{rg}")
	public String deletarCandidato(@PathVariable("rg") String rg) {
		Candidato candidato = cr.findByRg(rg);
		Vaga vaga = candidato.getVaga();
		String codigo = "" + vaga.getId();

		cr.delete(candidato);

		return "redirect:/vagas/" + codigo;

	}

	// Métodos que atualizam vaga
	// formulário edição de vaga
	@RequestMapping(value = "editar-vaga/{id}", method = RequestMethod.GET)
	public ModelAndView editarVaga(@PathVariable("id") long id) {
		Vaga vaga = vr.findById(id);
		ModelAndView mv = new ModelAndView("update-vaga");
		mv.addObject("vaga", vaga);
		return mv;
	}

	// UPDATE vaga
	@RequestMapping(value = "/editar-vaga/{id}", method = RequestMethod.POST)
	public String updateVaga(@PathVariable("id") long id, @Valid Vaga updateVaga , BindingResult result, RedirectAttributes attributes) {
            Vaga vaga = vr.findById(id);
            vaga.setData(updateVaga.getData());
            vaga.setDescricao(updateVaga.getDescricao());
            vaga.setNome(updateVaga.getNome());
            vaga.setSalario(updateVaga.getSalario());
            vr.save(vaga);
		attributes.addFlashAttribute("success", "Vaga alterada com sucesso!");

		long codigoLong = vaga.getId();
		String codigo = "" + codigoLong;
		return "redirect:/vagas/" + codigo;
	}
        
}
