/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TesteEx1.Model;

/**
 *
 * @author Murilo
 */
public class Analises {
    
    
    private int id;
    private Filmes filme;
    private String analise;
    private int nota;
    
     public Analises(){
    }
    
    public Analises(int id, Filmes filme, String analise, int nota){
        this.id = id;
        this.filme = filme;
        this.analise = analise;
        this.nota = nota;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Filmes getFilme() {
        return filme;
    }

    public void setFilme(Filmes filme) {
        this.filme = filme;
    }

    public String getAnalise() {
        return analise;
    }

    public void setAnalise(String analise) {
        this.analise = analise;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
}

