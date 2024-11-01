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
    
    public Boolean cadastrarCandidato(CandidatosEntity candidato){
        if(candidatosRepository.findByRg(candidato.getRg()) != null){
            return false;
        }
        candidato.setId(null);
        candidatosRepository.save(candidato);
        return true;
    }
    
    public List<CandidatosEntity> findByVaga(VagasEntity vaga){
        List<CandidatosEntity> candidatos = candidatosRepository.findByVaga(vaga);
        return candidatos;
    }
    
    public CandidatosEntity findByRg(int rg){
        CandidatosEntity candidatos = candidatosRepository.findByRg(rg);
        return candidatos;
    }
    
    public void deleteCandidato(CandidatosEntity candidato){
        candidatosRepository.delete(candidato);
    }
}
