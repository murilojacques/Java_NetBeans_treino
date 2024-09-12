/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.projeto01.controller;

import com.api.projeto01.data.lutadoresEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.api.projeto01.service.lutaService;
import com.api.projeto01.service.lutadoresService;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Murilo
 */
@Controller
public class projeto_Controller {
    
    @Autowired
    lutadoresService lutadoresService;
    
    @Autowired
    lutaService lutaService;
    
    private int id=0;
    
    @GetMapping("/pag01")
    public String pagInicial(Model model){
        List<lutadoresEntity> lutadores = lutadoresService.ListaLutadores();
        
        model.addAttribute("lutador", new lutadoresEntity());
        model.addAttribute("lutadores", lutadores);
        return "pag01";
    }
    
    @PostMapping("/cadastrarUsuario")
    public String cadastrarUsuario(@ModelAttribute("lutador") lutadoresEntity lutador, Model model){
        lutadoresService.CadastrarLutador(lutador);
        if(lutador.getCategoria() == null){
            model.addAttribute("msg", "Usuario invalido");
            return "pag01";
        }
        return "pag01";
    }
 
    
    
    @GetMapping("/PagAtualizar/{id}")
    public String PagAtualizarLutador(@PathVariable("id") Integer id, Model model){
        
        lutadoresEntity lutador = lutadoresService.BuscarPorId(id);
        id = lutador.getId();
        System.out.println(id);
        model.addAttribute("lutador", lutador);
        model.addAttribute("novosDados", new lutadoresEntity());
        
        return "PagAtualizarDadosLutador";
    }
    
    @PostMapping("/AtualizarDados")
    public String atualizarDadosLutador(@ModelAttribute("novosDados") lutadoresEntity lutador, Model model){
        lutadoresService.Atualizar(id, lutador);
        
        return "redirect:/pag01";
    }
}
