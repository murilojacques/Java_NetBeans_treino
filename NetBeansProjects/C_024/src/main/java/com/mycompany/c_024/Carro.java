/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_024;

/**
 *
 * @author Murilo
 */
public class Carro extends Veiculo{
    int portas;
    int rodas;
    
     @Override
    public void Mover(){
        System.out.println("Ele Acelerando o carro");
    }
    
    @Override
    public void Parar(){
        System.out.println("ele usou o freio para parar o Carro"); 
    }
}
