/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.projetinho01.todoSimple.data;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author Murilo
 */
@AllArgsConstructor
@Getter
public enum ProfileEnum {
    
    ADMIN(1, "ROLE_ADMIN"),
    USER(2, "ROLE_USER");
    
    private Integer code;
    private String description;
    
    public static ProfileEnum toEnum(Integer code){
        if(Objects.isNull(code)){
            return null;
        }
        for(ProfileEnum x : ProfileEnum.values()){
            if(code == x.getCode()){
                return x;
            }
        }
        
        throw new IllegalArgumentException("Invalid code" + code);
    }
}
