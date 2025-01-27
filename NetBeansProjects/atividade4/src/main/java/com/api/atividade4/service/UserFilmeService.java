/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.service;

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
        if(userFilmeRepository != null){
            System.out.println("NÃO NULO");
        }
        UserFilmeEntity userFilme = new UserFilmeEntity();
        userFilme.setId(null);
        userFilme.setUserId(id);
        userFilme.setFilme(filme.getId());
        userFilmeRepository.save(userFilme);
        return null;
    }
    
    public List<FilmeEntity> findFilmesByUser(Integer id, UserFilmeRepository userFilme, FilmeService filmeService, FilmeRepository filmeRepository){
        this.userFilmeRepository = userFilme;
        if(userFilmeRepository == null){
            System.out.println("NULO");
        }
        
        //List<UserFilmeEntity> user = new ArrayList<>();
        List<UserFilmeEntity> user = this.userFilmeRepository.findByUserId(id);
        List<FilmeEntity> filmes = new ArrayList<>();
        this.filmeRepository = filmeRepository;
        for (UserFilmeEntity u : user) {
            System.out.println("FilmeId: "+u.getFilmeId());
            if(u.getFilmeId() != null){
                FilmeEntity filme = filmeService.getFilmeById(u.getFilmeId(), this.filmeRepository);
                filmes.add(filme);
            }
            
            System.out.println("  BBBBBBB");
        }
        
        return filmes;
    }
    
   /** 
    public UserFilmeEntity atualizarFilme(UserEntity user, FilmeEntity updatedFilme, FilmeService filmeService){
        
        UserFilmeEntity newUser = new UserFilmeEntity();
        UserFilmeEntity oldUser = userFilmeRepository.findByFilmeId(updatedFilme.getId());
        
        newUser.
        
        List<UserFilmeEntity> ListUser = userFilmeRepository.findByUserId(user.getId());
        List<FilmeEntity> filmes = new ArrayList<>();
        UserFilmeEntity newUser = new UserFilmeEntity();
        
        for(UserFilmeEntity u : ListUser){
            FilmeEntity addFilme = filmeService.getFilmeById(u.getFilmeId());
            filmes.add(addFilme);
        }
        
        for(int i = 0; i<filmes.size(); i++){
            if(Objects.equals(filmes.get(i).getId(), updatedFilme.getId())){
                FilmeEntity newFilme = filmes.get(i);
                
                
                newUser = ListUser.get(i);
                newUser.setFilmeId(newFilme.getId());
                
                userFilmeRepository.save(newUser);
                
            }
            else{
                i++;
            }
        }
        * 
        
        return newUser;
    }
    **/

}
