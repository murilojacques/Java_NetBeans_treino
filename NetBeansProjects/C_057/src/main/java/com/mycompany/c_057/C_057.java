/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_057;

import java.util.HashMap;

/**
 *
 * @author Murilo
 */
public class C_057 {

    public static void main(String[] args) {
        HashMap<String, String> paises = new HashMap<String, String>();
        
        paises.put("Brasil", "Brasilia");
        paises.put("EUA", "Washington DC");
        paises.put("India", "new Delhi");
        paises.put("Russia", "Moscow");
        paises.put("China", "Beijing");
        
        //System.out.println(paises);
        //paises.remove("India");
        //System.out.println(paises.get("Brasil"));
        //paises.clear();
        //System.out.println(paises);
        //System.out.println(paises.size());
        //paises.replace("EUA", "Detroit");
        //System.out.println(paises.containsKey("Inglaterra"));
        //System.out.println(paises.containsValue("Brasilia"));
        
        for(String p:  paises.keySet()){
            System.out.print(p + "\t" + "=");
            System.out.println(" "+paises.get(p));
        }
    }
}
