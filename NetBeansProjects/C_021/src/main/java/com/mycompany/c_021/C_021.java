/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_021;

/**
 *
 * @author Murilo
 */
public class C_021 {

    public static void main(String[] args) {
        Comida comida1 = new Comida("Pizza");
        Comida comida2 = new Comida("Hamburguer");
        Comida comida3 = new Comida("Cachorro-quente");
        
        Comida[] geladeira = {comida1, comida2, comida3};
        
        System.out.println(geladeira[0].getNome());
        System.out.println(geladeira[1].getNome());
        System.out.println(geladeira[2].getNome());
        
    }
}
