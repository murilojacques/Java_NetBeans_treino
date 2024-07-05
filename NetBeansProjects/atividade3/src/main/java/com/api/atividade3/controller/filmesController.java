/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade3.controller;

import com.api.atividade3.data.FilmeEntity;
import com.api.atividade3.service.AnaliseService;
import com.api.atividade3.service.FilmeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Murilo
 */
@Controller
public class filmesController {
    
    @Autowired
    FilmeService filmeService;
    AnaliseService analiseService;
    
    
    @GetMapping("/")
    public String pagListaFilmes(Model model){
        List<FilmeEntity> filmes = filmeService.listarTodosFilmes();
        model.addAttribute("filmes", filmes);
        return "index";
    }
    
    @GetMapping("/cadastrarFilme")
    public String cadastrarFilme(Model model){
        return "cadastrarFilme";
    }
    
    
    
    
    
    //@GetMapping("/adicionarAnalise/{id}")
    //public String adicionarAnalise(@PathVariable(value = "id") int id, Model model){
        //return "adicionarAnalise";
    //}
    
    //@GetMapping("/atualizarFilme/{id}")
    //public String atualizarFilme(@PathVariable(value = "id") int id, Model model){
       // return "redirect:/";
    //}
    
    
    
    
    //@GetMapping("/filme/{id}")
    //public String detalhesFilme(@PathVariable(value = "id") int id, Model model){
        //System.out.println(id);
        //FilmeEntity filme = filmeService.getFilmeById(id);
        //model.addAttribute("filme", filme);
        //return "detalhesFilme";
    //}
}
