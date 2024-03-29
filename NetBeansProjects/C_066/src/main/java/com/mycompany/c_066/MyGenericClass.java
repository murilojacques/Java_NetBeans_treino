/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_066;

/**
 *
 * @author Murilo
 */
public class MyGenericClass <Thing, Thing2 extends Number>{
    Thing x;
    Thing2 y;
    
    MyGenericClass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }
    
    public Thing2 getValue(){
        return y;
    }
}
