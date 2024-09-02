/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application.mavenproject4;

/**
 *
 * @author Murilo
 */
public class Mavenproject4 {
    
    static int valor;
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        calc(10, 10);
        
        System.out.println(valor);
        
    }
    
    public static void calc(int a, int b){
       valor = a+b;
    }
}
