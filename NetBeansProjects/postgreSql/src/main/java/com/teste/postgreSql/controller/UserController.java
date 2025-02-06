/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.postgreSql.controller;

import com.teste.postgreSql.data.UserEntity;
import com.teste.postgreSql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public ModelAndView pagIndex(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("user", new UserEntity());
        return mv;
    }
    
    
    @PostMapping("/cadastrarUser")
    public String cadastrarUser(@ModelAttribute("user") UserEntity user, RedirectAttributes attributes){
        userService.salvarUser(user);
        return "redirect:/";
    }
}
