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
import java.util.List;

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

    public FuncionarioEntity cadastrarFuncionario(FuncionarioEntity func, EmpresaEntity empresa) {
        func.setId(null);
        func.setEmpregador(empresa);
        funcionarioRepository.save(func);
        return func;
    }

   /*
    void deletarFuncPorEmpresa(EmpresaEntity empresa) {
        List<FuncionarioEntity> funcs = empresa.getFuncionarios();
        
        for(FuncionarioEntity func : funcs){
            funcionarioRepository.delete(func);
        }
    }
*/

    public FuncionarioEntity findFuncionarioById(Integer id) {
        return funcionarioRepository.findById(id).orElse(null);
    }

    public void atualizarFuncionario(Integer id, FuncionarioEntity func) {
        FuncionarioEntity newFunc = funcionarioRepository.findById(id).orElse(null);
        
        newFunc.setNome(func.getNome());
        newFunc.setIdade(func.getIdade());
        newFunc.setEmail(func.getEmail());
        newFunc.setExperiencia(func.getExperiencia());
        newFunc.setCpf(func.getCpf());
        
        funcionarioRepository.save(newFunc);
    }

    public void deletarFuncionario(FuncionarioEntity func) {
        funcionarioRepository.delete(func);
    }
}
