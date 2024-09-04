/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.projeto01.controller;

import com.api.projeto01.data.lutadoresEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.api.projeto01.service.lutaService;
import com.api.projeto01.service.lutadoresService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Murilo
 */
@Controller
public class projeto_Controller {
    
    @Autowired
    lutadoresService lutadoresService;
    
    @Autowired
    lutaService lutaService;
    
    
    @GetMapping("/pag01")
    public String pagInicial(Model model){
        model.addAttribute("lutador", new lutadoresEntity());
        return "pag01";
    }
    
    @PostMapping("/cadastrarUsuario")
    public String cadastrarUsuario(@ModelAttribute("lutador") lutadoresEntity lutador){
        lutadoresService.CadastrarLutador(lutador);
        return "redirect:/";
    }
}
