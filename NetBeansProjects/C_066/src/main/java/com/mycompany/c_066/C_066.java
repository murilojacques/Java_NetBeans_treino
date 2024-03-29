/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_066;

/**
 *
 * @author Murilo
 */
public class C_066 {

    public static void main(String[] args) {
        
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Salve");
        
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
        
        System.out.println();
        System.out.println();
        
        MyGenericClass<Integer, Integer> generic1 = new MyGenericClass<>(1, 9);
        MyGenericClass<Double, Double> generic2 = new MyGenericClass<>(3.14, 1.01);
        MyGenericClass<Character, Double> generic3 = new MyGenericClass<>('@', 6.78);
        MyGenericClass<String, Integer> generic4 = new MyGenericClass<>("Salve", 47);
        
        System.out.println(generic1.getValue());
        System.out.println(generic2.getValue());
        System.out.println(generic3.getValue());
        System.out.println(generic4.getValue());
    }
}
