/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.controller;

import com.api.atividade4.Dto.AuthResponseDto;
import com.api.atividade4.Dto.LoginDto;
import com.api.atividade4.Dto.RegisterDto;
import com.api.atividade4.data.AnaliseRepository;
import com.api.atividade4.data.FilmeRepository;
import com.api.atividade4.data.RoleRepository;
import com.api.atividade4.data.RolesEntity;
import com.api.atividade4.data.UserEntity;
import com.api.atividade4.data.UserFilmeRepository;
import com.api.atividade4.data.UserRepository;
import com.api.atividade4.security.JWTGenerator;
import com.api.atividade4.service.AnaliseService;
import com.api.atividade4.service.FilmeService;
import com.api.atividade4.service.UserFilmeService;
import com.api.atividade4.service.UserService;
import java.util.Collection;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
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
@Primary
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final JWTGenerator jwtGenerator;
    
    
    @Autowired
    private FilmeService filmeService;
    
    @Autowired
    private AnaliseService analiseService;
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserFilmeService userFilmeService;
    
    @Autowired
    private UserFilmeRepository userFilmeRepository;
    
    private final filmesController filmesCon;
    
    @Autowired
    private FilmeRepository filmeRepository;
    
    @Autowired
    private AnaliseRepository analiseRepository;
    
    @Autowired
    public AuthController(AuthenticationManager authenticationManager, UserRepository userRepository, RoleRepository roleRepository,
            PasswordEncoder passwordEncoder, JWTGenerator jwtGenerator) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.userService = new UserService(userRepository);
        this.filmesCon = new filmesController(filmeService, analiseService, userService, userFilmeService);
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtGenerator = jwtGenerator;
    }
    
    /**
     *
     * @param loginDto
     * @param model
     * @return
     */
  
    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, 
  produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ModelAndView login(LoginDto loginDto, Model model){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtGenerator.generateToken(authentication);
        
        System.out.println("Token: " + token);
        
        
        //System.out.println("Username2: " + SecurityContextHolder.getContext().getAuthentication().getName());
        
        UserEntity user = userRepository.findByUsername(loginDto.getUsername()).orElse(null);
        
        if(token != null && user != null){
           return filmesCon.pagListaFilmes("claro", model, SecurityContextHolder.getContext().getAuthentication().getName(), userFilmeRepository, filmeRepository, analiseRepository);
        }
        else{
            return filmesCon.pagLogin("claro", "Falha ao realizar o Login, por favor verifique se os dados foram inseridos corretamente", "alert alert-success alert-danger");
        }
        
        //return new ResponseEntity<>(new AuthResponseDto(token), HttpStatus.OK);
    }
    
    
    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, 
  produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ModelAndView register(RegisterDto registerDto, Model model, RedirectAttributes attribute){
        
        if(userRepository.existsByUsername(registerDto.getUsername())){
            return filmesCon.pagCriarConta("claro", model, "Falha ao cadastrar Funcionario, verifique os campos", "alert alert-success alert-danger", attribute);
            //return new ResponseEntity("username is taken!", HttpStatus.BAD_REQUEST);
        }
        
        if(!userRepository.existsByUsername(registerDto.getUsername())){
            RolesEntity roles = roleRepository.findByName("USER").get();
            String password = passwordEncoder.encode((registerDto.getPassword()));
            userService.cadastrarUser(registerDto.getUsername(), password, roles);
            return filmesCon.pagCriarConta("claro", model, "Successo ao Cadastrar Usuario", "alert alert-success alert-dismissible", attribute);
            //return new ResponseEntity<>("User Registered Success", HttpStatus.OK); 
        }
        
        else{
            return filmesCon.pagCriarConta("claro", model, "Falha ao cadastrar Funcionario, verifique os campos", "alert alert-success alert-danger", attribute);
            //return new ResponseEntity<>("Foi de ralo", HttpStatus.BAD_REQUEST); 
        }
        
    }
    
}
