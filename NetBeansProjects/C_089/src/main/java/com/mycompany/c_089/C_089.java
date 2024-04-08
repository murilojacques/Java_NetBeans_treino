/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_089;

/**
 *
 * @author Murilo
 */
public class C_089 {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 6, 12, 36, 72, 216, 432, 1296, 2592, 7776, 15552};
        int index = interpolationSearch(array, 2592);
        
        if(index != -1){
            System.out.println("Elemento encontrado no Index: "+index);
        }
        else{
            System.out.println("Nao deu");
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        
        int high = array.length-1;
        int low = 0;
        
        while(value >= array[low] && value <= array[high] && low <= high){
            
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            
            System.out.println("probe: "+probe);
            
            if(array[probe] == value){
                return probe;
            }
            else if(array[probe] < value){
                low = probe+1;
            }
            else{
                high = probe -1;
            }
        }
        
        return -1;
    }
}
