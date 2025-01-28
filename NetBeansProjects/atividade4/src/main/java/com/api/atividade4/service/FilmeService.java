/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.service;

import com.api.atividade4.data.FilmeEntity;
import com.api.atividade4.data.FilmeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Murilo
 */
@Service
public class FilmeService {
    
    @Autowired        
    FilmeRepository filmeRepository;
    
    
    public FilmeEntity cadastrarFilme(FilmeEntity filme){ 
        filme.setId(null);
        filmeRepository.save(filme);
        return filme;
    }
    
    
    
    public FilmeEntity atualizarFilme(Integer filmeId, FilmeEntity filmeAtualizacao){
        
        FilmeEntity filme = getFilmeById(filmeId);
        
        filme.setTitulo(filmeAtualizacao.getTitulo());
        filme.setSinopse(filmeAtualizacao.getSinopse());
        filme.setGenero(filmeAtualizacao.getGenero());
        filme.setAnoLancamento(filmeAtualizacao.getAnoLancamento());
        
        filmeRepository.save(filme);
        
        return filme;
    }
    
    
    
    public FilmeEntity getFilmeById(Integer id){
        return filmeRepository.findById(id).orElse(null);
    }
    
    public FilmeEntity getFilmeById(Integer id, FilmeRepository filmeRepository){
        this.filmeRepository = filmeRepository;
        return this.filmeRepository.findById(id).orElse(null);
    }
    
    
    
     public List<FilmeEntity> getFilmes(){
        return filmeRepository.findAll();
    }
    
    public List<FilmeEntity> listarTodosFilmes(){
        return filmeRepository.findAll();
    }
    
    
    
    public void deletarFilme(Integer filmeId){
        FilmeEntity filme = getFilmeById(filmeId);
        filmeRepository.deleteById(filme.getId());
    }
}
