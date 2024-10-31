/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho02.projetoRH.service;

import com.projetinho02.projetoRH.data.CandidatosEntity;
import com.projetinho02.projetoRH.data.CandidatosRepository;
import com.projetinho02.projetoRH.data.VagasEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class CandidatosService {
    
    @Autowired
    private CandidatosRepository candidatosRepository;
    
    public List<CandidatosEntity> findByVaga(VagasEntity vaga){
        List<CandidatosEntity> candidatos = candidatosRepository.findByVaga(vaga);
        return candidatos;
    }
}
