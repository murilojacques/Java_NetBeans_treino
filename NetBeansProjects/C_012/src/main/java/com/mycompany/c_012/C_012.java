/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_012;

import java.util.ArrayList;

/**
 *
 * @author Murilo
 */
public class C_012 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList();
        
        nomes.add("Murilo");
        nomes.add("Lucas");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Maria");
        
        for(String n: nomes){
            System.out.println(n);
        }
        
        
        
        System.out.println("\n\n");
        
        
        
        String[] animais = {"Cachorro", "Gato", "Rato", "Passaro", "Sapo", "Cavalo"};
        
        for(String a: animais){
            System.out.println(a);
        }
    }
}
