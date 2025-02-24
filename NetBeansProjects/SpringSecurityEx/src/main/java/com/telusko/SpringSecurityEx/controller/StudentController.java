/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telusko.SpringSecurityEx.controller;

import com.telusko.SpringSecurityEx.data.StudentEntity;
import jakarta.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import org.apache.coyote.http11.Http11InputBuffer;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Murilo
 */
@RestController
public class StudentController {
    
    private List<StudentEntity> students = new ArrayList<>(List.of(
            new StudentEntity(1, "Murilo", 10),
            new StudentEntity(2, "Joao", 4),
            new StudentEntity(3, "Pedro", 8),
            new StudentEntity(4, "Marcos", 7)
    ));
    
    @GetMapping("/students")
    public List<StudentEntity> Students(){
        return students;
    } 
    
    @PostMapping("/students")
    public StudentEntity addStudent(@RequestBody StudentEntity student){
        students.add(student);
        return student;
    }
    
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
       return (CsrfToken)request.getAttribute("_csrf");
    }
}
