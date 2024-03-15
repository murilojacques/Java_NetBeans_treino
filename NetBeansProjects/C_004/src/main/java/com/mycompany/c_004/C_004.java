/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_004;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class C_004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome="";
        
        while(nome.isBlank()){
            System.out.print("Digite aqui o seu Nome: ");
            nome = scanner.nextLine();
        }
        
        System.out.println("Bem Vindo "+nome);
        
        
        for(int i = 10; i>=1; i--){
            System.out.println(i + "-");
        }
    }
}
