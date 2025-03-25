/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senactds.cookiemvc.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Murilo
 */
@Controller
@RequestMapping("/cookies")
public class cookiesController {

    @RequestMapping("/grava")
    public String criaCookie(HttpServletResponse response) {
        Cookie novoCookie = new Cookie("user-id", "123abc");
        response.addCookie(novoCookie);
        return "criacookie";
    }

    @RequestMapping("/le")
    public String leCookie(@CookieValue(name = "user-id", defaultValue = "nenhum-valor") String userId, Model model) {
        model.addAttribute("userid", userId);
        return "lecookie";
    }

    @RequestMapping("/exclui")
    public String excluiCookie(HttpServletResponse response) {
        Cookie novoCookie = new Cookie("user-id", null);
        novoCookie.setMaxAge(0);
        response.addCookie(novoCookie);
        return "excluicookie";
    }
    
    
    @GetMapping("/abc")
    public String sayHi(){
        return "Hi Everyone";
    }
}
