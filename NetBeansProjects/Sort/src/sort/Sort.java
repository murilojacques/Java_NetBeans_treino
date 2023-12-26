/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sort;


import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Murilo
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[] = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        int n[] = new int[20];
        
        Arrays.fill(n, 8);
        
        Arrays.sort(num); // Organizar um vetor em sentido crescente
        
        int pos = Arrays.binarySearch(num, 5);
        /** binarySearch faz uma busca binaria e retorna em que posicao 
         * foi encontrado o valor pedido dentro do vetor especificado**/
        
        
        for(int valor: n){
            System.out.print(valor + " ");
        }
        System.out.println("\n");
        for(int valor: num){
            System.out.print(valor + " ");
            
        }
        System.out.println("\n");
    }
    
}
