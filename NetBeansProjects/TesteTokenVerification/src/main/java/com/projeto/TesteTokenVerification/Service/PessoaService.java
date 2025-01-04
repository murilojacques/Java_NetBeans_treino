/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.TesteTokenVerification.Service;

import com.projeto.TesteTokenVerification.Data.PessoaEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projeto.TesteTokenVerification.Data.PessoaRepository;

/**
 *
 * @author Murilo
 */
@Service
public class PessoaService {
    
    @Autowired
    private PessoaRepository userRepository;
    
    
    public Boolean cadastrarUser(PessoaEntity user){
        if(userRepository.findByRg(user.getRg()) != null){
            return false;
        }
        
        user.setId(null);
        user.setSaldo(100);
        userRepository.save(user);
        return true;
    }
    
   
    public PessoaEntity atualizarUser(PessoaEntity user){
        PessoaEntity newUser = new PessoaEntity();
        newUser = getUserById(user.getId());
        newUser.setSenha(user.getSenha());
        newUser.setNome(user.getNome());
        return newUser;
    }
    
    
    public PessoaEntity ConfirmarLogin(String senha, String nome){
        PessoaEntity user = userRepository.findByNomeAndSenha(nome, senha);
        return user;
    }
    
    
    
    
    public PessoaEntity getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }
    
    public List<PessoaEntity> findAllUsers(){
        List<PessoaEntity> users = userRepository.findAll();
        return users;
    }
    
}
