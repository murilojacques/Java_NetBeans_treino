/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.service;

import com.api.atividade4.data.AnaliseEntity;
import com.api.atividade4.data.AnaliseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class AnaliseService {
    
    @Autowired
            
    AnaliseRepository analiseRepository;
    
    
    public AnaliseEntity adicionarAnalise(AnaliseEntity analise){
        analise.setId(null);
        analiseRepository.save(analise);
        return analise;
    }
    
    
    
    public AnaliseEntity getAnaliseById(Integer analiseId){
        return analiseRepository.findById(analiseId).orElse(null);
    }
    
    public List<AnaliseEntity> getTodasAnalises(){
        return analiseRepository.findAll();
    }
    
    
    
    public AnaliseEntity atualizarAnalise(Integer analiseId, AnaliseEntity analiseAtualizacao){
        
        AnaliseEntity analise = getAnaliseById(analiseId);
        
        analise.setAnalise(analiseAtualizacao.getAnalise());
        analise.setNota(analiseAtualizacao.getNota());
        
        analiseRepository.save(analise);
        return analise;
    }
    
    public void DeletarAnalisesPorFilme(Integer filmeId){
        List<AnaliseEntity> analises = analiseRepository.findAll();
        for(AnaliseEntity analise : analises){
            if(analise.getFilme() == filmeId){
                deletarAnalise(analise.getId());
            }
        }
    } 
    
    public void deletarAnalise(Integer analiseId){
        AnaliseEntity analise = getAnaliseById(analiseId);
        analiseRepository.deleteById(analise.getId());
    }
}
