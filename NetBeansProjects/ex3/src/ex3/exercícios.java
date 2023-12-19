/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author Murilo
 */
abstract class exercícios {
    private String nome;

    public exercícios(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
    return nome;
    }
}
