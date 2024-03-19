/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_025;

/**
 *
 * @author Murilo
 */
public class C_025 {

    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Batman", 34, "$$$");
        Heroi heroi2 = new Heroi("Superman", 32, "Superman");
        
        System.out.println(heroi1.descricao());
        System.out.println("");
        System.out.println(heroi2.descricao());
    }
}
