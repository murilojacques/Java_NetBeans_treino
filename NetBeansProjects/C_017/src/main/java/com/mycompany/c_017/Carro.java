/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_017;

/**
 *
 * @author Murilo
 */
public class Carro {

    private String modelo = "";
    private String cor = "";
    private int ano = 0;
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
    
    public void dirigir(){
        System.out.println("La vai Fulano com seu carro modelo "+this.getModelo()+" um carro magnifico com seus belos tons de "+ this.getCor()+ " , Seu ano fde fabricacao foi "+ this.getAno());
    }
    
}
