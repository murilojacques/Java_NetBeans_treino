/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_017;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class C_017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro1 = new Carro();
        
        System.out.println("Qual o Modelo do Carro: ");
        carro1.setModelo(scanner.nextLine());
        System.out.println("Qual A cor do Carro: ");
        carro1.setCor(scanner.nextLine());
        System.out.println("Qual o Ano do Carro: ");
        carro1.setAno(scanner.nextInt());
        
        carro1.dirigir();
        
    }
}
