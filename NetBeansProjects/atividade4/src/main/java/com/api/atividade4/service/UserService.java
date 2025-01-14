/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.service;


import com.api.atividade4.data.AnaliseEntity;
import com.api.atividade4.data.FilmeEntity;
import com.api.atividade4.data.UserEntity;
import com.api.atividade4.data.UserRepository;
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

    
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    
    public UserService() {
    }
    
    
    
    public UserEntity findByUsername(String username){
        return userRepository.findByUsername(username).orElse(null);
    }
    
    
    public UserEntity salvarFilme(UserEntity user, FilmeEntity filme){
        user.getFilmes().add(filme);
        return user;
    }
    
    public UserEntity atualizarFilme(UserEntity user, FilmeEntity filme){
        List<FilmeEntity> filmes = user.getFilmes();
        
        for(int i = 0; i<filmes.size(); i++){
            if(filmes.get(i) == filme){
                FilmeEntity newFilme = user.getFilmes().get(i);
                newFilme.setAnoLancamento(filme.getAnoLancamento());
                newFilme.setGenero(filme.getGenero());
                newFilme.setSinopse(filme.getSinopse());
                newFilme.setTitulo(filme.getTitulo());
                
                user.getFilmes().add(i, filme);
                
                userRepository.save(user);
            }
            else{
                i++;
            }
        }
        
        return user;
    }
    
    
    
    
    public UserEntity salvarAnalise(UserEntity user, AnaliseEntity analise){
        user.getAnalises().add(analise);
        return user;
    }
    
}
