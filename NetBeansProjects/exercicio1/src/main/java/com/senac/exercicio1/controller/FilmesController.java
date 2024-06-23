/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.exercicio1.controller;

import com.senac.exercicio1.model.Analise;
import com.senac.exercicio1.model.Filmes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Murilo
 */
@Controller
public class FilmesController {
    
    private List<Filmes> filmes = new ArrayList();
    private List<Analise> analises = new ArrayList();
    
    @GetMapping("/cadastroFilmes")
    public String exibirCadastroFilmes(Model model){
        model.addAttribute("Filmes", new Filmes());
        return "cadastroFilmes";
    }
    
    @PostMapping("/cadastroFilmes")
    public String processarFormulario(@ModelAttribute Filmes filme, Model model){
        filmes.add(filme);
        System.out.println(filme.getTitulo());
        System.out.println(filme.getSinopse());
        System.out.println(filme.getGenero());
        System.out.println(filme.getAnoLancamento());
        System.out.println(filme.getSinopse());
        System.out.println(filme.getTitulo());
        return "listaFilmes";
    }
    
    
    
    
    @GetMapping("/listaFilmes")
    public String exibirListaFilmes(Model model){
        return "listaFilmes";
    }
    
    
    
    
    
    
    @GetMapping("/detalhesFilme")
    public String exibirDetalhesFilme(Model model){
        return "detalhesFilme";
    }
    
    @PostMapping("/detalhesFilme")
    public String processarAnalise(@ModelAttribute Analise analise, Model model){
        analises.add(analise);
        return "listaFilmes";
    }
}
