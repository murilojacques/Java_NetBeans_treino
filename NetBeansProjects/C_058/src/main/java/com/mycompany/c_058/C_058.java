/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.c_058;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class C_058 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.println("Digite a Sua Idade: ");
        i = scanner.nextInt();

        try {
            checarIdade(i);
            
        } catch (Exception e) {
            System.out.println("Um problema ocorreu: "+ e);
        }
    }
    
    public static void checarIdade(int i) throws AgeException{
        if(i < 18){
            throw new AgeException("\n" + "Voce deve ter 18+ anos de idade para assinar o servico");
        }
        else{
            System.out.println("Assinatura concluida");
        }
    }
}
