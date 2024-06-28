/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TesteEx1.controller;

import com.example.TesteEx1.Model.Analises;
import com.example.TesteEx1.Model.Filmes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Murilo
 */
public class Controller {
    
    private int indices=0;
    private int getIndex=0;
    private final List<Filmes> filmes = new ArrayList();
    private final List<Analises> analises = new ArrayList();
    
    @GetMapping("/Pag1")
    public String exibirCadastroFilmes(Model model){
        model.addAttribute("filme", new Filmes());
        return "Pag1";
    }
    
    @PostMapping("/Pag1")
    public String processarFormulario(@ModelAttribute Filmes filme, Model model){
        filme.setId(indices+1);
        indices+=1;
        filmes.add(filme);
        model.addAttribute("filme", filme);
        System.out.println(filme.getId());
        System.out.println(filme.getTitulo());
        System.out.println(filme.getSinopse());
        System.out.println(filme.getGenero());
        System.out.println(filme.getAno());
        return "Pag2";
    }
    
    
    @GetMapping("/Pag2")
    public String exibirListaFilmes(Model model){   
        model.addAttribute("f", new Analises());
        model.addAttribute("filmes", filmes);
        return "Pag2";
    }
    
    
    
    @PostMapping("/Pag2")
    public String MostrarPaginaDetalhes(@ModelAttribute Filmes f, Model model){
        getIndex = f.getId();
        System.out.println(getIndex);
        return "Pag1";
    }
}
