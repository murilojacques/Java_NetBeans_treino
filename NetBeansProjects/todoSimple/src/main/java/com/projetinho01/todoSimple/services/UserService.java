/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho01.todoSimple.services;

import com.projetinho01.todoSimple.Security.UserSpringSecurity;
import com.projetinho01.todoSimple.data.ProfileEnum;
import com.projetinho01.todoSimple.data.TaskEntity;
import com.projetinho01.todoSimple.data.TaskRepository;
import com.projetinho01.todoSimple.data.UserEntity;
import com.projetinho01.todoSimple.data.UserRepository;
import com.projetinho01.todoSimple.exceptions.AuthorizationException;
import com.projetinho01.todoSimple.services.exceptions.DataBindingViolationException;
import com.projetinho01.todoSimple.services.exceptions.ObjectNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Murilo
 */
@Service
public class UserService {
    
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private TaskRepository taskRepository;
    
    
    @Transactional
    public UserEntity createUser(UserEntity user){
        user.setId(null);
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
        user.setProfiles(Stream.of(ProfileEnum.USER.getCode()).collect(Collectors.toSet()));
        user = this.userRepository.save(user);
        return user;
    }
    
    
    @Transactional
    public UserEntity updateUser(UserEntity user){
        UserEntity newObj = findById(user.getId());
        newObj.setPassword(user.getPassword());
        newObj.setPassword(this.bCryptPasswordEncoder.encode(newObj.getPassword()));
        return this.userRepository.save(newObj);
    }
    
    
    public UserEntity findById(Long id){
        UserSpringSecurity userSpringSecurity = authenticated();
        if(!Objects.nonNull(userSpringSecurity) || !userSpringSecurity.hasRole(ProfileEnum.ADMIN) && !id.equals(userSpringSecurity.getId())){
            throw new AuthorizationException("Acesso Negado!");
        }
        Optional<UserEntity> user = this.userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException(
                "Usuario não Encontrado! Id: " + id + ", Tipo: " + UserEntity.class.getName()
        ));
    }
    
    
    public List<UserEntity> findAllUsers(){
        List<UserEntity> users = userRepository.findAll();
        return users;
    }
    
    
    public void deleteUser(Long id){
        findById(id);
        try{
            List<TaskEntity> tasks = taskRepository.findByUser_Id(id);
            for(TaskEntity task : tasks){
                taskRepository.delete(task);
            }
            this.userRepository.deleteById(id);
        }
        catch(Exception e){
            throw new DataBindingViolationException("Não é possivel excluir, pois há entidade relacionadas!");
        }
    }
    
    
    public static UserSpringSecurity authenticated(){
        try{
            return (UserSpringSecurity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch(Exception e){
            return null;
        }
    }
}
