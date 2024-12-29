/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetoRHVerVideo.appRH.controller;


import com.projetoRHVerVideo.appRH.model.Candidato;
import com.projetoRHVerVideo.appRH.model.Vaga;
import com.projetoRHVerVideo.appRH.repository.CandidatoRepository;
import com.projetoRHVerVideo.appRH.repository.VagaRepository;
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

	@RequestMapping("/vagas")
	public ModelAndView listaVagas() {
		ModelAndView mv = new ModelAndView("listaVaga");
		Iterable<Vaga> vagas = vr.findAll();
		mv.addObject("vagas", vagas);
		return mv;
	}

	//
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView detalhesVaga(@PathVariable("id") long id) {
		Vaga vaga = vr.findById(id);
		ModelAndView mv = new ModelAndView("detalhesVaga");
		mv.addObject("vaga", vaga);

		Iterable<Candidato> canditados = cr.findByVaga(vaga);
		mv.addObject("candidatos", canditados);

		return mv;

	}

	// DELETA VAGA
	@RequestMapping("/deletarVaga")
	public String deletarVaga(long codigo) {
		Vaga vaga = vr.findById(codigo);
		vr.delete(vaga);
		return "redirect:/vagas";
	}

	// ADICIONAR CANDIDATO
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public String detalhesVagaPost(@PathVariable("id") long id, @Valid Candidato candidato,
			BindingResult result, RedirectAttributes attributes) {

		if (result.hasErrors()) {
			attributes.addFlashAttribute("mensagem", "Verifique os campos");
			return "redirect:/{id}";
		}

		// rg duplicado
		if (cr.findByRg(candidato.getRg()) != null) {
			attributes.addFlashAttribute("mensagem_erro", "RG duplicado");
			return "redirect:/{id}";
		}

		Vaga vaga = vr.findById(id);
		candidato.setVaga(vaga);
		cr.save(candidato);
		attributes.addFlashAttribute("mensagem", "Candidato adionado com sucesso!");
		return "redirect:/{id}";
	}

	// DELETA CANDIDATO pelo RG
	@RequestMapping("/deletarCandidato")
	public String deletarCandidato(String rg) {
		Candidato candidato = cr.findByRg(rg);
		Vaga vaga = candidato.getVaga();
		String codigo = "" + vaga.getId();

		cr.delete(candidato);

		return "redirect:/" + codigo;

	}

	// Métodos que atualizam vaga
	// formulário edição de vaga
	@RequestMapping(value = "/editar-vaga", method = RequestMethod.GET)
	public ModelAndView editarVaga(long codigo) {
		Vaga vaga = vr.findById(codigo);
		ModelAndView mv = new ModelAndView("update-vaga");
		mv.addObject("vaga", vaga);
		return mv;
	}

	// UPDATE vaga
	@RequestMapping(value = "/editar-vaga", method = RequestMethod.POST)
	public String updateVaga(@Valid Vaga vaga, BindingResult result, RedirectAttributes attributes) {
		vr.save(vaga);
		attributes.addFlashAttribute("success", "Vaga alterada com sucesso!");

		long codigoLong = vaga.getId();
		String codigo = "" + codigoLong;
		return "redirect:/" + codigo;
	}
        
}
