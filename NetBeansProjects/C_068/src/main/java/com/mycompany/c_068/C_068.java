/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_068;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Murilo
 */
public class C_068 {

    public static void main(String[] args) {
        
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask(){
            int i = 10;
            @Override
            public void run() {
                if(i>0){
                    System.out.println(i+ " segundos ate o Ano Novo");
                    i--;
                }
                else{
                    System.out.println("FELIZ ANO NOVO!");
                    timer.cancel();
                }
            }
        };
        
        // Calendar esta sendo utilizado para definir um dia especifico com uma data especifica 
        //para depois ser utilizado como parametro de ativacao da contagem do Timer
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2024);
        date.set(Calendar.MONTH, Calendar.MARCH);
        date.set(Calendar.DAY_OF_MONTH, 30);
        date.set(Calendar.HOUR_OF_DAY, 10);
        date.set(Calendar.MINUTE, 11);
        date.set(Calendar.SECOND, 5);
        date.set(Calendar.MILLISECOND, 5);
        
        //timer.schedule(task, 3000);
        //timer.schedule(task, date.getTime());
        //timer.scheduleAtFixedRate(task, 0, 1000);
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);
        
    }
}
