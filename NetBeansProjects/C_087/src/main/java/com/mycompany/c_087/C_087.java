/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_087;

/**
 *
 * @author Murilo
 */
public class C_087 {

    public static void main(String[] args) {
        int[] array = {9, 7, 2, 5, 4, 1, 6, 3};
        
        int index = linearSearch(array, 1);
        
        if(index != -1){
            System.out.println("Elemento encontrado em index: "+index);
        }
        else{
            System.out.println("Elemento nao encontrado");
        }
    }

    private static int linearSearch(int[] array, int i) {
        for(int j=0; j< array.length; j++){
            if(array[j] == i){
                return j;
            }
        }
        
        return -1;
    }
}
