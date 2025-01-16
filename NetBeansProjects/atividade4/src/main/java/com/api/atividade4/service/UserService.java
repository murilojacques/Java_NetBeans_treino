/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.service;


import com.api.atividade4.data.AnaliseEntity;
import com.api.atividade4.data.FilmeEntity;
import com.api.atividade4.data.RolesEntity;
import com.api.atividade4.data.UserEntity;
import com.api.atividade4.data.UserRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;


    private UserEntity user = new UserEntity();
    
   /**
     * @param userRepository *  @Bean
    public UserEntity userEntity(){
        return new UserEntity();
    }**/
    
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserService() {
    }
    
    
    
    public void cadastrarUser(String username, String password, RolesEntity roles){
        //findByUsername(username);
        List<FilmeEntity> filmes = new ArrayList<>();
        List<AnaliseEntity> analises = new ArrayList<>();
        user.setUsername(username);
        user.setPassword(password);
        user.setAnalises(analises);
        user.setFilmes(filmes);
        user.setRoles(Collections.singletonList(roles));
        userRepository.save(user);
    }
    
    public void setUserByUsername(String username){
        this.user = findByUsername(username);
    }
    
    public UserEntity findByUsername(String username){
        return userRepository.findByUsername(username).orElse(null);
    }
    
    
    
    
    public UserEntity salvarFilme(String username, FilmeEntity filme){
        System.out.println(username);
        setUserByUsername(username); 
        //System.out.println(user.getId());
        //System.out.println(user.getUsername());
        //System.out.println(user.getPassword());
        user.getFilmes().add(filme);
        userRepository.save(user);
        return user;
    }
    
    public List<FilmeEntity> allFilmesByUser(){
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println("Filmes: " + user.getFilmes());
        return user.getFilmes();
    }
    
    public UserEntity atualizarFilme(String username, FilmeEntity filme){
        setUserByUsername(username);
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
    
    public List<AnaliseEntity> allAnalisesByUser(){
        return user.getAnalises();
    }
}
