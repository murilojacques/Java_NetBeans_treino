/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.Dto;

import lombok.Data;

/**
 *
 * @author Murilo
 */
@Data
public class AuthResponseDto {
    private String accessToken = "a";
    private String tokenType = "Bearer ";
    
    public AuthResponseDto(String accessToken){
        this.accessToken = accessToken;
    }

    
    
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
    
    
}
