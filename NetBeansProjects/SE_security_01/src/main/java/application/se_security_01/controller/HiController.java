/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.se_security_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Murilo
 */
@RestController
public class HiController {
   
    @GetMapping("/hi")
    public String sayHi(){
        return "Hi Everyone";
    }
    
    
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Everyone";
    }
}
