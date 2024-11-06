/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho02.projetoRH.service;

import com.projetinho02.projetoRH.data.DependentesEntity;
import com.projetinho02.projetoRH.data.DependentesRepository;
import com.projetinho02.projetoRH.data.FuncionariosEntity;
import com.projetinho02.projetoRH.exceptions.ResourceNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class DependentesService {
    
    @Autowired
    private DependentesRepository dependentesRepository;
    
    
    public DependentesEntity cadastrarDependente(DependentesEntity denp, FuncionariosEntity func_id){
        denp.setId(null);
        denp.setFuncionarioId(func_id);
        dependentesRepository.save(denp);
        return denp;
    }
    
    public DependentesEntity findById(Long id) {
        return dependentesRepository.findById(id).orElseThrow(() -> {
            return new ResourceNotFoundException("funcionario não Encontrado");
        });
    }

    
    public List<DependentesEntity> findAllDependentes() {
        List<DependentesEntity> denps = dependentesRepository.findAll();
        return denps;
    }
    
    public void deletarDenp(Long id) {
        dependentesRepository.deleteById(id);
    }

    public Object findAllDependentesByFuncId(FuncionariosEntity func) {
        List<DependentesEntity> denps = dependentesRepository.findByFuncionarioId(func);
        return denps;
    }
}
