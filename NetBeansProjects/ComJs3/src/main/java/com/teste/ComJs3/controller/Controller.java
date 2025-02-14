/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.ComJs3.controller;

import com.teste.ComJs3.service.EmpresaService;
import com.teste.ComJs3.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Murilo
 */
public class Controller {
    
    @Autowired
    EmpresaService empresaService;
    
    @Autowired
    FuncionarioService funcionarioService;
}
