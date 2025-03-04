/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.securityDemo.controller;

import com.example.securityDemo.data.UserEntity;
import com.example.securityDemo.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Murilo
 */
@RestController
public class HelloController {
    
    @Autowired
    UserRepository userRepository;
    
    @GetMapping("/hello")
    public String greet(){
        UserEntity user = new UserEntity();
        user.setUsername("murilo");
        user.setPassword("123");
        user.setId(null);
        userRepository.save(user);
        return "Salve Dog!";
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
