/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_081;

import java.util.Stack;

/**
 *
 * @author Murilo
 */
public class C_081 {

    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();
        
        stack.push("Dark Souls");
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        
        /**stack.pop();
        stack.pop();
        stack.pop();
        String jogoFavorito = stack.pop();
        System.out.println(jogoFavorito);**/
        
        /**System.out.println(stack.peek());
        System.out.println(stack);**/
        
        System.out.println(stack.search("Skyrim"));
    }
}
