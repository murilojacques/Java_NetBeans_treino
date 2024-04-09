/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_091;

/**
 *
 * @author Murilo
 */
public class C_091 {

    public static void main(String[] args) {
        int[] array = {7, 15, 3, 2, 9, 13, 4, 10, 6, 14, 12, 5, 1, 11, 8};
        
        SelectionSort(array);
        
       for(int i: array){
           System.out.println(i);
       } 
    }

    private static void SelectionSort(int array[]) {
        for(int i=0; i < array.length-1; i++){
            int minNum = i;
            for(int j = i+1; j< array.length; j++){
                if(array[minNum] > array[j]){
                    minNum = j;
                }
            }
            
            int temp = array[i];
            array[i] = array[minNum];
            array[minNum] = temp;
        }
    }
}
