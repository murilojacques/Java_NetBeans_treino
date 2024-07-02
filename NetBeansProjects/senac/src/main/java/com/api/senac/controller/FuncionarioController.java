/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.senac.controller;

import com.api.senac.data.FuncionarioEntity;
import com.api.senac.service.FuncionarioService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Murilo
 */
@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired

    FuncionarioService funcionarioService;

    @GetMapping("/listar")

    public ResponseEntity<List> getAllFuncionarios() {

        List<FuncionarioEntity> funcionarios = funcionarioService.listarTodosFuncionarios();

        return new ResponseEntity<>(funcionarios, HttpStatus.OK);

    }

    @GetMapping("/pesquisar/{id}")

    public ResponseEntity<FuncionarioEntity> getFuncionarioById(@PathVariable Integer id) {

        FuncionarioEntity funcionario = funcionarioService.getFuncionarioId(id);

        return new ResponseEntity<>(funcionario, HttpStatus.OK);

    }

    @PostMapping("/adicionar")

    public ResponseEntity<FuncionarioEntity> addFuncionario(@Valid @RequestBody FuncionarioEntity func) {

        var novoFuncionario = funcionarioService.criarFuncionario(func);

        return new ResponseEntity<>(novoFuncionario, HttpStatus.CREATED);

    }

    @PutMapping("/atualizar/{id}")

    public ResponseEntity<FuncionarioEntity> atualizarFuncionario(@PathVariable Integer id, @RequestBody FuncionarioEntity funcionario) {

        var funcionarioAtualizado = funcionarioService.atualizarFuncionario(id, funcionario);

        return new ResponseEntity<>(funcionarioAtualizado, HttpStatus.OK);

    }

    @DeleteMapping("/deletar/{id}")

    public ResponseEntity deletarFuncionario(@PathVariable Integer id) {

        funcionarioService.deletarFuncionario(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }

}
