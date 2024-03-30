/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_067;

import java.io.Serializable;

/**
 *
 * @author Murilo
 */
public class Usuario implements Serializable{
    
    String nome;
    String senha;
    
    public void salve(){
        System.out.println("Ola "+nome);
    }
}
