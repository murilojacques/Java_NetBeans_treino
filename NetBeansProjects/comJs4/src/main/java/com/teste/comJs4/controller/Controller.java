/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teste.comJs4.controller;

import com.teste.comJs4.data.EmpresaEntity;
import com.teste.comJs4.data.FuncionarioEntity;
import com.teste.comJs4.service.EmpresaService;
import com.teste.comJs4.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Murilo
 */
@org.springframework.stereotype.Controller
public class Controller {
    
    @Autowired
    EmpresaService empresaService;
    
    @Autowired
    FuncionarioService funcionarioService;
    
    
    @GetMapping("/")
    public ModelAndView pagIndex(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    
    
    
    @GetMapping("/pagCadastrarEmpresa")
    public ModelAndView pagCadastrarEmpresa(){
        ModelAndView mv = new ModelAndView("pagCadastrarEmpresa");
        mv.addObject("empresa", new EmpresaEntity());
        return mv;
    }
    
    @GetMapping("/pagListaEmpresas")
    public ModelAndView pagListarEmpresas(){
        ModelAndView mv = new ModelAndView("pagListaEmpresas");
        List<EmpresaEntity> empresas = empresaService.getAllEmpresas();
        mv.addObject("empresas", empresas);
        return mv;
    }
    
    @PostMapping("/cadastrarEmpresa")
    public String cadastrarEmpresa(@ModelAttribute("empresa") @Valid EmpresaEntity empresa, BindingResult result, RedirectAttributes attributes){
        
        if(result.hasErrors()){
            return "redirect:/";
        }
        
        empresaService.salvarEmpresa(empresa);
        return "redirect:/";
    }
    
    
    
    
    
    @GetMapping("/pagCadastrarFuncionario")
    public ModelAndView pagCadastrarFuncionario(){
        ModelAndView mv = new ModelAndView("pagCadastrarFuncionario");
        mv.addObject("funcionario", new FuncionarioEntity());
        return mv;
    }
    
    @PostMapping("/cadastrarFuncionario")
    public String cadastrarEmpresa(@ModelAttribute("funcionario") @Valid FuncionarioEntity funcionario, BindingResult result, RedirectAttributes attributes){
        
        if(result.hasErrors()){
            return "redirect:/";
        }
        
        funcionarioService.salvarFuncionario(funcionario);
        return "redirect:/";
    }
    
    
    
    
    
    
    @GetMapping("/pagDetalhesEmpresa/{id}")
    public ModelAndView pagDetalhesEmpresa(@PathVariable("id") Integer id){
        ModelAndView mv = new ModelAndView("pagDetalhesEmpresa");
        EmpresaEntity empresa = empresaService.findEmpresaById(id);
        mv.addObject("empresa", empresa);
        mv.addObject("funcionario", new FuncionarioEntity());
        return mv;
    }
    
    @PostMapping("/atualizarEmpresa/{id}")
    public String atualizarEmpresa(@PathVariable("id") Integer id, @ModelAttribute("empresa") @Valid EmpresaEntity empresa, RedirectAttributes attribute, BindingResult result){
        
        System.out.println("Nome: " + empresa.getNome());
        System.out.println("Salario: " + empresa.getSalario());
        
        if(result.hasErrors()){
            return "redirect:/pagDetalhesEmpresa/"+id;
        }
        
        
        empresaService.atualizarEmpresa(empresa, id);
        return "redirect:/pagDetalhesEmpresa/"+id;
    }
    
    @PostMapping("/cadastrarFuncionario/{id}")
    public String cadastrarFuncionario(@PathVariable("id") Integer id, @ModelAttribute("funcionario") @Valid FuncionarioEntity func, RedirectAttributes attributes, BindingResult result){
        
        EmpresaEntity empresa = empresaService.findEmpresaById(id);
        
        if(result.hasErrors()){
            return "redirect:/cadastrarFuncionario/"+id;
        }
        
        empresaService.adicionarFuncionario(empresa, func);
        funcionarioService.adicionarEmpregador(empresa, func);
        
        return "redirect:/cadastrarFuncionario/"+id;
    }
    
   
    /*
    @PostMapping("/deletarEmpresa/{id}")
    public ModelAndView deletarEmpresa(@PathVariable("id") Integer id, BindingResult results, RedirectAttributes attributes){
        empresaService.deletarEmpresa(id);
    }
*/
}
