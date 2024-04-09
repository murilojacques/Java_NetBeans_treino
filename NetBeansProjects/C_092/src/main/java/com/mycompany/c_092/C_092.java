/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_092;

/**
 *
 * @author Murilo
 */
public class C_092 {

    public static void main(String[] args) {
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        
        InsertionSort(array);
        
        for(int i: array){
            System.out.println(i);
        }
    }

    private static void InsertionSort(int[] array) {
        for(int i=1; i<array.length; i++){
            int temp = array[i];
            int j = i - 1;
            
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;  
        }
    }
}
