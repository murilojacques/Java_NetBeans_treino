/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_083;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Murilo
 */
public class C_083 {

    public static void main(String[] args) {
        /**Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(2.5);
        queue.offer(1.5);
        queue.offer(4.0);
        queue.offer(3.5);
        queue.offer(2.0);
        
      while(!queue.isEmpty()){
          System.out.println(queue.poll());
      }
      **/
      
        
        Queue<String> queue = new PriorityQueue<>(/**Collections.reverseOrder()**/);
        queue.offer("B");
        queue.offer("E");
        queue.offer("A");
        queue.offer("F");
        queue.offer("C");
        queue.offer("D");
        
      while(!queue.isEmpty()){
          System.out.println(queue.poll());
      }
    }
}
