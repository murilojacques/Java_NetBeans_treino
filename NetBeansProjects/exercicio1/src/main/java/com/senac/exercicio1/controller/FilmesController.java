/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.exercicio1.controller;

import com.senac.exercicio1.model.Analise;
import com.senac.exercicio1.model.Filmes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.expression.Ids;

/**
 *
 * @author Murilo
 */
@Controller
public class FilmesController {
    private int indices=0;
    private int getIndex=0;
    private final List<Filmes> filmes = new ArrayList();
    private final List<Analise> analises = new ArrayList();
    
    
    filmes.add(new Filmes(1, "Filme A", "Sinopse A", "Ação", 2020));
    filmes.add(new Filmes(2, "Filme B", "Sinopse B", "Drama", 2019));

    
    @GetMapping("/cadastroFilmes")
    public String exibirCadastroFilmes(Model model){
        Analise a = new Analise();
        model.addAttribute("a", a);
        System.out.println(a.getId());
        model.addAttribute("filme", new Filmes());
        return "cadastroFilmes";
    }
    
    @PostMapping("/cadastroFilmes")
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
        return "listaFilmes";
    }
    
    //Para Fazer é so Adicionar um input no HTML e pegar o numero do ID do filme q a pessoa quer depois com POSTMapping aqui redirecionar a pessoa para a pagina DetalhesFilme e por o numero digitado em uma variavel aqui
    
    
    @GetMapping("/listaFilmes")
    public String exibirListaFilmes(Model model){  
        model.addAttribute("filme", new Filmes());
        model.addAttribute("filmes", filmes);
        return "listaFilmes";
    }
    
    
    
    @PostMapping("/listaFilmes")
    public String MostrarPaginaDetalhes(@ModelAttribute Filmes filme, Model model){
        Analise analise = new Analise();
        analise.setFilme(filmes.get(filme.getId()));
        model.addAttribute("analise" ,analise);
        return "detalhesFilmes";
    }
    
    
    
    
    
    @GetMapping("/detalhesFilme")
    public String exibirDetalhesFilme(Model model){
        Analise analise = new Analise();
        model.addAttribute("analise", analise);
        
        return "detalhesFilme";
    }
    
    @PostMapping("/detalhesFilme")
    public String processarAnalise(@ModelAttribute Analise analise, Model model){
        analises.add(analise);
        return "listaFilmes";
    }
}
