/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_088;

import java.util.Arrays;

/**
 *
 * @author Murilo
 */
public class C_088 {

    public static void main(String[] args) {
        
        int array[] = new int[123456789];
        int target = 777775;
        
        for(int i =0; i<array.length; i++){
            array[i] = i;
        }
        
        //int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);
        
        if(index != -1){
            System.out.println("Alvo Encontrado no Index: "+index);
        }
        else{
            System.out.println("Deu nao");
        }
    }

    private static int binarySearch(int[] array, int target) {
        
        int low = 0;
        int high = array.length - 1;
        
        while(low <= high){
            int middle = low + (high - low)/2;
            int value = array[middle];
            System.out.println("Middle: "+middle);
            
            if(value < target){
                low = middle+1;
            }
            else if(value > target){
                high = middle-1;
            }
            else {
                return middle;// alvo encontrado
            }
        }
        
        return -1;// alvo nao encontrado
    }
}
