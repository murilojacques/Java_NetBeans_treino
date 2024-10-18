/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho01.todoSimple.services;

import com.projetinho01.todoSimple.Security.UserSpringSecurity;
import com.projetinho01.todoSimple.data.ProfileEnum;
import com.projetinho01.todoSimple.data.Projection.TaskProjection;
import com.projetinho01.todoSimple.data.TaskEntity;
import com.projetinho01.todoSimple.data.TaskRepository;
import com.projetinho01.todoSimple.data.UserEntity;
import com.projetinho01.todoSimple.exceptions.AuthorizationException;
import com.projetinho01.todoSimple.services.exceptions.DataBindingViolationException;
import com.projetinho01.todoSimple.services.exceptions.ObjectNotFoundException;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Murilo
 */
@Service
public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;
    
    @Autowired
    private UserService userService;
    
    
    @Transactional
    public TaskEntity findById(Long id){
        TaskEntity task = this.taskRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(
                "Tarefa não encontrada! Id: " + id + ", Tipo: " + TaskEntity.class.getName()));
        
        UserSpringSecurity userSpringSecurity = UserService.authenticated();
        if(Objects.isNull(userSpringSecurity) || !userSpringSecurity.hasRole(ProfileEnum.ADMIN) && !userHasTask(userSpringSecurity, task)){
            throw new AuthorizationException("Acesso Negado!");
        }
        return task;
    }
    
    
    public List<TaskEntity> findAllTasks(){
        List<TaskEntity> tasks = taskRepository.findAll();
        return tasks;
    }
    
    public List<TaskProjection> findAllTasksByUser(){
        UserSpringSecurity userSpringSecurity = UserService.authenticated();
        if(Objects.isNull(userSpringSecurity)){
            throw new AuthorizationException("Acesso Negado!");
        }
        List<TaskProjection> tasks = taskRepository.findByUser_Id(userSpringSecurity.getId());
        return tasks;
    }
    
    
    @Transactional
    public TaskEntity createTask(TaskEntity task){
        
        UserSpringSecurity userSpringSecurity = UserService.authenticated();
        if(Objects.isNull(userSpringSecurity)){
            throw new AuthorizationException("Acesso Negado!");
        }
        
        UserEntity user = this.userService.findById(userSpringSecurity.getId());
        task.setId(null);
        task.setUser(user);
        task = this.taskRepository.save(task); 
        return task;
    }
    
    
    public TaskEntity updateTask(TaskEntity task){
        TaskEntity newObj = findById(task.getId());
        newObj.setDescription(task.getDescription());
        return this.taskRepository.save(newObj);
    }
    
    
    public void deleteTask(Long id){
        findById(id);
        try{
            taskRepository.deleteById(id);
        }
        catch(Exception e){
            throw new DataBindingViolationException("Não é possivel excluir, pois há entidade relacionadas!");
        }
    }
    
    
    public boolean userHasTask(UserSpringSecurity userSpringSecurity, TaskEntity task){
        return task.getUser().getId().equals(userSpringSecurity.getId());
    }
}
