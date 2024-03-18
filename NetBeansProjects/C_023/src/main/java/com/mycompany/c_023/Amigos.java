/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_023;

/**
 *
 * @author Murilo
 */
public class Amigos {
    String nome;
    static int nAmigos;
    
    public Amigos(String nome) {
        this.nome = nome;
        nAmigos++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        
    }
    
    
    static void MostrarNAmigos(){
        System.out.println("Voce tem " + nAmigos + " Amigos");
    }
}
