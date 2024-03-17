/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_011;

import java.util.*;
/**
 *
 * @author Murilo
 */
public class C_011 {

    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> lista = new ArrayList();
        
        
        ArrayList<String> listaConfeitaria = new ArrayList();
            listaConfeitaria.add("Bolo");
            listaConfeitaria.add("Bolo de chocolate");
            listaConfeitaria.add("Bolo de Laranja");
        
        ArrayList<String> listaMercado = new ArrayList();
            listaMercado.add("Arroz");
            listaMercado.add("Farofa");
            listaMercado.add("Carne");
        
        ArrayList<String> listabebida = new ArrayList();
            listabebida.add("refri");
            listabebida.add("cafe");
            listabebida.add("suco");
            
        System.out.println(listaConfeitaria);
        
        
        
        lista.add(listaConfeitaria);
        lista.add(listaMercado);
        lista.add(listabebida);
        
        System.out.println("\n"+lista);
        System.out.println("\n"+lista.get(1));
        System.out.println("\n"+lista.get(1).get(2));
    }
}
