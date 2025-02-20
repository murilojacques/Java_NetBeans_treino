/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.comJs4.service;

import com.teste.comJs4.data.EmpresaEntity;
import com.teste.comJs4.data.EmpresaRepository;
import com.teste.comJs4.data.FuncionarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Murilo
 */
@Service
public class EmpresaService {
    
    @Autowired
    EmpresaRepository empresaRepository;

    public void salvarEmpresa(EmpresaEntity empresa) {
        empresa.setId(null);
        empresaRepository.save(empresa);
    }
    
    
    public List<EmpresaEntity> getAllEmpresas() {
        List<EmpresaEntity> empresas = empresaRepository.findAll();
        return empresas;
    }

    public EmpresaEntity findEmpresaById(Integer id) {
        return empresaRepository.findById(id).orElse(null);
    }

    public void atualizarEmpresa(EmpresaEntity empresa, Integer id) {
        EmpresaEntity newEmpresa = empresaRepository.findById(id).orElse(null);
        
        newEmpresa.setNome(empresa.getNome());
        newEmpresa.setSalario(empresa.getSalario());
        newEmpresa.setEmailContato(empresa.getEmailContato());
        newEmpresa.setNumeroContato(empresa.getNumeroContato());
        newEmpresa.setDescricao(empresa.getDescricao());
        
        empresaRepository.save(newEmpresa);
    }

    public void deletarEmpresa(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void adicionarFuncionario(EmpresaEntity empresa, FuncionarioEntity func) {
        List<FuncionarioEntity> funcionarios = empresa.getFuncionarios();
        funcionarios.add(func);
        empresa.setFuncionarios(funcionarios);
        empresaRepository.save(empresa);
    }
}
