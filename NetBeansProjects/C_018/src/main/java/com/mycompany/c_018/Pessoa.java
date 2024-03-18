/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_018;

/**
 *
 * @author Murilo
 */
public class Pessoa {
   private String nome = "";
   private int idade = 0;
   private double altura = 0.0;

    public Pessoa(String n, int i, double a) {
        this.setNome(n);
        this.setIdade(i);
        this.setAltura(a);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void comer(){
        System.out.println(this.getNome()+" esta comendo");
    }
    
    public void beber(){
        System.out.println(this.getNome()+" esta bebendo");
    }
    
    public void apresentar(){
        System.out.println("Meu nome e "+this.getNome()+" tenho "+this.getIdade()+" anos de idade e "+ this.getAltura()+" de altura");
    }
    
}
