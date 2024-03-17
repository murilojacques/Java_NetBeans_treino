/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_010;

import java.util.ArrayList;

/**
 *
 * @author Murilo
 */
public class C_010 {

    public static void main(String[] args) {
       ArrayList<String> comida = new ArrayList<String>();
       
      comida.add("Pizza");
      comida.add("Hamburger");
      comida.add("Arroz");
      comida.add("Carne");
      
      for(int i =0; i<comida.size(); i++){
          System.out.println(comida.get(i));
      }
      
      comida.remove(2);
        System.out.println("\n");
        
      comida.set(0, "Rodeio de Pizza");
        
      for(String c: comida){
          System.out.println(c);
      }
      
    }
}
