/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_085;

import java.util.ArrayList;

/**
 *
 * @author Murilo
 */
public class C_085 {

    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<String>();
        
        DynamicArray dynamicArray = new DynamicArray(5);
        System.out.println(dynamicArray.capacity);
        
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");
        
        //dynamicArray.insert(1, "Opa");
        //dynamicArray.delete("A");
        
        //System.out.println(dynamicArray.search("C"));
        
        System.out.println(dynamicArray);
        System.out.println("size: "+dynamicArray.size);
        System.out.println("capacity: "+dynamicArray.capacity);
        System.out.println("empty: "+dynamicArray.isEmpty());
    }
}
