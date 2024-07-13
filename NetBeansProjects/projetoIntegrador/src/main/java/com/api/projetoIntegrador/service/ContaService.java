/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.projetoIntegrador.service;

import com.api.projetoIntegrador.data.ContaEntity;
import com.api.projetoIntegrador.data.ContaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class ContaService {
    
    @Autowired
    ContaRepository contaRepository;
    
    
    public ContaEntity cadastrarConta(ContaEntity conta){
        conta.setId(null);
        contaRepository.save(conta);
        return conta;
    }
    
    
    
    public List<ContaEntity> ListarContas(){
        List<ContaEntity> contas = contaRepository.findAll();
        return contas;
    }
    
    
    
    public ContaEntity buscarContaById(Integer id){
        return contaRepository.findById(id).orElse(null);
    }
}
