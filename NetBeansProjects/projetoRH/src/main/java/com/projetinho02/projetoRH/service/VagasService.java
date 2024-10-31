/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho02.projetoRH.service;

import com.projetinho02.projetoRH.data.VagasEntity;
import com.projetinho02.projetoRH.data.VagasRepository;
import com.projetinho02.projetoRH.exceptions.ResourceNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class VagasService {
    
    @Autowired
    private VagasRepository vagasRepository;
    
    
    public VagasEntity cadastrarVaga(VagasEntity vaga){
        vaga.setId(null);
        vagasRepository.save(vaga);
        return vaga;
    }
    
    
    public List<VagasEntity> findAllVagas(){
        List<VagasEntity> vagas = vagasRepository.findAll();
        return vagas;
    }
    
    public VagasEntity findById(Long id){
        return vagasRepository.findById(id).orElseThrow(() -> {
           return new ResourceNotFoundException("Vaga não encontrada");
        });
    }
}
