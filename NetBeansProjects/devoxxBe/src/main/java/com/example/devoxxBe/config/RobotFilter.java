/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.devoxxBe.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 *
 * @author Murilo
 */
public class RobotFilter extends OncePerRequestFilter{
    
    private final String HEADER_NAME = "x-robot-password";
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //0. Should execute the filter?
        if(!Collections.list(request.getHeaderNames()).contains(HEADER_NAME)){
            filterChain.doFilter(request, response);
            return;
        }
        

        //1. Authentication Decision
        var password = request.getHeader(HEADER_NAME);
        
        if(!"beep-boop".equals(password)){
            System.out.println("Paia");
            response.setStatus(HttpStatus.FORBIDDEN.value());
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-type", "text/plain;charset=utf-8");
            response.getWriter().print("You are not Mr.Robot");
            return;
        }
        
        
        //2. Do the Rest
        System.out.println("OK");
        var newContext = SecurityContextHolder.createEmptyContext();
        newContext.setAuthentication(new RobotAuthentication());
        SecurityContextHolder.setContext(newContext);
        filterChain.doFilter(request, response);
        return;
        //filterChain.doFilter(request, response);
    }
    
}
