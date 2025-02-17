/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.ComJs3.controller;

import com.teste.ComJs3.service.EmpresaService;
import com.teste.ComJs3.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Murilo
 */
@org.springframework.stereotype.Controller
public class Controller {
    
    @Autowired
    EmpresaService empresaService;
    
    @Autowired
    FuncionarioService funcionarioService;
    
    
    @GetMapping("/")
    public ModelAndView pagIndex(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    
    
    @GetMapping("pagCadastrarEmpresa")
    public ModelAndView pagCadastrarEmpresa(){
        ModelAndView mv = new ModelAndView("pagCadastrarEmpresa");
        return mv;
    }
}
