/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho01.todoSimple.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Murilo
 */
@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class AuthorizationException extends AccessDeniedException{
        
    public AuthorizationException(String message) {
        super(message);
    }
        
}
