/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho01.todoSimple.services;

import com.projetinho01.todoSimple.data.TaskEntity;
import com.projetinho01.todoSimple.data.TaskRepository;
import com.projetinho01.todoSimple.data.UserEntity;
import com.projetinho01.todoSimple.data.UserRepository;
import com.projetinho01.todoSimple.services.exceptions.DataBindingViolationException;
import com.projetinho01.todoSimple.services.exceptions.ObjectNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Murilo
 */
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private TaskRepository taskRepository;
    
    
    @Transactional
    public UserEntity createUser(UserEntity user){
        user.setId(null);
        user = this.userRepository.save(user);
        return user;
    }
    
    
    @Transactional
    public UserEntity updateUser(UserEntity user){
        UserEntity newObj = findById(user.getId());
        newObj.setPassword(user.getPassword());
        return this.userRepository.save(newObj);
    }
    
    
    public UserEntity findById(Long id){
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
}
