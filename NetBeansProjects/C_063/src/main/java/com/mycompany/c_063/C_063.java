/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.c_063;

/**
 *
 * @author Murilo
 */
public class C_063 {

    public static void main(String[] args) {
        
        String nome = "Murilo Jacques Freitas";
        char simbolo = '?';
        
        MyInterface myInterface = (n, s) -> {
            System.out.println("Salve " + n);
            System.out.println("Como vai" + s);
        };
        
        MyInterface myInterface2 = (x, y) -> {
            System.out.println("Salve "+x+y);  
        };
        
        myInterface.mensagem(nome, simbolo);
        myInterface2.mensagem(nome, simbolo);
    }
}
