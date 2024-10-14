/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho01.todoSimple.controllers;

import com.projetinho01.todoSimple.data.TaskEntity;
import com.projetinho01.todoSimple.services.TaskService;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author Murilo
 */
@RestController
@RequestMapping("/task")
@Validated
public class TaskController {
    
    @Autowired
    private TaskService taskService;
    
    
    @GetMapping("/get/{id}")
    public ResponseEntity<TaskEntity> findById(@Valid @PathVariable Long id){
        TaskEntity task = taskService.findById(id);
        return ResponseEntity.ok().body(task);
    }
    
    @GetMapping("/getAllTasksByUser/{userId}")
    public ResponseEntity<List<TaskEntity>> findAllTasksByUser(@PathVariable Long userId){
        List<TaskEntity> tasks = taskService.findAllTasksByUserId(userId);
        return ResponseEntity.ok().body(tasks);
    }
    
    
    @PostMapping("/post")
    @Validated
    public ResponseEntity<Void> createTask(@Valid @RequestBody TaskEntity task){
        this.taskService.createTask(task);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(task.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateTask(@Valid @RequestBody TaskEntity task, @PathVariable Long id){
        task.setId(id);
        taskService.updateTask(task);
        return ResponseEntity.noContent().build();
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}
