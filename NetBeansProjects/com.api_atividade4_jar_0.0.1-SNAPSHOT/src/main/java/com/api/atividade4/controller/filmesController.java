/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.controller;

import com.api.atividade4.data.AnaliseEntity;
import com.api.atividade4.data.FilmeEntity;
import com.api.atividade4.service.AnaliseService;
import com.api.atividade4.service.FilmeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Murilo
 */
@Controller
public class filmesController {
    
    @Autowired
    FilmeService filmeService;
    
    @Autowired
    AnaliseService analiseService;
    
    
    @GetMapping("/")
    public String pagListaFilmes(@CookieValue(name="preferencia", defaultValue = "escuro") String tema ,Model model){
        List<FilmeEntity> filmes = filmeService.listarTodosFilmes();
        List<AnaliseEntity> analises = analiseService.getTodasAnalises();
        model.addAttribute("css", tema);
        model.addAttribute("analises", analises);
        model.addAttribute("filmes", filmes);
        model.addAttribute("filme", new FilmeEntity());
        return "index";
    }
    
    @GetMapping("/atualizarFilme/{id}")
    public String PagAtualizarFilme(@PathVariable(value = "id") Integer id, Model model){
        FilmeEntity filme = filmeService.getFilmeById(id);
        model.addAttribute("filme", filme);
       return "atualizarFilme";
    }
    
    @PostMapping("/salvarFilme")
    public String cadastrarFilme(@ModelAttribute("filme") FilmeEntity filme, Model model){
        System.out.println(filme.getId());
        if(filme.getId() == null){
            filmeService.cadastrarFilme(filme);
        }
        else{
            filmeService.atualizarFilme(filme.getId(), filme);
        }
        return "redirect:/";
    }
    
    
    @GetMapping("/deletarFilme/{id}")
    public String deletarFilme(@PathVariable(value="id") Integer id, Model model){
        analiseService.DeletarAnalisesPorFilme(id);
        filmeService.deletarFilme(id);
        return "redirect:/";
    }
    
    

    @GetMapping("/adicionarAnalise/{id}")
    public String PagAdicionarAnalise(@PathVariable(value = "id") Integer id, Model model){
        FilmeEntity filme = filmeService.getFilmeById(id);
        model.addAttribute("filme", filme);
        model.addAttribute("Analises", new AnaliseEntity());
        return "adicionarAnalise";
    }
    
   @PostMapping("/salvarAnalise/{id}")
    public String salvarAnalise(@ModelAttribute("Analises") AnaliseEntity a, @PathVariable(value="id") int filmeId, Model model){
        System.out.println(a.getAnalise());
        System.out.println(a.getId());
        a.setFilme(filmeId);
        System.out.println(a.getFilme());
        System.out.println(a.getNota());
        

        analiseService.adicionarAnalise(a);
        return "redirect:/";
    }
    
    
    
    @GetMapping("/deletarAnalise/{id}")
    public String deletarAnalise(@PathVariable(value = "id") Integer id){
        analiseService.deletarAnalise(id);
        return "redirect:/";
    }
    
    @GetMapping("atualizarAnalise/{id}")
    public String atualizarAnalise(@PathVariable(value = "id") Integer id, Model model){
        AnaliseEntity analise = analiseService.getAnaliseById(id);
        model.addAttribute("Analise", analise);
        return "atualizarAnalise";
    }
    
    @PostMapping("/salvarAnaliseAtualizada")
    public String atualizarAnalise(@ModelAttribute("Analise") AnaliseEntity analise, Model model){
        analiseService.atualizarAnalise(analise.getId(), analise);
        return "redirect:/";
    }
    
}
