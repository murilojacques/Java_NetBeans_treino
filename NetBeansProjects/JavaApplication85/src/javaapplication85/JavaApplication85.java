/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication85;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class JavaApplication85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int i = 1000;
        int c = random.nextInt(0, 10);
        int t = 0;
        
        System.out.println(c);
        
        while(i != c){
            System.out.println("Digite Um Numero: ");
            i = scanner.nextInt();
            t += 1;
        }
        System.out.println("Numero de Tentativas " + t);
    }
    
}
