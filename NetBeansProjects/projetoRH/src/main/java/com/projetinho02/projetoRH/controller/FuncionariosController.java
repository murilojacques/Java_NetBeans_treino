/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho02.projetoRH.controller;

import com.projetinho02.projetoRH.data.DependentesEntity;
import com.projetinho02.projetoRH.data.FuncionariosEntity;
import com.projetinho02.projetoRH.service.CandidatosService;
import com.projetinho02.projetoRH.service.DependentesService;
import com.projetinho02.projetoRH.service.FuncionariosService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Murilo
 */
@Controller
public class FuncionariosController {

    @Autowired
    private FuncionariosService funcionarioService;

    @Autowired
    private DependentesService dependentesService;

    @GetMapping("/pagCadastrarFuncionario")
    public ModelAndView pagCadastrarFunc() {
        ModelAndView mv = new ModelAndView("pagCadastrarFuncionario");
        mv.addObject("funcionario", new FuncionariosEntity());
        return mv;
    }

    @PostMapping("/cadastrarFuncionario")
    public String cadastrarFuncionario(@ModelAttribute("funcionario") @Valid FuncionariosEntity func, BindingResult result, RedirectAttributes attribute) {

        if (result.hasErrors()) {
            attribute.addFlashAttribute("msg", "Falha ao cadastrar Funcionario, verifique os campos");
            attribute.addFlashAttribute("classe", "alert alert-success alert-danger");
            return "redirect:/pagCadastrarFuncionario";
        }

        funcionarioService.cadastrarFuncionario(func);
        attribute.addFlashAttribute("msg", "Funcionario Cadastrado com Sucesso");
        attribute.addFlashAttribute("classe", "alert alert-success alert-dismissible");
        return "redirect:/pagCadastrarFuncionario";
    }

    @GetMapping("/pagListaFuncionarios")
    public ModelAndView pagListaFunc() {
        ModelAndView mv = new ModelAndView("pagListaFuncionarios");
        List<FuncionariosEntity> funcionarios = funcionarioService.findAllFuncionarios();
        mv.addObject("funcionarios", funcionarios);
        return mv;
    }

    @GetMapping("/pagDetalhesFuncionario/{id}")
    public ModelAndView pagAdicionarDependente(@PathVariable("id") Long id) {

        FuncionariosEntity func = funcionarioService.findById(id);

        ModelAndView mv = new ModelAndView("pagDetalhesFuncionario");
        mv.addObject("funcionario", func);
        mv.addObject("dependente", new DependentesEntity());
        mv.addObject("dependentes", dependentesService.findAllDependentesByFuncId(func));
        return mv;
    }

    @GetMapping("/deletarFuncionario/{id}")
    public String deletarFuncionario(@PathVariable("id") Long id) {
        funcionarioService.deletarFunc(id);
        return "redirect:/pagListaFuncionarios";
    }

    @GetMapping("/pagAtualizarFuncionario/{id}")
    public ModelAndView pagAtualizarFuncionario(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("pagAtualizarFuncionario");
        mv.addObject("funcionario", funcionarioService.findById(id));
        return mv;
    }

    @PostMapping("/atualizarFuncionario/{id}")
    public String atualizarFuncionario(@PathVariable("id") Long id, @ModelAttribute("newFuncionario") @Valid FuncionariosEntity func, BindingResult result, RedirectAttributes attribute) {

        if (result.hasErrors()) {
            attribute.addFlashAttribute("msg", "Falha ao atualizar Funcionario, verifique os campos");
            attribute.addFlashAttribute("classe", "alert alert-success alert-danger");
            return "redirect:/pagAtualizarFuncionario/" + id;
        }
        
        funcionarioService.atualizarFuncionario(id, func);
        attribute.addFlashAttribute("msg", "Successo ao atualizar Funcionario");
        attribute.addFlashAttribute("classe", "alert alert-success alert-dismissible");
        return "redirect:/pagAtualizarFuncionario/" + id;
    }

    @PostMapping("/adicionarDependente/{id}")
    public String adicionarDependentes(@PathVariable("id") Long id, @ModelAttribute("dependente") @Valid DependentesEntity denp, BindingResult result, RedirectAttributes attribute) {

        if (result.hasErrors()) {
            attribute.addFlashAttribute("msg", "Não foi possivel Adicionar Dependente, verifique os campos!");
            attribute.addFlashAttribute("classe", "alert alert-success alert-danger");
            return "redirect:/pagDetalhesFuncionario/" + id;
        }

        FuncionariosEntity func = funcionarioService.findById(id);
        dependentesService.cadastrarDependente(denp, func);

        attribute.addFlashAttribute("msg", "Dependente adicionado!");
        attribute.addFlashAttribute("classe", "alert alert-success alert-dismissible");
        return "redirect:/pagDetalhesFuncionario/" + id;
    }

    @GetMapping("/deletarDependente/{id}")
    public String deletarDependente(@PathVariable("id") Long denpId) {
        DependentesEntity denp = dependentesService.findById(denpId);
        long funcId = denp.getFuncionarioId().getId();
        dependentesService.deletarDenp(denpId);
        return "redirect:/pagDetalhesFuncionario/" + funcId;
    }

}
