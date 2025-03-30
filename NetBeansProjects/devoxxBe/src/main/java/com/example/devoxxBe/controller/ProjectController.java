/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.devoxxBe.controller;

import java.util.Optional;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Murilo
 */
@RestController
public class ProjectController {
    
    @GetMapping("/")
    public String pagNoAuth(){
        return "this page is public, and anyone can access it";
    }
    
    @GetMapping("/private")
    public String pagWithAuth(Authentication authentication) throws InterruptedException{
        return "Welcome to the VIP room ~["+ authentication.getName() +"]~";
        
        //var auth = SecurityContextHolder.getContext().getAuthentication();
        //return "Welcome to the VIP room ~["+ auth.getName() +"]~";
        /* 
        var t = new Thread(() -> {
            var inThread = SecurityContextHolder.getContext().getAuthentication();
            System.out.println("In Thread: "+ inThread);
        });
        
        t.start();
        t.join();
        
        System.out.println("Outside Thread: "+authentication);
        */
    }

}
