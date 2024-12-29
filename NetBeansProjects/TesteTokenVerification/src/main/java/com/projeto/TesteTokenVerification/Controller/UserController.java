/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.TesteTokenVerification.Controller;

import com.projeto.TesteTokenVerification.Data.UserEntity;
import com.projeto.TesteTokenVerification.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    
    @GetMapping("/PagLogin")
    public ModelAndView PagLogin(){
        ModelAndView mv = new ModelAndView("PagLogin");
        mv.addObject("user", new UserEntity());
        return mv;
    }
    
    
   /** @PostMapping("/Login")
    public String FazerLogin(@ModelAttribute("user") @Valid UserEntity user, BindingResult result, RedirectAttributes attribute){
        if(result.hasErrors()){
            return "redirect/PagLogin";
        }
        
    }**/
}
