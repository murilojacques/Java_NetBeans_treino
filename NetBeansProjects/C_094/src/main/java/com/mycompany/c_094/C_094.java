/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_094;

/**
 *
 * @author Murilo
 */
public class C_094 {

    public static void main(String[] args) {
        
        System.out.println(power(2, 8));
    }

    
    private static int power(int base, int exponent) {
        if(exponent < 1){
            return 1;
        }
        return base * power(base, exponent-1);
    }
    
}
