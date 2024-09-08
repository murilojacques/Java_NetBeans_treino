/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.projeto01.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.projeto01.data.lutadoresEntity;
import com.api.projeto01.data.lutadoresRepository;

/**
 *
 * @author Murilo
 */
@Service
public class lutadoresService {
    @Autowired
    lutadoresRepository lutadoresRepository;
    
    
    public lutadoresEntity CadastrarLutador(lutadoresEntity l){
        float peso = Float.parseFloat(l.getPeso());
        System.out.println(peso);
        l.setId(null);
        l.setVitorias(0);
        l.setDerrotas(0);
        l.setEmpates(0);
        if(peso > 52.2 && peso <= 70.3){
            l.setCategoria("Peso leve");
            lutadoresRepository.save(l);
        }
        else if(peso > 70.3 && peso <= 83.9){
            l.setCategoria("Peso Medio");
            lutadoresRepository.save(l);
        }
        else if(peso > 83.9 && peso <= 120.2){
            l.setCategoria("Peso Pesado");
            lutadoresRepository.save(l);
        }
        return l;
    }
    
    
    public lutadoresEntity BuscarPorId(int id){
        lutadoresEntity lutador = lutadoresRepository.findById(id).orElse(null);
        return lutador;
    }
    
    public List<lutadoresEntity> ListaLutadores(){
        List<lutadoresEntity> lutadores = lutadoresRepository.findAll();
        return lutadores;
    }
    
    public void Atualizar(lutadoresEntity lutador){
        //lutadoresEntity lutador = BuscarPorId(l.getId());
        lutadoresRepository.save(lutador);
    }
}
