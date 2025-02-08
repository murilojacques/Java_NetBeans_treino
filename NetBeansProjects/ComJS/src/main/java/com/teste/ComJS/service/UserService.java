/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.teste.ComJS.service;

import com.teste.ComJS.data.UserEntity;
import com.teste.ComJS.data.UserRepository;
import java.util.List;
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

    public List<UserEntity> FindUsers() {
        List<UserEntity> users = userRepository.findAll();
        return users;
    }

    public void deletarByUserId(Integer id) {
        userRepository.deleteById(id);
    }

    public UserEntity findUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public void updateUser(UserEntity updatedUser, Integer id) {
        UserEntity user = userRepository.findById(id).orElse(null);
        
        user.setNome(updatedUser.getNome());
        user.setEmail(updatedUser.getEmail());
        user.setRg(updatedUser.getRg());
        user.setCpf(updatedUser.getCpf());
        
        userRepository.save(user);
    }

}
