/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner variavel = new Scanner(System.in);
       Scanner vari = new Scanner(System.in);
       
       PacoteViagem pacoteViagem1 = new PacoteViagem();
       
      
      pacoteViagem1.transporte1.setValor(5);
      System.out.println(pacoteViagem1.transporte1.getValor());
    }
    
}
