/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_008;

/**
 *
 * @author Murilo
 */
public class C_008 {

    public static void main(String[] args) {
       String nome = "       Murilo   ";
       
       //boolean resultado = nome.equalsIgnoreCase("murilo");
       //int resultado = nome.length();
       //char resultado = nome.charAt(0);
       //int resultado = nome.indexOf("o");
       //boolean resultado = nome.isEmpty();
       //String resultado = nome.toUpperCase();
       //String resultado = nome.toLowerCase();
       //String resultado = nome.trim();
       //String resultado = nome.strip();
       String resultado = nome.replace("u", "T");
       
        System.out.println(resultado);
    }
}
