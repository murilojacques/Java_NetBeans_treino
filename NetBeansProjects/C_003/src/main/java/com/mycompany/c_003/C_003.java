/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_003;
import java.util.Random;
/**
 *
 * @author Murilo
 */
public class C_003 {

    public static void main(String[] args) {
        Random r = new Random();
        
        int x = r.nextInt(6)+1;
        double y = r.nextDouble();
        boolean z = r.nextBoolean();
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
