/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.projeto01.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.projeto01.data.lutaEntity;
import com.api.projeto01.data.lutaRepository;

/**
 *
 * @author Murilo
 */
@Service
public class lutaService {
    @Autowired
    lutaRepository lutaRepository;
    
    
    public lutaEntity MarcarLuta(lutaEntity ml){
        ml.setId(null);
        lutaRepository.save(ml);
        return ml;
    }
    
    public lutaEntity BuscarPorId(int id){
        lutaEntity luta = lutaRepository.findById(id).orElse(null);
        return luta;
    }
    
    public List<lutaEntity> ListaLutas(){
        List<lutaEntity> lutas = lutaRepository.findAll();
        return lutas;
    }
    
    public void AtualizarLuta(lutaEntity luta){
        lutaRepository.save(luta);
    }
    
    public void DeletarPorLutador(int id_Lutador){
        List<lutaEntity> lutas = ListaLutas();
        for(lutaEntity luta : lutas){
            if(luta.getDesafiado_id() == id_Lutador || luta.getDesafiante_id() == id_Lutador){
                lutaRepository.deleteById(luta.getId());
            }
        }
    }
    
    public void DeletarLuta(int id){
        lutaRepository.deleteById(id);
    }
}
