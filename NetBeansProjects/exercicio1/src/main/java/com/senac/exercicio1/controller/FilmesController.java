/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.exercicio1.controller;

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
    
    @GetMapping("/cadastroFilmes")
    public String exibirCadastroFilmes(Model model){
        return "cadastroFilmes";
    }
    
    @PostMapping("/cadastroFilmes")
    public String processarFormulario(@ModelAttribute Filmes filme, Model model){
        filmes.add(filme);
        System.out.println(filme.getTitulo());
        return "cadastroFilmes";
    }
    
    
    
    
    @GetMapping("/listaFilmes")
    public String exibirListaFilmes(Model model){
        return "listaFilmes";
    }
}
