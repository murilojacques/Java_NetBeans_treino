/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.TesteTokenVerification.Controller;

import com.projeto.TesteTokenVerification.Data.PessoaEntity;
import com.projeto.TesteTokenVerification.Service.PessoaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@Controller
public class UserController {
    
    @Autowired
    PessoaService userService;
    
    @GetMapping("/pagIndex")
    public ModelAndView PagLogin(){
        ModelAndView mv = new ModelAndView("pagIndex");
        mv.addObject("user", new PessoaEntity());
        return mv;
    }
    
    @PostMapping("/ConfirmarLogin")
    public String confirmarLogin(@ModelAttribute("user") @Valid PessoaEntity user, BindingResult result, RedirectAttributes attribute){
        if(result.hasErrors()){
            attribute.addAttribute("msg", "Falha ao realizar o Login");
            return "redirect:/pagIndex";
        }
        
        PessoaEntity u = userService.ConfirmarLogin(user.getSenha(), user.getNome());
        if(u != null){
            attribute.addAttribute("user", user);
            return "pagDadosUser";
        }
        
        return "redirect:/pagIndex";
    }
    
    
    
    @GetMapping("/pagCadastrarUser")
    public ModelAndView PagCadastrarUser(){
        ModelAndView mv = new ModelAndView("pagCadastrarUser");
        mv.addObject("user", new PessoaEntity());
        return mv;
    }
    
    @PostMapping("/CadastrarUser")
    public String cadastrarUser(@ModelAttribute("user") @Valid PessoaEntity user, BindingResult result, RedirectAttributes attribute){
        if(result.hasErrors()){
            attribute.addAttribute("classe", "alert alert-success alert-danger");
            attribute.addAttribute("msg", "Falha ao Cadastrar User");
            return "redirect:/pagCadastrarUser";
        }
        
        userService.cadastrarUser(user);
        attribute.addAttribute("classe", "alert alert-success alert-dismissible");
        attribute.addAttribute("msg", "Usuario cadstrado com Sucesso");
        return "redirect:/pagCadastrarUser";
    }
    
    
}
//@ModelAttribute("user") @Valid PessoaEntity user, BindingResult result, RedirectAttributes attribute