/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.projetoIntegrador.service;

import com.api.projetoIntegrador.data.TransacaoEntity;
import com.api.projetoIntegrador.data.TransacaoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class TransacaoService {
    
    @Autowired
    TransacaoRepository transacaoRepository;
    
    
    public TransacaoEntity cadastrarTransacao(TransacaoEntity transacao){
        
        transacao.setId(null);
        transacaoRepository.save(transacao);
        return transacao;
    }
    
    
    
    public List<TransacaoEntity> ListarTransacoes(){
        List<TransacaoEntity> transacoes = transacaoRepository.findAll();
        return transacoes;
    }
    
    
    
    public TransacaoEntity buscarTransacaoById(Integer id){   
        return transacaoRepository.findById(id).orElse(null);
    }
}
