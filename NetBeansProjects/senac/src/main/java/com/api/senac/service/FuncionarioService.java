/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.senac.service;

import com.api.senac.data.FuncionarioEntity;
import com.api.senac.data.FuncionarioRepository;
import com.api.senac.exception.ResourceNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class FuncionarioService {

    @Autowired

    FuncionarioRepository funcionarioRepository;

    public FuncionarioEntity criarFuncionario(FuncionarioEntity func) {

        func.setId(null);

        funcionarioRepository.save(func);

        return func;

    }

    public FuncionarioEntity atualizarFuncionario(Integer funcId, FuncionarioEntity funcionarioRequest) {

        FuncionarioEntity func = getFuncionarioId(funcId);

        func.setNome(funcionarioRequest.getNome());

        func.setCpf(funcionarioRequest.getCpf());

        func.setTelefone(funcionarioRequest.getTelefone());

        func.setEmail(funcionarioRequest.getEmail());

        func.setSalario(funcionarioRequest.getSalario());

        funcionarioRepository.save(func);

        return func;

    }

    public FuncionarioEntity getFuncionarioId(Integer funcId) {

        return funcionarioRepository.findById(funcId).orElseThrow(()-> new ResourceNotFoundException("Funcionario não encontrado "+funcId));

    }

    public List<FuncionarioEntity> listarTodosFuncionarios() {
        return funcionarioRepository.findAll();

    }

    public void deletarFuncionario(Integer funcId) {

        FuncionarioEntity func = getFuncionarioId(funcId);

        funcionarioRepository.deleteById(func.getId());

    }

}
