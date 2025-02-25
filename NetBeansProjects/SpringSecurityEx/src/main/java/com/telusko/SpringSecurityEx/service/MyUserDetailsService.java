/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telusko.SpringSecurityEx.service;

import com.telusko.SpringSecurityEx.data.UserEntity;
import com.telusko.SpringSecurityEx.data.UserPrincipal;
import com.telusko.SpringSecurityEx.repository.UserRepository;
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
    private UserRepository userRepository;
    
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
