/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    static final int TAM = 10;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[TAM];
    int i, contador;
    int a=0;

    System.out.println("Digite Os dez valores a serem guardados no array.");
    for(i=0; i<TAM; i++){
        System.out.println("\nvalor: " + i+1);
        numeros[i] = scanner.nextInt();
    }

    System.out.println("Ordem atual dos Valores no Array.");
    for(i=0; i<TAM; i++){
        System.out.println(i+1 + " Posicao: " + numeros[i]);
    }


    for(contador=1; contador < TAM; contador++){
        for(i=0; i<TAM - 1; i++){
            if(numeros[i] > numeros[i+1]){
                a = numeros[i];
                numeros[i] = numeros[i+1];
                numeros[i+1] = a;
            }
        }
    }

    System.out.println("\n\nValores do Array ordenados por BubbleSort.");
    for(i=0; i<TAM; i++){
    System.out.println(i+1 + " Posicao: " + numeros[i]);
    }
}
}
    

