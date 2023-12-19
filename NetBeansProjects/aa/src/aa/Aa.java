/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aa;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Aa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);
        
        PARAPA parapa = new PARAPA();
        
        System.out.println("AAAAAAAAAAAAA");
        parapa.setEndereco(variavel.nextLine());
        
        System.out.println(parapa.getEndereco());
    }
    
}
