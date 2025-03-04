/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.securityDemo2.service;

import com.example.securityDemo2.data.UserEntity;
import com.example.securityDemo2.data.UserRepository;
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
    
    public void salvarUser(UserEntity userEntity) {
        userEntity.setId(null);
        userRepository.save(userEntity);
    }
    
}
