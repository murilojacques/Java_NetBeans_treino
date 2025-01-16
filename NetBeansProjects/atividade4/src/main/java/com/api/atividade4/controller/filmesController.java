/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.controller;

import com.api.atividade4.Dto.LoginDto;
import com.api.atividade4.Dto.RegisterDto;
import com.api.atividade4.data.AnaliseEntity;
import com.api.atividade4.data.FilmeEntity;
import com.api.atividade4.data.UserEntity;
import com.api.atividade4.data.UserRepository;
import com.api.atividade4.models.Preferencias;
import com.api.atividade4.service.AnaliseService;
import com.api.atividade4.service.FilmeService;
import com.api.atividade4.service.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Murilo
 */
@Controller
public class filmesController {
    
    @Autowired
    FilmeService filmeService;
    
    @Autowired
    AnaliseService analiseService;
    
    @Autowired
    UserService userService;
    
    
    @Autowired
    public filmesController(FilmeService filmeService, AnaliseService analiseService, UserService userService) {
        this.filmeService = filmeService;
        this.analiseService = analiseService;
        this.userService = userService;
    }
    
    
    

    private String pagLoginMsg;
    private String pagLoginClass;
    
    private String username = "murilo";
    
    //private UserEntity user;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @param tema
     * @param msg
     * @param classe
     * @return 
    **/
    
    
    @GetMapping("/")
    public ModelAndView pagLogin(@CookieValue(name = "preferencia", defaultValue = "claro") String tema, String msg, String classe){
        ModelAndView mv = new ModelAndView("pagLogin");
        
        if(msg == null){
           pagLoginMsg = ""; 
           pagLoginClass = "";
        }
        else{
           pagLoginMsg = msg;
           pagLoginClass = classe;
        }
        
        mv.addObject("msg", pagLoginMsg);
        //mv.addObject("user", new UserEntity());
        mv.addObject("preferencias", new Preferencias());
        mv.addObject("classe", pagLoginClass);
        mv.addObject("css", tema);
        mv.addObject("login", new LoginDto());
        return mv;
    }
    

    @GetMapping("/pagCriarConta")
    public ModelAndView pagCriarConta(@CookieValue(name = "preferencias", defaultValue = "claro") String tema, Model model, String msg, String classe, RedirectAttributes attribute){
        ModelAndView mv = new ModelAndView("pagCriarConta");
        attribute.addFlashAttribute("msg", msg);
        attribute.addFlashAttribute("classe", classe);
        model.addAttribute("user", new RegisterDto());
        model.addAttribute("css", tema);
        return mv;
    }
    
    
    
    
    
    @GetMapping("/index")
    public ModelAndView pagListaFilmes(@CookieValue(name="preferencia", defaultValue = "claro") String tema, Model model, String username){
        ModelAndView mv = new ModelAndView("index");
        
        //System.out.println(this.username);
        userService.setUserByUsername(username);
        this.setUsername(username);
        List<FilmeEntity> filmes = userService.allFilmesByUser();
        List<AnaliseEntity> analises = userService.allAnalisesByUser();
        model.addAttribute("preferencias", new Preferencias());
        model.addAttribute("css", tema);
        model.addAttribute("analises", analises);
        model.addAttribute("filmes", filmes);
        model.addAttribute("filme", new FilmeEntity());
        model.addAttribute("username", username);
        return mv;
    }
    

    @PostMapping("/salvarFilme")
    public String cadastrarFilme(@ModelAttribute("filme") FilmeEntity filme, Model model){
        
        //String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        System.out.println("Username: "+username);
        if(filme.getId() == null){
            //filmeService.cadastrarFilme(filme);
            //System.out.println("Username: " + username);
            userService.salvarFilme(username, filme);
        }
        else{
            //filmeService.atualizarFilme(filme.getId(), filme);
            userService.atualizarFilme(username, filme);
        }
        return "redirect:/";
    }
    
    
    @GetMapping("/atualizarFilme/{id}")
    public String PagAtualizarFilme(@CookieValue(name="preferencia", defaultValue = "escuro") String tema, @PathVariable(value = "id") Integer id, Model model){
        FilmeEntity filme = filmeService.getFilmeById(id);
        model.addAttribute("css", tema);
        model.addAttribute("filme", filme);
       return "atualizarFilme";
    }
    
    
    @GetMapping("/deletarFilme/{id}")
    public String deletarFilme(@PathVariable(value="id") Integer id, Model model){
        analiseService.DeletarAnalisesPorFilme(id);
        filmeService.deletarFilme(id);
        return "redirect:/";
    }
    
    
    
    

    @GetMapping("/adicionarAnalise/{id}")
    public String PagAdicionarAnalise(@CookieValue(name="preferencia", defaultValue = "claro") String tema, @PathVariable(value = "id") Integer id, Model model){
        FilmeEntity filme = filmeService.getFilmeById(id);
        model.addAttribute("css", tema);
        model.addAttribute("filme", filme);
        model.addAttribute("Analises", new AnaliseEntity());
        return "adicionarAnalise";
    }
    
   @PostMapping("/salvarAnalise/{id}")
    public String salvarAnalise(@ModelAttribute("Analises") AnaliseEntity a, @PathVariable(value="id") int filmeId, Model model){
        System.out.println(a.getAnalise());
        System.out.println(a.getId());
        a.setFilme(filmeId);
        System.out.println(a.getFilme());
        System.out.println(a.getNota());
        

        analiseService.adicionarAnalise(a);
        return "redirect:/";
    }
    
    @GetMapping("/deletarAnalise/{id}")
    public String deletarAnalise(@PathVariable(value = "id") Integer id){
        analiseService.deletarAnalise(id);
        return "redirect:/";
    }
    
    @GetMapping("atualizarAnalise/{id}")
    public String atualizarAnalise(@CookieValue(name="preferencia", defaultValue = "claro") String tema, @PathVariable(value = "id") Integer id, Model model){
        AnaliseEntity analise = analiseService.getAnaliseById(id);
        model.addAttribute("css", tema);
        model.addAttribute("Analise", analise);
        return "atualizarAnalise";
    }
    
    @PostMapping("/salvarAnaliseAtualizada")
    public String atualizarAnalise(@ModelAttribute("Analise") AnaliseEntity analise, Model model){
        analiseService.atualizarAnalise(analise.getId(), analise);
        return "redirect:/";
    }
    
    
}
