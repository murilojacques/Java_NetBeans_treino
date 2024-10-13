/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pr;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Pr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cara;
        
        System.out.println("Digite um caracter: ");
        cara = scanner.nextLine();
        
        switch(cara){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal");
            default:
                System.out.println(cara);
        }
    }
}
