/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.controller;

import com.api.atividade4.Dto.LoginDto;
import com.api.atividade4.Dto.RegisterDto;
import com.api.atividade4.data.RoleRepository;
import com.api.atividade4.data.RolesEntity;
import com.api.atividade4.data.UserEntity;
import com.api.atividade4.data.UserRepository;
import java.util.Collection;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Murilo
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    private AuthenticationManager authenticationManager;
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    
    @Autowired
    public AuthController(AuthenticationManager authenticationManager, UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>("user signed Success", HttpStatus.OK);
    }
    
    
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto){
        if(userRepository.existsByUsername(registerDto.getUsername())){
            return new ResponseEntity("username is taken!", HttpStatus.BAD_REQUEST);
        }
        
        if(!userRepository.existsByUsername(registerDto.getUsername())){
            UserEntity user = new UserEntity();
         user.setUsername(registerDto.getUsername());
         user.setPassword(passwordEncoder.encode(registerDto.getPassword()));

         RolesEntity roles = roleRepository.findByName("USER").get();
         user.setRoles(Collections.singletonList(roles));

         userRepository.save(user);
         return new ResponseEntity<>("User Registered Success", HttpStatus.OK); 
        }
        
        else{
            return new ResponseEntity<>("Foi de ralo", HttpStatus.BAD_REQUEST); 
        }
        
    }
    
    
}
