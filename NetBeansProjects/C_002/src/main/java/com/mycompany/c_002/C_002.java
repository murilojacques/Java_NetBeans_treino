/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_002;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class C_002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        double z;
        double a = 45.74;
        double b = 44.85;
        Double c = Math.max(a, b);
        
        try{
        System.out.println("Digite o valor de X: ");
        x = scanner.nextDouble();
        System.out.println("Digite o valor de Y: ");
        y = scanner.nextDouble();
        
        z = Math.sqrt((y*y)+(x*x));
        
        System.out.println(String.format("A Hipotenusa e: %.2f",z));
        
            System.out.println(c);
            
        }catch(Exception e){
            System.out.println("Valor não permitido!");
            throw e;
        }
        
        
        
    }
    
}
