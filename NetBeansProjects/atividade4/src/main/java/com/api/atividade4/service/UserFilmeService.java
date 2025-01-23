/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.service;

import com.api.atividade4.data.FilmeEntity;
import com.api.atividade4.data.UserFilmeEntity;
import com.api.atividade4.data.UserFilmeRepository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class UserFilmeService {
    
    @Autowired
    UserFilmeRepository userFilmeRepository;

    /**
     *
     * @param userFilmeRepository
     */
    @Autowired
    public UserFilmeService(UserFilmeRepository userFilmeRepository) {
        this.userFilmeRepository = userFilmeRepository;
    }
    

    public UserFilmeService() {
    }
    
    
    
    public Void saveUserFilme(Integer id, FilmeEntity filme){
        UserFilmeEntity userFilme = new UserFilmeEntity();
        userFilme.setId(null);
        userFilme.setUserId(id);
        userFilme.setFilme(filme);
        userFilmeRepository.save(userFilme);
        return null;
    }
    
    public List<FilmeEntity> findFilmesByUser(Integer id){
        if(userFilmeRepository == null){
            System.out.println("NULO");
        }
        List<UserFilmeEntity> user = new ArrayList<>();
        //List<UserFilmeEntity> user = userFilmeRepository.findByUserId(id);
        List<FilmeEntity> filmes = new ArrayList<>();
        for (UserFilmeEntity u : user) {
            filmes.add(u.getFilme());
        }
        
        return filmes;
    }
    
   /** @Bean 
    public UserFilmeRepository userFilmeRepository(UserFilmeRepository userFilmeRepository){
        return userFilmeRepository;
    }
    * **/
}
