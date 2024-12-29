/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.TesteTokenVerification.Service;

import com.projeto.TesteTokenVerification.Data.UserEntity;
import com.projeto.TesteTokenVerification.Data.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public Boolean cadastrarUser(UserEntity user){
        if(userRepository.findByRg(user.getRg()) != null){
            return false;
        }
        
        user.setId(null);
        userRepository.save(user);
        return true;
    }
    
    public List<UserEntity> findAllUsers(){
        List<UserEntity> users = userRepository.findAll();
        return users;
    }
    
    public UserEntity atualizarUser(UserEntity user){
        UserEntity newUser = new UserEntity();
        newUser = getUserById(user.getId());
        newUser.setSenha(user.getSenha());
        newUser.setNome(user.getNome());
        return newUser;
    }
    
    public UserEntity getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }
}
