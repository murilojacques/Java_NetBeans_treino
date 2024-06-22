/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.projetomvc.controller;
import com.senac.projetomvc.controller.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author Murilo
 */
@Controller
public class MiscController {
    @GetMapping("/saudacao")
    public String mostrarSaudacao(){
        return "saudacao";
    }
    
    
    @GetMapping("/diahora")
    public String mostrarDiaHora(Model model){
        LocalDateTime diaHora = LocalDateTime.now();
        model.addAttribute("data", diaHora.toLocalDate().toString());
        model.addAttribute("hora", diaHora.toLocalTime().toString());
        return "data";
    }
    
    
    @GetMapping("/temperatura") 
    public String converteTemperatura(Model model, @RequestParam(defaultValue="0")int valor ){ 
    float farenheit, kelvin; 
    kelvin = valor + 273; 
    farenheit = 1.8f*valor + 32; 
    model.addAttribute("celsius", valor); 
    model.addAttribute("farenheit", farenheit); 
    model.addAttribute("kelvin", kelvin); 
    return "temperatura"; 
    }
    
    
    @GetMapping("/pessoa")
    public String mostarPessoa(Model model, String nome, @RequestParam(defaultValue = "0")int idade){
        Pessoa p = new Pessoa();
        if(nome != null && !nome.isBlank()){
            int indiceEspaco = nome.indexOf(" ");
            
            if(indiceEspaco < 0){
                indiceEspaco = nome.length();
            }
            
            p.setNome(nome.substring(0, indiceEspaco));
            p.setSobrenome(nome.substring(indiceEspaco, nome.length()));
        }
        p.setIdade(idade);
        model.addAttribute("pessoa", p);
        return "pessoa";
    }
    
    
    @GetMapping("/cadastros")
    public String mostrarCadastro(Model model){
        model.addAttribute("pessoa", new Pessoa());
        return "cadastros";
    }
    
    
    @PostMapping("/cadastros") 
    public String recebeCadastro(Model model, @ModelAttribute Pessoa pessoa){ 
    model.addAttribute("pessoa", pessoa); 
    return "pessoa"; 
    }
    
    
    
}
