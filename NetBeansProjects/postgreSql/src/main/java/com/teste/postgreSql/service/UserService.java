/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.postgreSql.service;

import com.teste.postgreSql.data.UserEntity;
import com.teste.postgreSql.repositories.UserRepository;
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
    
    public void salvarUser(UserEntity user){
        user.setId(null);
        userRepository.save(user);
    }
}
