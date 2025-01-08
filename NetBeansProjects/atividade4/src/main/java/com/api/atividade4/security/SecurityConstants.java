/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.security;

import io.jsonwebtoken.security.Keys;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.SecretKey;

/**
 *
 * @author Murilo
 */
public class SecurityConstants {
    public static final long JWT_EXPIRATION = 70000;
    
    public static final String JWT_SECRET = "secretKeyofThisApplicationforSecurityReasons";
    public static final SecretKey KEY = Keys.hmacShaKeyFor(JWT_SECRET.getBytes(StandardCharsets.UTF_8));
    
}
