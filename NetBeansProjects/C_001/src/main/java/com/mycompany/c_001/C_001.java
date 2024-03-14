/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_001;

import static java.lang.String.format;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class C_001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");
        
        double a = 3.745;
        String b = String.format("%.2f", a);
        
        System.out.println(b);
        int c = 0;
        
        while(c != 3){
            System.out.println("HELP!");
            c++;
        }
    }
}
