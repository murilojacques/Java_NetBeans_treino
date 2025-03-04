/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.funcionamentoDependencias.service;

import com.teste.funcionamentoDependencias.data.UserEntity;
import com.teste.funcionamentoDependencias.data.UserPrincipal;
import com.teste.funcionamentoDependencias.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class MyUserDetailsService implements UserDetailsService{
    
    @Autowired
    UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username);
        
        if(user == null){
            System.out.println("USER NOT FOUND!");
            throw new UsernameNotFoundException("USER NOT FOUND!");
        }
        
        return new UserPrincipal(user);
    }
    
}
