/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho02.projetoRH.controller;

import com.projetinho02.projetoRH.data.CandidatosEntity;
import com.projetinho02.projetoRH.data.VagasEntity;
import com.projetinho02.projetoRH.service.CandidatosService;
import com.projetinho02.projetoRH.service.VagasService;
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

/**
 *
 * @author Murilo
 */
@Controller
public class VagasController {
    
    @Autowired
    private VagasService vagasService;
    
    @Autowired
    private CandidatosService candidatosService;
    
    
    @GetMapping("/pagIndex")
    public String pagIndex(Model model){
        return "pagIndex";
    }
    
    @GetMapping("/pagCadastrarVaga")
    public String pagCadastrarVaga(Model model){
        model.addAttribute("vaga", new VagasEntity());
        return "pagCadastrarVaga";
    }
    
    @PostMapping("/cadastrarVaga")
    public String CadastrarVaga(Model model, @ModelAttribute("vaga") @Valid VagasEntity vaga, BindingResult result, RedirectAttributes attributes){
        
        if(result.hasErrors()){
            //Aparentemente esse RedirectAttributes é basicamente um model mas para quando for redirecionar uma pagina
            attributes.addFlashAttribute("msg", "Verifique os campos preenchidos...");
            return "redirect:/pagCadastrarVaga";
        }
        vagasService.cadastrarVaga(vaga);
        attributes.addFlashAttribute("msg", "Vaga Cadastrada com Sucesso!");
        return "redirect:/pagCadastrarVaga";
    }
    
    
    @GetMapping("/pagListaVagas")
    public ModelAndView listarVagas(Model model){
        ModelAndView modelAndView = new ModelAndView("pagListaVagas");  //sendo passada qual pagina o ModelAndView tera nesse caso a pagina "listaVagas"
        List<VagasEntity> vagas = vagasService.findAllVagas();
        model.addAttribute("vagas", vagas);
        return modelAndView;
    }
    
    
    @GetMapping("/pagDetalhesVaga/{id}")
    public String detalhesVaga(@PathVariable("id") Long vagaId, Model model){
        ModelAndView modelAndView = new ModelAndView("pagDetalhesVaga");
        
        VagasEntity vaga = vagasService.findById(vagaId);
        List<CandidatosEntity> candidatos = candidatosService.findByVaga(vaga);
        
        model.addAttribute("vaga", vaga);
        model.addAttribute("candidatos", candidatos);
        model.addAttribute("newCandidato", new CandidatosEntity());
        return "pagDetalhesVaga";
    }
    
    @PostMapping("/adicCandidatoAVaga/{id}")
    public String adicionarCandidatoAVaga(@PathVariable("id") Long vagaId, @ModelAttribute("newCandidato") @Valid CandidatosEntity candidato, BindingResult result, RedirectAttributes attribute){
        
        if(result.hasErrors()){
            attribute.addFlashAttribute("msg", "Verifique os Campos");
            attribute.addFlashAttribute("css", "background-color: #F04600; color: white; padding: 15px; border-radius: 10px; font-size: 15px");
            return "redirect:/pagDetalhesVaga/" + vagaId;
        }
        VagasEntity vaga = vagasService.findById(vagaId);
        
        candidato.setVaga(vaga);
        boolean verificar = candidatosService.cadastrarCandidato(candidato);
        if(!verificar){
            attribute.addFlashAttribute("msg", "O valor do RG informado ja esta cadastrado no Sistema, verifique se o campo foi digitado corretamente");
            attribute.addFlashAttribute("css", "background-color: #F04600; color: white; padding: 15px; border-radius: 10px; font-size: 15px");
            return "redirect:/pagDetalhesVaga/"+ vagaId;
        }
        
        vagasService.adicionarCandidato(vaga, candidato);
        attribute.addFlashAttribute("msg", "Candidato cadastrado com sucesso à vaga");
        //attribute.addFlashAttribute("classe", "panel panel-success");
        attribute.addFlashAttribute("css", "background-color: #0091D9; color: white; padding: 15px; border-radius: 10px; font-size: 15px");
        return "redirect:/pagDetalhesVaga/" + vagaId;
    }
    
    
    @GetMapping("/deletarVaga/{id}")
    public String deletarVaga(@PathVariable("id") Long id){
        vagasService.deletarVaga(id);
        return "redirect:/pagListaVagas";
    }
    
    @GetMapping("/deletarCandidatoPorRg/{rg}")
    public String deletarCandidatoPorRg(@PathVariable("rg") Integer rg){
        CandidatosEntity candidato = candidatosService.findByRg(rg);
        VagasEntity vaga = candidato.getVaga();
        String codigo = String.valueOf(vaga.getId());
        candidatosService.deleteCandidato(candidato);
        return "redirect:/pagDetalhesVaga/" + codigo;
    }
    
    
    @GetMapping("/pagAtualizarVaga/{id}")
    public ModelAndView pagAtualizarVaga(@PathVariable("id") Long id){
        VagasEntity vaga = vagasService.findById(id);
        ModelAndView modelAndView = new ModelAndView("pagAtualizarVaga");
        modelAndView.addObject("vaga", vaga);
        return modelAndView;
    }
    
    @PostMapping("/atualizarVaga/{id}")
    public String atualizarVaga(@PathVariable("id") Long id, @ModelAttribute("vaga") @Valid VagasEntity vaga, RedirectAttributes attributes){
        vagasService.atualizarVaga(id, vaga);
        attributes.addFlashAttribute("success", "Vaga Atualizada com Sucesso!");
        
        return "redirect:/pagDetalhesVaga/"+id;
    }
}
