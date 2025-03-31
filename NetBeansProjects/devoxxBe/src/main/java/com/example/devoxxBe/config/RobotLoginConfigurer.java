/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.devoxxBe.config;

import java.util.ArrayList;
import java.util.List;
import static org.springframework.boot.webservices.client.WebServiceMessageSenderFactory.http;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import static org.springframework.security.config.web.server.ServerHttpSecurity.http;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

/**
 *
 * @author Murilo
 */
public class RobotLoginConfigurer extends AbstractHttpConfigurer<RobotLoginConfigurer, HttpSecurity>{
    
    private final List<String> passwords = new ArrayList<>();
    
    @Override
    public void init(HttpSecurity http) throws Exception {
        
        //step 1
        //Initializes a bunch of objects
        // -> AuthenticationProviders
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        http.authenticationProvider(new RobotAuthenticationProvider(passwords));
    }
    

    @Override
    public void configure(HttpSecurity http) throws Exception {
        //step 2
        //this also initializes objects but can reuse object from step 1, even from other configurers
        // -> filters
        var authenticationManager = http.getSharedObject(AuthenticationManager.class);
        http.addFilterBefore(new RobotFilter(authenticationManager), FilterSecurityInterceptor.class);
    }

    public RobotLoginConfigurer password(String password){
        this.passwords.add(password);
        return this;
    }
}
