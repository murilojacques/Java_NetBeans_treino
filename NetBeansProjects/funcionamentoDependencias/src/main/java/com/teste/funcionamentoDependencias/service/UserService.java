/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.funcionamentoDependencias.service;

import com.teste.funcionamentoDependencias.data.UserEntity;
import com.teste.funcionamentoDependencias.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    
    @Autowired
    AuthenticationManager authenticationManager;
    
    @Autowired
    JwtService jwtService;
    
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);
    
    
    public void cadastrarUser(UserEntity user) {
        user.setId(null);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    
    public String verify(UserEntity user) {
        Authentication authentication =
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        
        if(authentication.isAuthenticated()){
            System.out.println("token2: "+ jwtService.generateToken(user.getUsername()));
            return jwtService.generateToken(user.getUsername());
        }
        
        return "Failure";
    }
    
}
