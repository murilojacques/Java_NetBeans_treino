/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.func.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Murilo
 */
@Controller
public class EntityController {
    
    @GetMapping("/a")
    public ModelAndView pagIndex(){
        ModelAndView mv = new ModelAndView("a");
        return mv;
    }
    
    @GetMapping("/b")
    public ModelAndView pagB(){
        ModelAndView mv = new ModelAndView("b");
        return mv;
    }
}
