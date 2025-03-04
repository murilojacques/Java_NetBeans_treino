/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.funcionamentoDependencias.controller;

import com.teste.funcionamentoDependencias.data.UserEntity;
import com.teste.funcionamentoDependencias.service.UserService;
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
    UserService userService;
    
    @GetMapping("/")
    public ModelAndView pagLogin(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("User", new UserEntity());
        return mv;
    }
    
    @GetMapping("/pagCriarConta")
    public ModelAndView pagCriarConta(){
        ModelAndView mv = new ModelAndView("pagCriarConta");
        mv.addObject("newUser", new UserEntity());
        return mv;
    }
    
    
    
    @PostMapping("/cadastrarUser")
    public String cadastrarUser(@ModelAttribute("newUser") UserEntity user, RedirectAttributes attributes, BindingResult result){
        
        if(result.hasErrors()){
            return "redirect:/pagCriarConta";
        }
        userService.cadastrarUser(user);
        return "redirect:/pagCriarConta";
    }
    
    
    @PostMapping("/loginUser")
    public ModelAndView loginUser(@ModelAttribute("User") UserEntity user, RedirectAttributes attributes, BindingResult result){
        
        ModelAndView mv = new ModelAndView("pagCentral");
        
        if(result.hasErrors()){
            return mv;
        }
        userService.verify(user);
        return mv;
    }
}
