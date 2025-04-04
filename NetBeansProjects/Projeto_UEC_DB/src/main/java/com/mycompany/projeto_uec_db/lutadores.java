/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_uec_db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Murilo
 */
@Entity
public class lutadores {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    
    private int idade;
    
    private float altura;
    
    private String nacionalidade;
    
    private float peso;
    
    private String categoria;
    
    private int vitorias;
    
    private int derrotas;
    
    private int empates;

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
       if (this.getPeso()< 52.2){
           this.categoria = "Invalido";
       } else if(this.getPeso() <= 70.3){
        this.categoria = "peso leve";
       } else if(this.getPeso() <= 83.9){
           this.categoria = "peso medio";
       } else if(this.getPeso() <= 120.2){
           this.categoria = "peso pesado";
       } else{
           this.categoria = "invalido";
       }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void ganharLuta(){
        this.setVitorias( this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empateLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    public void apresentar(){
        System.out.println("CHEGOU A HORA! Apresentando "+this.getNome());
        System.out.println("Diretamente de seu pais de origem: "+this.getNacionalidade());
        System.out.println("Com "+this.getIdade() + " anos de Idade e " + this.getAltura() + " de Altura");
        System.out.println("pesando "+ this.getPeso() + "Kg");
        System.out.println(this.getVitorias()+" vitorias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
    }
    
    
     public void status(){
        System.out.println(this.getNome()+" e um "+this.getCategoria());
        System.out.println("ganhou "+this.getVitorias() + " Vezes");
        System.out.println("perdeu "+this.getDerrotas() + " Vezes");
        System.out.println("empatou "+this.getEmpates() + " Vezes");
    }
}
