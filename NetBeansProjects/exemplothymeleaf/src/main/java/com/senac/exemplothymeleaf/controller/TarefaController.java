/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.exemplothymeleaf.controller;

import com.senac.exemplothymeleaf.model.Tarefa;
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
public class TarefaController {
    
    private List<Tarefa> tarefas = new ArrayList();
    
    
    @GetMapping("/exibir-tarefa") 
        public String exibirTarefa(Model model) { 
        // Definindo o valor da variável "nome" 
        String nome = "Lucas"; 
        // Criando uma nova instância da classe "Tarefa" com os valores especificados 
        Tarefa tarefa = new Tarefa(1, "Aprender como usar dados dinâmicos com o Thymeleaf", true); 
        // Adicionando a variável "nome" ao modelo para ser usada na visualização (view) 
        model.addAttribute("nome", nome); 
        // Adicionando o objeto "tarefa" ao modelo para ser usado na visualização (view) 
        model.addAttribute("tarefa", tarefa); 
        // Retornando o nome da visualização (view) que será renderizada 
        return "exibir-tarefa"; 
    }
        
     
        
    @GetMapping("/lista-tarefas") 
    public String listaTarefas(Model model) { 
    
    model.addAttribute("tarefas", tarefas); 
    // Retorna o nome da página que será renderizada 
    return "lista-tarefas"; 
    }   
    
    
    
    @GetMapping("/cadastro") 
    public String exibirFormulario(Model model) { 
    // Cria uma nova instância da classe Tarefa e a adiciona ao modelo 
    model.addAttribute("tarefa", new Tarefa()); 
    // Retorna o nome do template "cadastro" para exibir o formulário 
    return "cadastro"; 
    } 
    
    @PostMapping("/cadastro") 
    public String processarFormulario(@ModelAttribute Tarefa tarefa, Model model) { 
    // Define a propriedade "completa" da tarefa como "false" 
    tarefa.setCompleta(false); 
    // Adiciona a tarefa à lista de tarefas (supondo que "tarefas" seja uma lista já existente) 
    tarefas.add(tarefa); 
    // Adiciona a tarefa ao modelo para ser exibida no template "exibir-tarefa" 
    model.addAttribute("tarefa", tarefa); 
    // Retorna o nome do template "exibir-tarefa" para exibir os detalhes da tarefa 
    return "exibir-tarefa"; 
    }
}
