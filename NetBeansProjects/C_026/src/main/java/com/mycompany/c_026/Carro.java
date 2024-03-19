/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_026;

/**
 *
 * @author Murilo
 */
public class Carro extends Veiculo{

    @Override
    void andar() {
        System.out.println("O Motorista esta pilotando o Carro!");
    }

    @Override
    void parar() {
        System.out.println("O Motorista PAROU o Carro!");
    }
    
}
