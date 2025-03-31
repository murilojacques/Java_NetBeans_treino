/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.devoxxBe.config;


import java.util.List;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpMessageConverterAuthenticationSuccessHandler.AuthenticationSuccess;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 *
 * @author Murilo
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, AuthenticationEventPublisher publisher) throws Exception{
        
        //Don't look
        {
        http.getSharedObject(AuthenticationManagerBuilder.class)
            .authenticationEventPublisher(publisher);
        }
        
        /*
        var authProvider = new RobotAuthenticationProvider(List.of("beep-boop", "beep-beep", "beep-bi-boop"));
        var authManager = new ProviderManager(authProvider);
        */
        //authManager.setAuthenticationEventPublisher(publisher);
        
        var configurer = new RobotLoginConfigurer()
                .password("beep-boop")
                .password("beep-beep")
                .password("beep-bi-boop");
        
        
        return http
                .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/").permitAll()
                    .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults())
                .with(configurer.password("aaa").password("bbb"), Customizer.withDefaults())
                //.addFilterBefore(new RobotFilter(authManager), UsernamePasswordAuthenticationFilter.class)
                .authenticationProvider(new MuriloAuthenticationProvider())
                .build();
    }
    
    @Bean
    public UserDetailsService userDetailsService(){
        return new InMemoryUserDetailsManager(
            User.builder()
                .username("murilo")
                .password("{noop}123")
                .roles("USER")
                .build()
        );
    }
    
    
    @Bean
    public ApplicationListener<AuthenticationSuccessEvent> successListener(){
        return event -> {
            System.out.println(String.format("SUCCESS [%s] %s", event.getAuthentication().getClass().getName(), event.getAuthentication().getName()));
        };
    }
}
