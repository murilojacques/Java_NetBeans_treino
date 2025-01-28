/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.controller;

import com.api.atividade4.Dto.LoginDto;
import com.api.atividade4.Dto.RegisterDto;
import com.api.atividade4.data.AnaliseEntity;
import com.api.atividade4.data.AnaliseRepository;
import com.api.atividade4.data.FilmeEntity;
import com.api.atividade4.data.FilmeRepository;
import com.api.atividade4.data.UserEntity;
import com.api.atividade4.data.UserFilmeEntity;
import com.api.atividade4.data.UserFilmeRepository;
import com.api.atividade4.data.UserRepository;
import com.api.atividade4.models.Preferencias;
import com.api.atividade4.service.AnaliseService;
import com.api.atividade4.service.FilmeService;
import com.api.atividade4.service.UserFilmeService;
import com.api.atividade4.service.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    UserFilmeService userFilmeService = new UserFilmeService();
    
    @Autowired
    FilmeRepository filmeRepository;
    
    @Autowired
    AnaliseRepository analiseRepository;
    
    @Autowired
    UserFilmeRepository userFilme;

    
    @Autowired
    public filmesController(FilmeService filmeService, AnaliseService analiseService, UserService userService, UserFilmeService userFilmeService) {
        this.filmeService = filmeService;
        this.analiseService = analiseService;
        this.userService = userService;
        this.userFilmeService = userFilmeService;
    }
    
    
    

    private String pagLoginMsg;
    private String pagLoginClass;
    
    private String username;
    
    private UserEntity user;

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
    
    
    
    /**
     *
     * @param tema
     * @param model
     * @param username
     * @param userFilme
     * @param filmeRepository
     * @param analiseRepository
     * @return
     */
    @GetMapping("/index")
    public ModelAndView pagListaFilmes(@CookieValue(name="preferencia", defaultValue = "claro") String tema, Model model, String username, 
            UserFilmeRepository userFilme, FilmeRepository filmeRepository, AnaliseRepository analiseRepository){
        
        ModelAndView mv = new ModelAndView("index");
        UserFilmeService u = new UserFilmeService();
        List<FilmeEntity> filmes = new ArrayList<>();
        List<AnaliseEntity> analises = new ArrayList<>();
        
        userService.setUserByUsername(username);
        this.setUsername(username);
        user = userService.findByUsername(username);
        filmes = u.findFilmesByUser(user.getId(), userFilme, new FilmeService(), filmeRepository);
        analises = u.findAnalisesByUser(user.getId(), userFilme, new AnaliseService(), analiseRepository);
        
        model.addAttribute("preferencias", new Preferencias());
        model.addAttribute("css", tema);
        model.addAttribute("analises", analises);
        model.addAttribute("filmes", filmes);
        model.addAttribute("filme", new FilmeEntity());
        model.addAttribute("username", username);
        //model.addAttribute("username1", username);
        //model.addAttribute("username2", username);

        return mv;
    }
    
    @GetMapping("/index/{username}")
    public ModelAndView pagListaFilmes(@CookieValue(name="preferencia", defaultValue = "claro") String tema, Model model,
            @PathVariable("username") String username){
        
        ModelAndView mv = new ModelAndView("index");
        UserFilmeService u = new UserFilmeService();
        List<FilmeEntity> filmes = new ArrayList<>();
        List<AnaliseEntity> analises = new ArrayList<>();
        
        if(this.username == null){
            userService.setUserByUsername(username);
            this.setUsername(username);
        }
        
        user = userService.findByUsername(username);
        filmes = u.findFilmesByUser(user.getId(), userFilme, new FilmeService(), filmeRepository);
        analises = u.findAnalisesByUser(user.getId(), userFilme, new AnaliseService(), analiseRepository);
        
        model.addAttribute("preferencias", new Preferencias());
        model.addAttribute("css", tema);
        model.addAttribute("analises", analises);
        model.addAttribute("filmes", filmes);
        model.addAttribute("filme", new FilmeEntity());
        model.addAttribute("username", username);
        //model.addAttribute("username1", username2);
        //model.addAttribute("username2", username2);

        return mv;
    }
    
    
    
    
    
    @PostMapping("/salvarFilme/{username}")
    public ModelAndView cadastrarFilme(@ModelAttribute("filme") FilmeEntity filme, @PathVariable("username") String username, Model model){
        
        //System.out.println("Username: "+username);
        if(filme.getId() == null){
            UserEntity user1 = userService.findByUsername(username);
            FilmeEntity filmeSalvo = filmeService.cadastrarFilme(filme);
            //System.out.println("FilmeSalvo: "+filmeSalvo.getId());
            userFilmeService.saveUserFilme(user1.getId(), filmeSalvo);
        }
        else{
            filmeService.atualizarFilme(filme.getId(), filme);
        }
        return pagListaFilmes("claro", model, username, userFilme, filmeRepository, analiseRepository);
    }
    
    /**
     *
     * @param id
     * @param username
     * @param tema
     * @param model
     * @return
     */
    @RequestMapping(value = "/atualizarFilme/{id}/{username}", method = RequestMethod.GET, produces = {"application/json"})
    public String PagAtualizarFilme(@PathVariable("id") Integer id, @PathVariable("username") String username, 
            @CookieValue(name="preferencia", defaultValue = "escuro") String tema, Model model){

       FilmeEntity filme = filmeService.getFilmeById(id);
       model.addAttribute("username", username);
       model.addAttribute("css", tema);
       model.addAttribute("filme", filme);
       return "atualizarFilme";
    }
    
    
    @GetMapping("/deletarFilme/{id}")
    public String deletarFilme(@PathVariable(value="id") Integer id, Model model){
        analiseService.DeletarAnalisesPorFilme(id);
        //userFilmeService.
        filmeService.deletarFilme(id);
        //userService.deletarFilme(username, id);
        return "redirect:/";
    }
    
    
    
    
    

    @GetMapping("/adicionarAnalise/{id}/{username}")
    public String PagAdicionarAnalise(@CookieValue(name="preferencia", defaultValue = "claro") String tema, @PathVariable(value = "id") Integer id,
            @PathVariable("username") String username, Model model){
        FilmeEntity filme = filmeService.getFilmeById(id);
        
        System.out.println("Username: " + username);
        
        model.addAttribute("username", username);
        model.addAttribute("css", tema);
        model.addAttribute("filme", filme);
        model.addAttribute("Analises", new AnaliseEntity());
        return "adicionarAnalise";
    }
    
    
   @PostMapping("/salvarAnalise/{id}/{username}")
    public ModelAndView salvarAnalise(@ModelAttribute("Analises") AnaliseEntity analise, @PathVariable("username") String username, @PathVariable(value="id") int filmeId, Model model){
        analise.setFilme(filmeId);
        AnaliseEntity savedAnalise = analiseService.adicionarAnalise(analise);
        UserEntity user1 = userService.findByUsername(username);
        System.out.println("username5: " + username);
        System.out.println("username6: " + model.getAttribute("username"));
        userFilmeService.salvarAnalise(filmeId, user1.getId(), savedAnalise);
        return pagListaFilmes("claro", model, username, userFilme, filmeRepository, analiseRepository);
    }
    
    @GetMapping("/deletarAnalise/{id}")
    public String deletarAnalise(@PathVariable(value = "id") Integer id){
        analiseService.deletarAnalise(id);
        return "redirect:/";
    }
    
    @GetMapping("atualizarAnalise/{id}/{username}")
    public String atualizarAnalise(@CookieValue(name="preferencia", defaultValue = "claro") String tema, @PathVariable(value = "id") Integer id,
            @PathVariable(value = "username") String username, Model model){
        AnaliseEntity analise = analiseService.getAnaliseById(id);
        System.out.println("username: "+username);
        model.addAttribute("css", tema);
        model.addAttribute("Analise", analise);
        model.addAttribute("username", username);
        return "atualizarAnalise";
    }
    
    @PostMapping("/salvarAnaliseAtualizada")
    public String atualizarAnalise(@ModelAttribute("Analise") AnaliseEntity analise, Model model){
        analiseService.atualizarAnalise(analise.getId(), analise);
        return "redirect:/";
    }
    
    
}
