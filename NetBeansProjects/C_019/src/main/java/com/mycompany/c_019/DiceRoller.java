/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_019;

import java.util.Random;

/**
 *
 * @author Murilo
 */
public class DiceRoller {
    Random random = new Random();
    int i = 0;
    
    public void DiceRoller(){
        roll();
    }
    
    public void roll(){
        i = random.nextInt(6)+1;
        System.out.println(i);
    }
}
