/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.securityDemo2.controller;

import com.example.securityDemo2.data.UserEntity;
import com.example.securityDemo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Murilo
 */
@RestController
public class UserController {
    
    @Autowired
    UserService userService;
    
    
    @GetMapping("/hello")
    public String greeting(){
        userService.salvarUser(new UserEntity("murilo", "123"));
        return "Salve Mano!";
    }
    
    
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userEndpoint(){
        return "Hello user!";
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminEndpoint(){
        return "Hello admin!";
    }
}
