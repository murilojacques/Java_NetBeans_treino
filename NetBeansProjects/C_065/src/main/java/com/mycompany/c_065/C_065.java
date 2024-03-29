/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.c_065;

/**
 *
 * @author Murilo
 */
public class C_065 {

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {4.5, 5.6, 6.7, 7.8, 8.9};
        Character[] charArray = {'O', 'P', 'A'};
        String[] stringArray = {"Salve", "meu", "bom"};

        //mostrarArray(intArray);
        //mostrarArray(doubleArray);
        //mostrarArray(charArray);
        //mostrarArray(stringArray);
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }

    public static <Thing> void mostrarArray(Thing[] array) {
        for (Thing x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    
    public static <Thing> Thing getFirst(Thing[] array) {
        return array[0];
    }
    
}
