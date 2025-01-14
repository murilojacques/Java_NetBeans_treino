/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 *
 * @author Murilo
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    private final JwtAuthEntryPoint authEntryPoint;
    private final CustomUserDetailsService userDetailsService;
    private AuthenticationConfiguration auth;
    
    @Autowired
    public SecurityConfig(CustomUserDetailsService userDetailsService, JwtAuthEntryPoint authEntryPoint) {
        this.userDetailsService = userDetailsService;
        this.authEntryPoint = authEntryPoint;
    }
    
    
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .csrf((csrf) -> {
                    csrf.disable();
                })
                .exceptionHandling((exception) -> {
                    exception.authenticationEntryPoint(authEntryPoint);
                })
                //.authenticationManager(authenticationManager(auth))
                //.cors((cors) -> {
                    //cors.disable();
                //})
                .sessionManagement((session) -> {
                    session.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
                })
                .authorizeHttpRequests((authorize) -> {
                    authorize
                            .requestMatchers("/api/auth/**").permitAll()
                            .requestMatchers("/").permitAll()
                            .requestMatchers("/**").permitAll()
                            .anyRequest().authenticated();
                });
        
        http.addFilterBefore(jWTAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
        
        return http.build();
    }
    
   
    
    
  //Quando o Custom UserDetailsService for criado apaga ou torna o UserDetailsService abaixo um Comentario para não dar conflito e bugar tudo  
  /**
     * @param authenticationConfiguration *   @Bean
    public UserDetailsService users(){
        UserDetails admin = User.builder()
                .username("admin")
                .password("password")
                .roles("ADMIN")
                .build();
        
        UserDetails user = User.builder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        
        return new InMemoryUserDetailsManager(admin, user);
    }
     * @return 
     * @throws java.lang.Exception
  **/
    
    
    
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
         return authenticationConfiguration.getAuthenticationManager();
    }
    
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    
    @Bean
    public JWTAuthenticationFilter jWTAuthenticationFilter(){
        return new JWTAuthenticationFilter();
    }
}
