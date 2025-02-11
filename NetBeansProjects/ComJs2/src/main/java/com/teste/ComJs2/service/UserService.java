/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.ComJs2.service;

import com.teste.ComJs2.data.UserEntity;
import com.teste.ComJs2.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;

    public void cadastrarUser(UserEntity user) {
        user.setId(null);
        
        /*
        UserEntity newUser = new UserEntity();
        newUser.setId(null);
        newUser.setNome("aa");
        newUser.setIdade(19);
        newUser.setEmail("Aaasdasd");
        */
        userRepository.save(user);
    }
}
