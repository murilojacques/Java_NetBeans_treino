/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho02.projetoRH.service;

import com.projetinho02.projetoRH.data.FuncionariosEntity;
import com.projetinho02.projetoRH.data.FuncionariosRepository;
import com.projetinho02.projetoRH.exceptions.ResourceNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class FuncionariosService {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    
    public FuncionariosEntity cadastrarFuncionario(FuncionariosEntity func) {
        func.setId(null);
        func.setDependentes(null);
        funcionariosRepository.save(func);
        return func;
    }

    
    public FuncionariosEntity findById(Long id) {
        return funcionariosRepository.findById(id).orElseThrow(() -> {
            return new ResourceNotFoundException("funcionario não Encontrado");
        });
    }

    
    public List<FuncionariosEntity> findAllFuncionarios() {
        List<FuncionariosEntity> funcs = funcionariosRepository.findAll();
        return funcs;
    }

    
    public void deletarFunc(Long id) {
        funcionariosRepository.deleteById(id);
    }

    
    public void atualizarFuncionario(Long id, FuncionariosEntity newFunc) {
        FuncionariosEntity func = this.findById(id);
        
        func.setNome(newFunc.getNome());
        func.setIdade(newFunc.getIdade());
        func.setEmail(newFunc.getEmail());
        func.setCpf(newFunc.getCpf());
        
        funcionariosRepository.save(func);
    }
}
