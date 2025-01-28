/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.service;

import com.api.atividade4.data.AnaliseEntity;
import com.api.atividade4.data.AnaliseRepository;
import com.api.atividade4.data.FilmeEntity;
import com.api.atividade4.data.FilmeRepository;
import com.api.atividade4.data.UserEntity;
import com.api.atividade4.data.UserFilmeEntity;
import com.api.atividade4.data.UserFilmeRepository;
import com.api.atividade4.data.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
    private UserFilmeRepository userFilmeRepository;
    
    @Autowired
    private FilmeRepository filmeRepository;
    
    @Autowired
    private AnaliseRepository analiseRepository;

    /**
     *
     * @param userFilmeRepository
     */
    
    public UserFilmeService(UserFilmeRepository userFilmeRepository) {
        this.userFilmeRepository = userFilmeRepository;
    }
    

    public UserFilmeService() {
    }
    
    
    
    public Void saveUserFilme(Integer id, FilmeEntity filme){
        UserFilmeEntity userFilme = new UserFilmeEntity();
        userFilme.setId(null);
        userFilme.setUserId(id);
        userFilme.setFilme(filme.getId());
        userFilmeRepository.save(userFilme);
        return null;
    }
    
    public List<FilmeEntity> findFilmesByUser(Integer id, UserFilmeRepository userFilme, FilmeService filmeService, FilmeRepository filmeRepository){
        this.userFilmeRepository = userFilme;
        
        //List<UserFilmeEntity> user = new ArrayList<>();
        List<UserFilmeEntity> user = this.userFilmeRepository.findByUserId(id);
        List<FilmeEntity> filmes = new ArrayList<>();
        this.filmeRepository = filmeRepository;
        for (UserFilmeEntity u : user) {
            //System.out.println("FilmeId: "+u.getFilmeId());
            if(u.getFilmeId() != null){
                FilmeEntity filme = filmeService.getFilmeById(u.getFilmeId(), this.filmeRepository);
                filmes.add(filme);
            }
        }
        
        return filmes;
    }
    
    
    public List<AnaliseEntity> findAnalisesByUser(Integer id, UserFilmeRepository userFilme, AnaliseService analiseService, AnaliseRepository analiseRepository){
        this.userFilmeRepository = userFilme;
        
        List<UserFilmeEntity> user = this.userFilmeRepository.findByUserId(id);
        List<AnaliseEntity> analises = new ArrayList<>();
        this.analiseRepository = analiseRepository;
        
        for(UserFilmeEntity u : user){
            if(u.getAnaliseId() != null){
                AnaliseEntity analise = analiseService.getAnaliseById(u.getAnaliseId(), this.analiseRepository);
                analises.add(analise);
            }
        }
        
        return analises;
    }
    
    
    public UserFilmeEntity salvarAnalise(Integer filmeId, Integer userId, AnaliseEntity analise){
        
        UserFilmeEntity userFilme = userFilmeRepository.findByUserIdAndFilmeId(userId, filmeId);
        userFilme.setAnaliseId(analise.getId());
        userFilmeRepository.save(userFilme);
        return userFilme;
    }

}
