/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_025;

/**
 *
 * @author Murilo
 */
public class Heroi extends Pessoa{
    String superPoder = "";
    
    Heroi(String n, int i, String s){
       super(n, i);
       this.setSuperPoder(s);
    }

    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }
    
    
     public String descricao(){
        return super.descricao() + "SuperPoder: " +this.getSuperPoder();
    }
    
}
