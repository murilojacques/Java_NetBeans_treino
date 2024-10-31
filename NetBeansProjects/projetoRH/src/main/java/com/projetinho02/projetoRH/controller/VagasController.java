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
    
    
    @GetMapping("/pagCadastrarVaga")
    public String pagCadastrarVaga(Model model){
         
        return "CadastrarVaga";
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
    
    
    @GetMapping("/ListaVagas")
    public ModelAndView listarVagas(){
        ModelAndView modelAndView = new ModelAndView("listaVagas");  //sendo passada qual pagina o ModelAndView tera nesse caso a pagina "listaVagas"
        List<VagasEntity> vagas = vagasService.findAllVagas();
        modelAndView.addObject("vagas", vagas);
        return modelAndView;
    }
    
    @GetMapping("/detalhesVaga/{id}")
    public ModelAndView detalhesVaga(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView("detalhesVaga");
        
        VagasEntity vaga = vagasService.findById(id);
        List<CandidatosEntity> candidatos = candidatosService.findByVaga(vaga);
        
        modelAndView.addObject("vaga", vaga);
        modelAndView.addObject("candidatos", candidatos);
        return modelAndView;
    }
}
