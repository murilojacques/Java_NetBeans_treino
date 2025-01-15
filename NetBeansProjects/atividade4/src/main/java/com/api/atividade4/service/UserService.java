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


    private UserEntity user;
    
   /** @Bean
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
        UserEntity nUser = new UserEntity();
        List<FilmeEntity> filmes = new ArrayList<FilmeEntity>();
        List<AnaliseEntity> analises = new ArrayList<AnaliseEntity>();
        nUser.setUsername(username);
        nUser.setPassword(password);
        nUser.setAnalises(analises);
        nUser.setFilmes(filmes);
        nUser.setRoles(Collections.singletonList(roles));
        userRepository.save(user);
    }
    
    public void setUserByUsername(String username){
        user = findByUsername(username);
    }
    
    public UserEntity findByUsername(String username){
        return userRepository.findByUsername(username).orElse(null);
    }
    
    
    
    
    public UserEntity salvarFilme(String username, FilmeEntity filme){
        UserEntity nUser = findByUsername(username); 
        System.out.println(nUser.getId());
        System.out.println(nUser.getUsername());
        System.out.println(nUser.getPassword());
        nUser.getFilmes().addLast(filme);
        userRepository.save(nUser);
        return user;
    }
    
    public List<FilmeEntity> allFilmesByUser(){
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println("Filmes: " + user.getFilmes());
        return user.getFilmes();
    }
    
    public UserEntity atualizarFilme(FilmeEntity filme){
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
