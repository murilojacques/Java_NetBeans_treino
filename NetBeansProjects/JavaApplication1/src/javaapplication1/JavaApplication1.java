
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

    
    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);
       int a, b;
       
       System.out.println("Digite o numero de convidados para a festa: ");
       a = variavel.nextInt();
       
      if (a <= 220 && a >=151){
       
           b = a - 150;
           System.out.println("Use o auditorio Alfa \né necessario incluir mais " + b + " cadeiras");
       }
      
      if (a > 220 && a <= 350){
      
          System.out.println("Use o auditorio Beta");
      }
      
      if (a <= 150 && a >= 1){
      
          System.out.println("Use o auditorio Alfa");
      }
      
      if(a < 1 || a > 350){
      
          System.out.println("Numero de convidados invalido");
      }
       System.out.println("fim do programa");
               
       }
    }
    

