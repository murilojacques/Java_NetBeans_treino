/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.comJs4.service;

import com.teste.comJs4.data.EmpresaEntity;
import com.teste.comJs4.data.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.comJs4.data.FuncionarioEntity;

/**
 *
 * @author Murilo
 */
@Service
public class FuncionarioService {
    
    @Autowired
    FuncionarioRepository funcionarioRepository;
    
    
    public void salvarFuncionario(FuncionarioEntity funcionario){
        funcionarioRepository.save(funcionario);
    }

    public void adicionarEmpregador(EmpresaEntity empresa, FuncionarioEntity func) {
        func.setEmpregador(empresa);
        funcionarioRepository.save(func);
    }
}
