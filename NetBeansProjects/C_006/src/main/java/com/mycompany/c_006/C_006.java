/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_006;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class C_006 {

    public static void main(String[] args) {
        String[] carros = {"Camaro", "Ferrari", "BMW", "Mercedes", "Lamborghini"};
        String[] pessoas = new String[10];
        Scanner scanner = new Scanner(System.in);
        int j=0;
        String an;
        
        Random r = new Random();
        int i = r.nextInt(5);
        System.out.println(carros[i]);
        
        
        
        do{
            System.out.println("Digite o seu Nome: ");
            an = scanner.nextLine();
            if(!an.equals("Pare")){
            pessoas[j] = an;
            j++;
            }
        }while(!an.equals("Pare"));
        
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
