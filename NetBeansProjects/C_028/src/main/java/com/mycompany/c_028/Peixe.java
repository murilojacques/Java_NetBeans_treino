/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_028;

/**
 *
 * @author Murilo
 */
public class Peixe implements Presa, Predador{

    @Override
    public void Fugir() {
        System.out.println("O Peixe esta a Fugir (Nadando Muito rapido)");
    }

    @Override
    public void cacar() {
        System.out.println("*BURL BURL* Peixe comeu um peixe menor");
    }
    
}
