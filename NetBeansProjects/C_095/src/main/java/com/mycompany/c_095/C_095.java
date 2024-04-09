/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_095;

/**
 *
 * @author Murilo
 */
public class C_095 {

    public static void main(String[] args) {
        
        int array[] = {8, 2, 5, 3, 7, 1, 9, 6, 4};
        
        mergeSort(array);
        
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    private static void mergeSort(int[] array) {
        
        int length = array.length;
        
        if(length <= 1){
            return;
        }
        
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        
        int i =0; // leftArray
        int j=0; //rightArray
        
        for(; i < length; i++){
            if(i< middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    
    
    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        
        int i=0;
        int l =0;
        int r=0;
        
        while(l< leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        } 
    }
    
}
