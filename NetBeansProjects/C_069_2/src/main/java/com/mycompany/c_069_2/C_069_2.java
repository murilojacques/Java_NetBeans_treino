/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_069_2;

/**
 *
 * @author Murilo
 */
public class C_069_2 {

    public static void main(String[] args) throws InterruptedException {
        
        MyThread thread1 = new MyThread();
        
        
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);
        
        
        
        thread1.start();
        //thread1.join(3000);//chamar esse metodo faz com que o progrma espere a thread especificada morrer antes de rodar a thread seguinte, caso um tempo seja definido como parametro vai esperar esse tempo antes de comecar a thread seguinte
        thread2.start();
        
        //thread1.setDaemon(true);
        //thread2.setDaemon(true);
        //System.out.println(1/0);
        
    }
}
