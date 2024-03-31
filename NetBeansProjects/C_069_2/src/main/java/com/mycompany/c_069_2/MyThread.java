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
public class MyThread extends Thread{
    
    @Override
    public void run(){
        for(int i = 10; i>0; i--){
            System.out.println("Thread #1 : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        System.out.println("Thread #1 esta terminada");
    }
}
