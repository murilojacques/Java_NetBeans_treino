/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_084;

import java.util.LinkedList;

/**
 *
 * @author Murilo
 */
public class C_084 {

    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<String>();
        
        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
        */
        
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.pop();
        
        linkedList.add(4, "E");
        linkedList.remove("B");
        System.out.println(linkedList.indexOf("F"));
        
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("!");
        linkedList.addLast("?");
        
        System.out.println(linkedList);
        
        
        linkedList.removeFirst();
        linkedList.removeLast();
        
        System.out.println(linkedList);
        
        
    }
}
