/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.ComJs2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Murilo
 */
@org.springframework.stereotype.Controller
public class Controller {
    
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    
    
    @GetMapping("/pag2")
    public ModelAndView pag2(){
        ModelAndView mv = new ModelAndView("pag2");
        return mv;
    }
    
}
