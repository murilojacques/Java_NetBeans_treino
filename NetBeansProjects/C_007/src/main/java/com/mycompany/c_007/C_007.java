/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_007;

/**
 *
 * @author Murilo
 */
public class C_007 {

    public static void main(String[] args) {
        String[][] lista = new String[3][3];
        
        lista[0][0] = "A";
        lista[0][1] = "B";
        lista[0][2] = "C";
        lista[1][0] = "D";
        lista[1][1] = "E";
        lista[1][2] = "F";
        lista[2][0] = "G";
        lista[2][1] = "H";
        lista[2][2] = "I";
        
        for(int i=0; i < lista.length; i++){
            System.out.println();
            for(int j=0; j < lista[i].length; j++){
                System.out.print(lista[i][j] + " ");
            }
        }
    }
}
