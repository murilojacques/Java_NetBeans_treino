/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Murilo
 */
@RestController
@RequestMapping("/")
public class CookieController {
    
    @PostMapping("/gravar")
    public ModelAndView registraCookie(@RequestBody String preferencia, HttpServletResponse response){
        Cookie c = new Cookie("preferencia", preferencia);
        response.addCookie(c);
        return new ModelAndView("redirect:/");
    }
    
    @GetMapping("/le")
    public String leCookie(@CookieValue(name = "user-id", defaultValue = "nenhum-Valor") String userId){
        return "cookie: "+userId;
    }
}
