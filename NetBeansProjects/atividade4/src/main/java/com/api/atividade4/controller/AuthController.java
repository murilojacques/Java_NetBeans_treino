/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.controller;

import com.api.atividade4.Dto.AuthResponseDto;
import com.api.atividade4.Dto.LoginDto;
import com.api.atividade4.Dto.RegisterDto;
import com.api.atividade4.data.RoleRepository;
import com.api.atividade4.data.RolesEntity;
import com.api.atividade4.data.UserEntity;
import com.api.atividade4.data.UserRepository;
import com.api.atividade4.security.JWTGenerator;
import java.util.Collection;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Murilo
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final JWTGenerator jwtGenerator;
    private filmesController filmesCon;
    
    @Autowired
    public AuthController(AuthenticationManager authenticationManager, UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder, JWTGenerator jwtGenerator) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtGenerator = jwtGenerator;
    }
    
    /**
     *
     * @param loginDto
     * @return
     */
  
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AuthResponseDto> login(@RequestBody LoginDto loginDto, Model model){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);
        System.out.println("Token: " + token);
        UserEntity user = userRepository.findByUsername(loginDto.getUsername()).orElse(null);
        
        if(token != null && user != null){
            System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
            filmesCon.pagListaFilmes("claro", model);
        }
        
        return new ResponseEntity<>(new AuthResponseDto(token), HttpStatus.OK);
    }
    
    
    @PostMapping("register")
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto, Model model, RedirectAttributes attribute){
        if(userRepository.existsByUsername(registerDto.getUsername())){
            filmesCon.pagCriarConta("claro", model, "Falha ao cadastrar Funcionario, verifique os campos", "alert alert-success alert-danger", attribute);
            return new ResponseEntity("username is taken!", HttpStatus.BAD_REQUEST);
        }
        
        if(!userRepository.existsByUsername(registerDto.getUsername())){
            UserEntity user = new UserEntity();
         user.setUsername(registerDto.getUsername());
         user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
         user.setAnalises(null);
         user.setFilmes(null);
         RolesEntity roles = roleRepository.findByName("USER").get();
         user.setRoles(Collections.singletonList(roles));

         userRepository.save(user);
         filmesCon.pagCriarConta("claro", model, "Successo ao Cadastrar Usuario", "alert alert-success alert-dismissible", attribute);
         return new ResponseEntity<>("User Registered Success", HttpStatus.OK); 
        }
        
        else{
            filmesCon.pagCriarConta("claro", model, "Falha ao cadastrar Funcionario, verifique os campos", "alert alert-success alert-danger", attribute);
            return new ResponseEntity<>("Foi de ralo", HttpStatus.BAD_REQUEST); 
        }
        
    }
    
    
}
