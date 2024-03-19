/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_025;

/**
 *
 * @author Murilo
 */
public class Pessoa {
    String nome = "";
    int idade = 0;
    
    Pessoa(String n, int i){
        this.setNome(n);
        this.setIdade(i);
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
    
    public String descricao(){
        return  "Nome: " +this.getNome() + "\n"+ "Idade: " + this.getIdade() + "\n";
    }
}
