/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telusko.SpringSecurityEx.controller;

import com.telusko.SpringSecurityEx.data.UserEntity;
import com.telusko.SpringSecurityEx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Murilo
 */
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @PostMapping("/register")
    public UserEntity register(@RequestBody UserEntity user){
        System.out.println("Nome: "+user.getUsername());
        return userService.register(user);
    }
}
