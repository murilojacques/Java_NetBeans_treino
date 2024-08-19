/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.teste;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class main {
     public static void main(String[] args) {
        int vetor[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        int valor;
        float v = 81f;
         System.out.println("Media: " + (v/10));
        
    for(int i=0; i<vetor.length; i++){
        System.out.println("\nDigite um valor: ");
        valor = scanner.nextInt();
        vetor[i] = valor;
    }

    System.out.println("Lista de numeros Digitados: ");
    for(int i=0; i<vetor.length; i++){
        System.out.println(" " + vetor[i]);
    }
    }
}
