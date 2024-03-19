/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_027;

/**
 *
 * @author Murilo
 */
public class Carro {
   private String marca = "";
   private String modelo = "";
   private int ano = 0;
    
    
    Carro(String m, String mo, int a){
        this.setMarca(m);
        this.setModelo(mo);
        this.setAno(a);
    }
    
    Carro(Carro c){
        this.copiar(c);
    }
    
    public void descricao(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
    }
    
    public void copiar(Carro c){
        this.setMarca(c.getMarca());
        this.setModelo(c.getModelo());
        this.setAno(c.getAno());
    }
    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
