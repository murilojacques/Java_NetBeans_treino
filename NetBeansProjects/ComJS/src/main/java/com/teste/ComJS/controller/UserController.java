/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.teste.ComJS.controller;

import com.teste.ComJS.data.UserEntity;
import com.teste.ComJS.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class UserController {
    
    @Autowired
    UserService userService;
    
    
    @GetMapping("/")
    public ModelAndView pagIndex(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("user", new UserEntity());
        mv.addObject("users", userService.FindUsers());
        return mv;
    }
    
    @PostMapping("/cadastrarUser")
    public String cadastrarUser(@ModelAttribute("user") @Valid UserEntity user, BindingResult result, RedirectAttributes attribute){
        System.out.println("AAAAAAAAAAAAAAAAA");
        if(result.hasErrors()){
            attribute.addFlashAttribute("msg", "Falha ao cadastrar ususario, verifique os campos");
            attribute.addFlashAttribute("classe", "alert alert-success alert-danger");
            return "redirect:/";
        }
        
        userService.cadastrarUser(user);
        attribute.addAttribute("users", userService.FindUsers());
        attribute.addFlashAttribute("msg", "Usuario Cadastrado com Sucesso");
        attribute.addFlashAttribute("classe", "alert alert-success alert-dismissible");
        return "redirect:/";
    }
    
    
    
    @GetMapping("/Deletar/{id}")
    public String deletarUser(@PathVariable("id") Integer id){
        userService.deletarByUserId(id);
        return "redirect:/";
    }
    
    
    @GetMapping("/pagDetalhes/{id}")
    public ModelAndView pagDetalhes(@PathVariable("id") Integer id){
        ModelAndView mv = new ModelAndView("pagDetalhes");
        UserEntity user = userService.findUserById(id);
        
        mv.addObject("user", user);
        mv.addObject("updateUser", new UserEntity());
        
        return mv;
    }
    
    
    @PostMapping("/atualizarUser/{id}")
    public String atualizarUser(@ModelAttribute("updateUser") @Valid UserEntity updatedUser, @PathVariable("id") Integer id, BindingResult results, RedirectAttributes attribute){
       
        if(results.hasErrors()){
            attribute.addFlashAttribute("msg", "Falha ao cadastrar ususario, verifique os campos");
            attribute.addFlashAttribute("classe", "alert alert-success alert-danger");
            return "redirect:/pagDetalhes";
        }
        
        userService.updateUser(updatedUser, id);
        attribute.addFlashAttribute("msg", "Usuario Cadastrado com Sucesso");
        attribute.addFlashAttribute("classe", "alert alert-success alert-dismissible");
        return "redirect:/pagDetalhes"+id;
    }
}
