/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho01.todoSimple.services;

import com.projetinho01.todoSimple.data.TaskEntity;
import com.projetinho01.todoSimple.data.TaskRepository;
import com.projetinho01.todoSimple.data.UserEntity;
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
public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;
    
    @Autowired
    private UserService userService;
    
    
    @Transactional
    public TaskEntity findById(Long id){
        Optional<TaskEntity> task = this.taskRepository.findById(id);
        return task.orElseThrow(() -> new RuntimeException(
                "Tarefa não encontrada! Id: " + id + ", Tipo: " + TaskEntity.class.getName()
        ));
    }
    
    
    public List<TaskEntity> findAllTasks(){
        List<TaskEntity> tasks = taskRepository.findAll();
        return tasks;
    }
    
    public List<TaskEntity> findAllTasksByUserId(Long userId){
        List<TaskEntity> tasks = taskRepository.findByUser_Id(userId);
        return tasks;
    }
    
    
    @Transactional
    public TaskEntity createTask(TaskEntity task){
        
        UserEntity user = userService.findById(task.getUser().getId());
        if(user != null){
            task.setId(null);
            task.setUser(user);
            task = this.taskRepository.save(task);
        }   
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
            throw new RuntimeException("Não é possivel excluir, pois há entidade relacionadas!");
        }
    }
}
