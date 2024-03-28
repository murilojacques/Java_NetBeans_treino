/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_060;

/**
 *
 * @author Murilo
 */
public class C_060 {

    public static void main(String[] args) {
        
        Outside out = new Outside();
        Outside.Inside in = out.new Inside();
        in.cumprimento();
    }
}
