/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_015;

/**
 *
 * @author Murilo
 */
public class C_015 {

    public static void main(String[] args) {
       boolean myBoolean = true;
       char myChar = '@';
       String myString = "Murilo";
       int myInt = 50;
       double myDouble = 100.50;
       
       //Para printf é usada diferentes letras para definir o tipo de valor que vai ser colocado, o padrao é % + a primeira letra do tipo de valor.  EX: %d = % + d (d de Decimal para valor Numerico)
       //%b = Boolean
       //%c = Char
       //%s = String
       //%d = Int
       //%f = Float/Double      
       
       
        //System.out.printf("\nOpa eu sou %b, seu Cao", myBoolean);
        //System.out.printf("\nseu email %c tipo email", myChar);
        //System.out.printf("\nOla meu nome e %s, como vai", myString);
        //System.out.printf("\nOla meu nome e %10s, como vai", myString);
        //System.out.printf("\nOla meu nome e %-10s, como vai", myString);
        //System.out.printf("\nVai ser %d conto", myInt);
        //System.out.printf("\nVai ser %+d conto", myInt);
        //System.out.printf("\nVai ser %-d conto", myInt);
        //System.out.printf("\nO custo final sera de R$%f", myDouble);
        //System.out.printf("\nO custo final sera de R$%.2f", myDouble);
        //System.out.printf("\nO custo final sera de R$%07.2f", myDouble);
        System.out.printf("\nO custo final sera de R$ %,f", myDouble);
    }
}
