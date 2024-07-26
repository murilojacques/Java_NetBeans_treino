/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application.ca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Ca {

    public static void main(String[] args) {
        String a ="";
        int b[] = {9, 7, 2, 15, 6, 1, 8};
        Arrays.sort(b);
        //b[2] = 18;
        for(int i =0; i < b.length; i++){
            System.out.println(b[i]);
        }
        
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("Sopa", "De Tomate");
        
        
        Scanner scanner = new Scanner(System.in);
        while(!a.equals("S")){
            System.out.println("Digite uma letra: ");
            a = scanner.nextLine();
            a = a.toUpperCase();
            
            if(a.equals("C")){
               break; 
            }
            
            
        }
    }
}
