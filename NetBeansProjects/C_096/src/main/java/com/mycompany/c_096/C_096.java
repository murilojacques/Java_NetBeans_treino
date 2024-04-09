/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_096;

/**
 *
 * @author Murilo
 */
public class C_096 {

    public static void main(String[] args) {
        
        int array[] = {9, 5, 1, 3, 7, 2, 4, 6, 8};
        
        QuickSort(array, 0, array.length-1);
        
        for(int i: array){
            System.out.println(i);
        }
    }

    private static void QuickSort(int[] array, int start, int end) {
        
        if(end <= start){
            return;
        }

        int pivot = partition(array, start, end);
        QuickSort(array, start, pivot-1);
        QuickSort(array, pivot+1, pivot-1);
        int temp =0;

    }
    
    private static int partition(int[] array, int start, int end) {
        
        int pivot = array[end];
        int i = start-1;
        
        for(int j=0; j<= end-1; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        
        return i;
    }
}
