/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_028;

/**
 *
 * @author Murilo
 */
public class C_028 {

    public static void main(String[] args) {
        Coelho coelho = new Coelho();
        Aguia aguia = new Aguia();
        Peixe peixe = new Peixe();
        
        aguia.cacar();
        coelho.Fugir();
        peixe.Fugir();
        peixe.cacar();
    }
}
