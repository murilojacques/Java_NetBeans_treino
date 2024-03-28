/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.c_061;

/**
 *
 * @author Murilo
 */
public class C_061 {

    public static void main(String[] args) {

        Cumprimento ola = new Cumprimento() {
            @Override
            public void bemVindo() {
                System.out.println("Suave Parca");
            }

        };
        
        Cumprimento ola2 = new Cumprimento();
        
        ola.bemVindo();
        ola2.bemVindo();
    }
}
