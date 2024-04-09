/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_097;

import java.util.Hashtable;

/**
 *
 * @author Murilo
 */
public class C_097 {

    public static void main(String[] args) {
        
        Hashtable<String, String> table = new Hashtable<>(10);
        
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");
        
        //table.remove(777);
        
        for(String key: table.keySet()){
            System.out.println(key.hashCode() % 10 +"\t"+key + "\t" + table.get(key));
        }
        
    }
}
