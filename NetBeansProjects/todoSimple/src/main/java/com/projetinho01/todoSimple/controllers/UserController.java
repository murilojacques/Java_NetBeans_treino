/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho01.todoSimple.controllers;

import com.projetinho01.todoSimple.data.UserEntity;
import com.projetinho01.todoSimple.data.dto.UserCreateDTO;
import com.projetinho01.todoSimple.data.dto.UserUpdateDTO;
import com.projetinho01.todoSimple.services.TaskService;
import com.projetinho01.todoSimple.services.UserService;
import jakarta.validation.Valid;
import java.net.URI;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author Murilo
 */
@RestController
@RequestMapping("/user")
@Validated
public class UserController {
    
    @Autowired
    private UserService userService;
    
    //@Autowired
    //private TaskService taskService;
    
    
    //localhost:8080/user/Get/{id}
    @GetMapping("/get/{id}")
    public ResponseEntity<UserEntity> findById(@PathVariable Long id){
        UserEntity user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }
    
    
    @PostMapping
    public ResponseEntity<Void> createUser(@Valid @RequestBody UserCreateDTO user){
        UserEntity newUser = this.userService.fromDTO(user);
        this.userService.createUser(newUser);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newUser.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Long id, @Valid @RequestBody UserUpdateDTO user){
        user.setId(id);
        UserEntity upUser = this.userService.fromDTO(user);
        this.userService.updateUser(upUser);
        return ResponseEntity.noContent().build();
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        this.userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
