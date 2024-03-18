/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_020;

/**
 *
 * @author Murilo
 */
public class C_020 {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Massa Fina");
        Pizza pizza2 = new Pizza("Massa alta", "Molho de tomate");
        Pizza pizza3 = new Pizza("Massa alta", "Molho de tomate", "Baska");
        Pizza pizza4 = new Pizza("Massa fina", "Molho de tomate", "Baska", "Parmesao e Catupiri");
        Pizza pizza5 = new Pizza();
        
        pizza1.listaIngredientes();
        System.out.println("");
        System.out.println(pizza4.toString());
        
    }
}
