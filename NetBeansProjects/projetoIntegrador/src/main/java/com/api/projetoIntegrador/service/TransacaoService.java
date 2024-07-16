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
    
    
    public TransacaoEntity cadastrarTransacao(TransacaoEntity transacao, int Conta_Origem_Id){
        
        transacao.setId(null);
        transacao.setContaOrigemId(Conta_Origem_Id);
        transacao.setAlteracao_conta("Deposito");
        transacaoRepository.save(transacao);
        
        //TransacaoEntity t = new TransacaoEntity();
        //t.setId(null);
        //t.setConta_destino_id(transacao.getConta_destino_id());
        //t.setContaOrigemId(transacao.getContaOrigemId());
        //t.setValor(transacao.getValor());
        //t.setAlteracao_conta("Recebido");
        //transacaoRepository.save(t);
        
        return transacao;
    }
    
    
    
    public List<TransacaoEntity> ListarTransacoes(){
        List<TransacaoEntity> transacoes = transacaoRepository.findAll();
        return transacoes;
    }
    
    
   public List<TransacaoEntity> ListarTransacoesPorId(int conta_origem_id){
        List<TransacaoEntity> transacoes = transacaoRepository.findByContaOrigemId(conta_origem_id);
        return transacoes;
    }
    
    
    public TransacaoEntity buscarTransacaoById(Integer id){   
        return transacaoRepository.findById(id).orElse(null);
    }
}
