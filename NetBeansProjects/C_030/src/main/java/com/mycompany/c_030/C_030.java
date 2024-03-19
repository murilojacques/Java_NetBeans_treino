/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_030;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class C_030 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Animal animal;
        int i;
        
        System.out.println("Qual animal?");
        System.out.print("(1 = Cachorro) ou (2 = Gato): ");
        i = scanner.nextInt();
        
        if(i == 1){
            animal = new Cachorro();
            animal.emitirSom();
            
        }
        else if(i == 2){
            animal = new Gato();
            animal.emitirSom();
        }
        else{
            System.out.println("Numero invalido");
        }
    }
}
