/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.projetoIntegrador.controller;

import com.api.projetoIntegrador.data.ContaEntity;
import com.api.projetoIntegrador.model.Valor;
import com.api.projetoIntegrador.service.ContaService;
import com.api.projetoIntegrador.service.TransacaoService;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    private int id;
    private Integer i;
    private int a;
    
    @GetMapping("/")
    public String PagLogin(Model model){
        
        model.addAttribute("conta", new ContaEntity());
        return "PagLogin";
    }
    
    @PostMapping("/ConfirmarLogin")
    public String ConfirmarLogin(@ModelAttribute("conta") ContaEntity conta, Model model){
        
        ContaEntity c = contaService.ConfirmarLogin(conta.getLogin(), conta.getSenha());
        if(c != null){
        id = c.getId();
        //Adicionar os Model 
        
        model.addAttribute("V", new ContaEntity());
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
        
        ContaEntity c = contaService.ConfirmarLogin(conta.getLogin(), conta.getSenha());
        System.out.println(conta.getCpf());
        
        if(c != null){
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
    
    @GetMapping("/PagCentral")
    public String PagCentral(Model model){
        model.addAttribute("V", new ContaEntity());
        return "PagCentral";
    }
    
    
    
    
    @GetMapping("/MudarStatus")
    public String MudarStatus(Model model){
        ContaEntity conta = contaService.BuscarContaById(id);
        contaService.AtualizarStatus(conta);
        model.addAttribute("V", new ContaEntity());
        return "PagCentral";
    }
    
    @GetMapping("/deletarConta")
    public String DeletarConta(){
        contaService.DeletarConta(id);
        return "redirect:/";
    }
    
    
    @RequestMapping(value="/Sacar")
    public String Sacar(@ModelAttribute("V") ContaEntity v){
        ContaEntity conta = contaService.BuscarContaById(id);
        System.out.println(conta.getSaldo());
        System.out.println(v.getSaldo() + " AAAAA");
        i = v.getSaldo();
        System.out.println(i + " BBBBB");
        //a = Integer.parseInt(v);
        if(conta.getSaldo() >= i){
            conta.setSaldo(conta.getSaldo() - i);
            contaService.AtualizarSaldo(id, conta);
            return "PagCentral";
        }
        else{
            System.out.println("");
            System.out.println("PEDIDO NEGADO");
            System.out.println("");
        }
        
        return "PagCentral";
    }
    
    
    @PostMapping("/Depositar")
    public String Depositar(@ModelAttribute("V") ContaEntity v){
        ContaEntity conta = contaService.BuscarContaById(id);
        System.out.println(v.getSaldo());
        i = v.getSaldo();
        System.out.println(i);
        //a = Integer.parseInt(v);
        
        conta.setSaldo(conta.getSaldo() + i);
        contaService.AtualizarSaldo(id, conta);
        return "PagCentral";
    }
}
