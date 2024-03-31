/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_069_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Murilo
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println("Thread #2 : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Thread #2 esta terminada");
    }
    
}
