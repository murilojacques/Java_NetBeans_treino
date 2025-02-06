/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.teste.ComJS.controller;

import com.teste.ComJS.data.UserEntity;
import com.teste.ComJS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
