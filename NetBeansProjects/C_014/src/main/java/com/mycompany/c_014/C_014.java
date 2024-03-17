/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_014;

/**
 *
 * @author Murilo
 */
public class C_014 {

    public static void main(String[] args) {
        
        int x = soma(1,2,3,4);
        System.out.println(x);
        
        
        double y = soma(1.2, 2.3, 3.4, 4.5, 5.6);
        System.out.println(y);
        
        
    }
    
    static int soma(int a, int b){
        System.out.println("Esse é p metodo de sobrecarga(Overloaded method) #1");
        return a + b;
    }
    
    static int soma(int a, int b, int c){
        System.out.println("Esse é p metodo de sobrecarga(Overloaded method) #2");
        return a + b + c;
    }
    
    static int soma(int a, int b, int c, int d){
        System.out.println("Esse é p metodo de sobrecarga(Overloaded method) #3");
        return a + b + c+ d;
    }
    
    static int soma(int a, int b, int c, int d, int e){
        System.out.println("Esse é p metodo de sobrecarga(Overloaded method) #4");
        return a + b + c + d + e;
    }
    
    static int soma(int a, int b, int c, int d, int e, int f){
        System.out.println("Esse é p metodo de sobrecarga(Overloaded method) #5");
        return a + b + c + d + e + f;
    }
    
    
    
    
    static double soma(double a, double b){
        System.out.println("Esse é p metodo de sobrecarga(Overloaded method) #6");
        return a + b;
    }
    
    static double soma(double a, double b, double c){
        System.out.println("Esse é p metodo de sobrecarga(Overloaded method) #7");
        return a + b + c;
    }
    
    static double soma(double a, double b, double c, double d){
        System.out.println("Esse é p metodo de sobrecarga(Overloaded method) #8");
        return a + b + c+ d;
    }
    
    static double soma(double a, double b, double c, double d, double e){
        System.out.println("Esse é p metodo de sobrecarga(Overloaded method) #9");
        return a + b + c + d + e;
    }
    
    static double soma(double a, double b, double c, double d, double e, double f){
        System.out.println("Esse é p metodo de sobrecarga(Overloaded method) #10");
        return a + b + c + d + e + f;
    }
}
