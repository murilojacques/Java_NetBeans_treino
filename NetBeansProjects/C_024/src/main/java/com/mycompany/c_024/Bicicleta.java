/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_024;

/**
 *
 * @author Murilo
 */
public class Bicicleta extends Veiculo{
    String cor;
    String rodas;
    
    @Override
    public void Mover(){
        System.out.println("Ele esta se Movendo ao Pedalar na bicicleta");
    }
    
    @Override
    public void Parar(){
        System.out.println("ele usou o freio da Bicicleta para parar"); 
    }
}
