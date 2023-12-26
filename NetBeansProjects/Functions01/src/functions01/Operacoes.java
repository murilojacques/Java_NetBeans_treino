/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions01;


/**
 *
 * @author Murilo
 */
public class Operacoes {
     
    public static double soma (double a, double b){
        double s = a+b;
         return s;
    }
    
    public static double sub (double a, double b){
        double s = a - b;
        return s;
    }
    
    public static double mult(double a, double b){
        double s = a * b;
        return s;
    }
    
    public static double div(double a, double b){
        double s = a / b;
        return s;
    }
    
    public static String contador(double i , double f){
        String t ="";
        f += 0.1;
        System.out.println("Contagem entre os valores informados: \n");
        for(double c = i; c<=f; c+=0.1){
          String fot = String.format("%.2f", c);
            t += fot + "\n";
           
        }
        return t;
    }
}
