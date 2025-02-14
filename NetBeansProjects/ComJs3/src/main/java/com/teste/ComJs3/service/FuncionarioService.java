/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.ComJs3.service;

import com.teste.ComJs3.data.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Murilo
 */
public class FuncionarioService {
    
    @Autowired
    FuncionarioRepository funcionarioRepository;
}
