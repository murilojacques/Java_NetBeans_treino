/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_093;

/**
 *
 * @author Murilo
 */
public class C_093 {

    public static void main(String[] args) {
        
       
        System.out.println(factorial(7));
    }

    private static int factorial(int num) {
        if(num < 1){
            return 1;
        }
        return num * factorial(num -1);
    }

    
}
