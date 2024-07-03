/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade2.controller;

import com.api.atividade2.data.AnaliseEntity;
import com.api.atividade2.data.FilmeEntity;
import com.api.atividade2.service.AnaliseService;
import com.api.atividade2.service.FilmeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/filme")
public class FilmeController {
    
    @Autowired
    FilmeService filmeService;
    
    @Autowired
    AnaliseService analiseService;
    
    
    @GetMapping("/listarFilme")
    public ResponseEntity<List> getAllFilmes(){
        List<FilmeEntity> filmes = filmeService.listarTodosFilmes();
        return new ResponseEntity<>(filmes, HttpStatus.OK);
    }
    
    @GetMapping("/buscarFilme/{id}")
    public ResponseEntity<FilmeEntity> buscarFilmeById(@PathVariable Integer id){
        FilmeEntity filme = filmeService.getFilmeById(id);
        return new ResponseEntity<>(filme, HttpStatus.OK);
    }
    
    
    @PostMapping("/adicionarFilme")
    public ResponseEntity<FilmeEntity> cadastrarFilme(@RequestBody FilmeEntity filme){
        var novoFilme = filmeService.cadastrarFilme(filme);
        return new ResponseEntity<>(novoFilme, HttpStatus.OK);
    } 
    
    
    @PutMapping("/atualizarFilme/{id}")
    public ResponseEntity<FilmeEntity> atualizarFilme(@PathVariable Integer id, @RequestBody FilmeEntity filme){
        var filmeAtualizado = filmeService.atualizarFilme(id, filme);
        return new ResponseEntity<>(filmeAtualizado, HttpStatus.OK);
    }
    
    
    @DeleteMapping("/deletarFilme/{id}")
    public ResponseEntity deletarFilme(@PathVariable Integer id){
        filmeService.deletarFilme(id);
        analiseService.DeletarAnalisesPorFilme(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    
    
    
    
    
    @GetMapping("/listarAnalises")
    public ResponseEntity<List> getAllAnalises(){
        List<AnaliseEntity> analises = analiseService.getTodasAnalises();
        return new ResponseEntity<>(analises, HttpStatus.OK);
    }
    
    @GetMapping("/buscarAnalise/{id}")
    public ResponseEntity<AnaliseEntity> buscarAnaliseById(@PathVariable Integer id){
        AnaliseEntity analise = analiseService.getAnaliseById(id);
        return new ResponseEntity<>(analise, HttpStatus.OK);
    }
    
    
    @PostMapping("/adicionarAnalise/{id}")
    public ResponseEntity<AnaliseEntity> cadastrarFilme(@PathVariable Integer id, @RequestBody AnaliseEntity analise){
        FilmeEntity filme = filmeService.getFilmeById(id);
        if(filme != null){
            analise.setFilme(filme.getId());
            var novaAnalise = analiseService.adicionarAnalise(analise);
            return new ResponseEntity<>(novaAnalise, HttpStatus.OK);
        }
            return null;
    } 
    
    
    @PutMapping("/atualizarAnalise/{id}")
    public ResponseEntity<AnaliseEntity> atualizarAnalise(@PathVariable Integer id, @RequestBody AnaliseEntity analise){
        var analiseAtualizada = analiseService.atualizarAnalise(id, analise);
        return new ResponseEntity<>(analiseAtualizada, HttpStatus.OK);
    }
    
    
    @DeleteMapping("/deletarAnalise/{id}")
    public ResponseEntity deletarAnalise(@PathVariable Integer id){
        analiseService.deletarAnalise(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
