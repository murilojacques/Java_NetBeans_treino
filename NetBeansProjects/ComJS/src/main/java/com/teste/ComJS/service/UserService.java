/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.teste.ComJS.service;

import com.teste.ComJS.data.UserEntity;
import com.teste.ComJS.data.UserRepository;
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

    public void cadastrarUser(UserEntity user){
        user.setId(null);
        userRepository.save(user);
    }

}
