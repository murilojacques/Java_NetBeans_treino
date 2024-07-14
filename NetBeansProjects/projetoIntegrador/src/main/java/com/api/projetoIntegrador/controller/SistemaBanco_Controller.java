/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.projetoIntegrador.controller;

import com.api.projetoIntegrador.data.ContaEntity;
import com.api.projetoIntegrador.service.ContaService;
import com.api.projetoIntegrador.service.TransacaoService;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Murilo
 */
@Controller
public class SistemaBanco_Controller {
    
    @Autowired
    ContaService contaService;
    
    @Autowired
    TransacaoService transacaoService;
    
    
    
    @GetMapping("/")
    public String PagLogin(Model model){
        
        model.addAttribute("conta", new ContaEntity());
        return "PagLogin";
    }
    
    @PostMapping("/ConfirmarLogin")
    public String ConfirmarLogin(@ModelAttribute("conta") ContaEntity conta, Model model){
        
        boolean permitido = contaService.ConfirmarLogin(conta.getLogin(), conta.getSenha());
        if(permitido == true){
            
        //Adicionar os Model
        System.out.println("AAAAAAAAAAAAA");
        System.out.println("AAAAAAAAAAAAA");
        System.out.println("AAAAAAAAAAAAA");
        System.out.println("AAAAAAAAAAAAA");    
        return "PagCentral";
        }
       
        return "redirect:/";
    }
    
    
    
    
    
    @GetMapping("/PagCriarConta")
    public String PagCriarConta(Model model){
        
        model.addAttribute("conta", new ContaEntity());
        return "PagCriarConta";
    }
    
    @RequestMapping(value="/cadastrarConta")
    public String CadastrarConta(@ModelAttribute("conta") ContaEntity conta){
        
        boolean encontrado = contaService.ConfirmarLogin(conta.getLogin(), conta.getSenha());
        System.out.println(conta.getCpf());
        
        if(encontrado == true){
          System.out.println("Encontrado foi TRUE");
          //    Esse JOption ta fazendo da erro            JOptionPane.showMessageDialog(null, "Uma Conta com esse Login e/ou Senha Ja existe");
          return "PagCriarConta";  
        }else{
            if(conta.getTipo().equals("cc")){
            conta.setSaldo(50);
            }
            else{
            conta.setSaldo(150);
            }
            conta.setId(null);
        conta.setStatus(true);
        contaService.cadastrarConta(conta);
        }
        
        return "redirect:/";
    }
}
