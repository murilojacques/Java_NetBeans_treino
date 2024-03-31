/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_069_1;

/**
 *
 * @author Murilo
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        if (this.isDaemon()) {
            System.out.println("Essa e uma Daemon Thread que esta funcionando");
        } else {
            System.out.println("Essa e uma User Thread que esta funcionando");
        }
    }
}
