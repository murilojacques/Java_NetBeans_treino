/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_082;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Murilo
 */
public class C_082 {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        
        System.out.println(queue.isEmpty());
        
        queue.offer("Karen");
        queue.offer("Marcos");
        queue.offer("Joao");
        queue.offer("Harold");
        
        
        //System.out.println(queue.contains("Harold"));
        //System.out.println(queue.size());
        //System.out.println(queue.peek());
        
        /**queue.poll();
        queue.poll();
        System.out.println(queue);**/
        
    }
}
