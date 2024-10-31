/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho02.projetoRH.controller;

import com.projetinho02.projetoRH.service.CandidatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Murilo
 */
@Controller
public class CandidatosController {
    
    @Autowired
    private CandidatosService candidatosService;
    
    
    
}
