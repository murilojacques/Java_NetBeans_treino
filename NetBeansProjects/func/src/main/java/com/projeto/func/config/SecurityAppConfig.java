/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.func.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 *
 * @author Murilo
 */
@Configuration
@EnableWebSecurity()
public class SecurityAppConfig {
   
    /* 
    @Autowired
    private UserDetailsService userDetailsService;
    */
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(request -> request
                        .requestMatchers("/a")
                        .permitAll()
                        .anyRequest().authenticated())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session -> 
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }

    @Bean
    public InMemoryUserDetailsManager setUpUser() {
        ArrayList<GrantedAuthority> authoritiesList = new ArrayList<>();
        
        authoritiesList.add(new SimpleGrantedAuthority("ADMIN"));
        authoritiesList.add(new SimpleGrantedAuthority("USER"));
        authoritiesList.add(new SimpleGrantedAuthority("VISITOR"));
        
        UserDetails user1 = new User("Murilo", "456", authoritiesList);
        
        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();
        inMemoryUserDetailsManager.createUser(user1);
        
        return inMemoryUserDetailsManager;
    }
    
    
    /*@Bean
    public UserDetailsService userDetailsService(){
        
        UserDetails user1 = User
                .withDefaultPasswordEncoder()
                .username("Hammer")
                .password("456")
                .roles("USER")
                .build();
        
        UserDetails user2 = User
                .withDefaultPasswordEncoder()
                .username("Screwdriver")
                .password("789")
                .roles("ADMIN")
                .build();
        
        return new InMemoryUserDetailsManager(user1, user2);
    }*/
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

}
