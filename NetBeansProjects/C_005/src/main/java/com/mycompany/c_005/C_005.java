/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_005;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class C_005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas;
        int colunas;
        String simbolo = "";
        Random r = new Random();
        
        System.out.println("Coloque quantas Linhas: ");
        linhas = scanner.nextInt();
        System.out.println("Coloque quantas Colunas: ");
        colunas = scanner.nextInt();
        System.out.println("Qual Simbolo voce deseja mostrar: (Caracter Unico) ");
        simbolo = scanner.next();
        for(int i=1; i<=linhas; i++){
            System.out.println();
            for(int j=1; j<=colunas; j++){
                int a = r.nextInt(100);
                System.out.print(simbolo+"-"+a);
            }
        }
        
    }
}
