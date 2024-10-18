/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho01.todoSimple.data.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Murilo
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserUpdateDTO {
    
    private Long id;
    
    @NotBlank
    @Size(min = 8, max = 100)
    private String password;
}
