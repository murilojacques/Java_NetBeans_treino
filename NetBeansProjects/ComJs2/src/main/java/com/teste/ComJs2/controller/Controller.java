/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.ComJs2.controller;

import com.teste.ComJs2.data.UserEntity;
import com.teste.ComJs2.service.UserService;
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
    UserService userService;

    
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("user", new UserEntity());
        return mv;
    }
    
    
    @GetMapping("/pag2")
    public ModelAndView pag2(){
        ModelAndView mv = new ModelAndView("pag2");
        return mv;
    }
    
    
    @PostMapping("/cadastrarUser")
    public String cadastrarUser(@ModelAttribute("user") UserEntity user, BindingResult result, RedirectAttributes attribute){
        System.out.println("Idade " + user.getIdade());
        if(result.hasErrors()){
            return "redirect:/";
        }
        userService.cadastrarUser(user);
        return "redirect:/";
    }
}
