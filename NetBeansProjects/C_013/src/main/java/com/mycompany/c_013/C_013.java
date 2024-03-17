/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_013;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class C_013 {

    public static void main(String[] args) {
        
        
        int x;
        int y;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
        
        int z = soma(x, y);
        System.out.println(soma(x, y));
        JOptionPane.showMessageDialog(null,"O Resultado foi: "+ z);
        
        texto();
    }
    
    static int soma(int x, int y){
        return x+y;
    }
    
    static void texto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPA MEU BOM!");
        System.out.println("Como Vai? ");
        String resultado = scanner.nextLine();
        
        if(resultado.equalsIgnoreCase("bem")){
            System.out.println("\nQue Bom");
        }
        else if(resultado.equalsIgnoreCase("mal")){
            System.out.println("Putz");
        }
        else{
            System.out.println("Não oque responder ;-;");
        }
        
    }
}
