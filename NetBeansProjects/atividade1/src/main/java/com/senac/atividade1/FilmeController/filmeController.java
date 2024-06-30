/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.atividade1.FilmeController;

import com.senac.atividade1.Models.Analise;
import com.senac.atividade1.Models.Filmes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Murilo
 */
@Controller
public class filmeController {
    
     private final List<Filmes> filmes = new ArrayList<>();
     private final List<Analise> analises = new ArrayList<>();
     
     public filmeController(){
         filmes.add(new Filmes(1, "Filme A", "Sinopse A", "Ação", 2022));
         filmes.add(new Filmes(2, "Filme B", "Sinopse B", "Drama", 2023));
     }
     
     
     @GetMapping("/filmes")
     public String listarFilmes(Model model){
         model.addAttribute("filmes", filmes);
         return "listaFilmes";
     }
     
     
     
     @GetMapping("/filme/{id}")
    public String detalhesFilme(@PathVariable(value = "id") int id, Model model){
         System.out.println(id);
        Filmes filme = filmes.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
        model.addAttribute("filme", filme);
        return "detalhesFilme";
    }
     
     
     //@GetMapping("/detalhesFilme")
     
     
     
     
     @PostMapping("/filme/adicionar")
     public String adicionarFilme(@RequestParam String titulo, @RequestParam String sinopse,
             @RequestParam String genero, @RequestParam int anoLancamento){
         
         int id = filmes.size()+1;
         Filmes novoFilme = new Filmes(id, titulo, sinopse, genero, anoLancamento);
         filmes.add(novoFilme);
         return "redirect:/filme";
     }
     
     
     
     @PostMapping("/filme/{id}/analisar")
     public String adicionarAnalise(@PathVariable int id, @RequestParam String analise, @RequestParam int nota){
         Filmes filme = filmes.stream().filter(f -> f.getId()==id).findFirst().orElse(null);
         if(filme != null){
             int idAnalise = analises.size()+1;
             Analise adiAnalise = new Analise(idAnalise, filme, analise, nota);
             analises.add(adiAnalise);
         }
         return "redirect:/filme/"+id;
     }
}
