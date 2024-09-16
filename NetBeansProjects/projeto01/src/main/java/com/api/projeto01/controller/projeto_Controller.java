/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.projeto01.controller;

import com.api.projeto01.data.lutaEntity;
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
    
    private int id;
    
    @GetMapping("/pag01")
    public String pagInicial(Model model, String msg1, String msg2){
        List<lutadoresEntity> lutadores = lutadoresService.ListaLutadores();
        List<lutaEntity> lutas = lutaService.ListaLutas();
        model.addAttribute("msg1", msg1);
        model.addAttribute("msg2", msg2);
        model.addAttribute("Marcarluta", new lutaEntity());
        model.addAttribute("lutas", lutas);
        model.addAttribute("lutador", new lutadoresEntity());
        model.addAttribute("lutadores", lutadores);
        return "pag01";
    }
    
    @PostMapping("/cadastrarUsuario")
    public String cadastrarUsuario(@ModelAttribute("lutador") lutadoresEntity lutador, Model model){
        lutadoresService.CadastrarLutador(lutador);
        if(lutador.getCategoria() == null){
            return pagInicial(model, "Usuario Invalido", "");
        }
        return pagInicial(model, "", "");
    }
 
    
    
    @GetMapping("/PagAtualizar/{id}")
    public String pagAtualizarLutador(@PathVariable("id") Integer id, Model model){
        
        lutadoresEntity lutador = lutadoresService.BuscarPorId(id);
        this.id = lutador.getId();
        model.addAttribute("lutador", lutador);
        model.addAttribute("novosDados", new lutadoresEntity());
        
        return "PagAtualizarDadosLutador";
    }
    
    @PostMapping("/AtualizarDados")
    public String atualizarDadosLutador(@ModelAttribute("novosDados") lutadoresEntity lutador, Model model){
        lutadoresService.Atualizar(this.id, lutador);
        
        return "redirect:/pag01";
    }
    
    @GetMapping("/deletar/{id}")
    public String deletarLutador(@PathVariable("id") int id, Model model){
        lutadoresService.DeletarLutador(id);
        lutaService.DeletarPorLutador(id);
        return pagInicial(model, "", "");
    }
    
    
    /* 
    @GetMapping("/PagMarcarLuta")
    public String pagMarcarLuta(Model model){
        model.addAttribute("msg", "");
        model.addAttribute("luta", new lutaEntity());
        return "PagMarcarluta";
    }
    */
    @PostMapping("/marcarLuta")
    public String marcarLuta(@ModelAttribute("Marcarluta") lutaEntity luta, Model model){
        lutadoresEntity desafiante = lutadoresService.BuscarPorId(luta.getDesafiante_id());
        lutadoresEntity desafiado = lutadoresService.BuscarPorId(luta.getDesafiado_id());
        
        boolean LutadoresDif = desafiado.getId() != desafiante.getId()? true:false;
        boolean mesmaCategoria = desafiado.getCategoria() == desafiante.getCategoria()? false:true;
        
        System.out.println(LutadoresDif);
        System.out.println(mesmaCategoria);
        
        if(LutadoresDif && mesmaCategoria){
            luta.setAprovada(true);
            lutaService.MarcarLuta(luta);
            return pagInicial(model, "", "");
        }
        else if(!LutadoresDif && !mesmaCategoria || !LutadoresDif){
            return pagInicial(model, "", "Mesmo Lutador");
        }
        else if(!mesmaCategoria){
            return pagInicial(model, "", "Os Lutadores Selecionados");
        }
        return pagInicial(model, "", "");
    }
    
    @GetMapping("/deletarLuta/{id}")
    public String deletarLuta(@PathVariable("id")int id, Model model){
        lutaService.DeletarLuta(id);
        return pagInicial(model, "", "");
    }
    
    
    @GetMapping("/verLutadores/{id}")
    public String verLutadores(@PathVariable("id")int id, Model model){
        lutaEntity luta = lutaService.BuscarPorId(id);
        lutadoresEntity desafiante = lutadoresService.BuscarPorId(luta.getDesafiante_id());
        lutadoresEntity desafiado = lutadoresService.BuscarPorId(luta.getDesafiado_id());
        
        model.addAttribute("desafiante", desafiante);
        model.addAttribute("desafiado", desafiado);
        return "PagVerLutadores";
    }
    
}
