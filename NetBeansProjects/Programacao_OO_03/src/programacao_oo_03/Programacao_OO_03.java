/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacao_oo_03;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Programacao_OO_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner v =new Scanner(System.in);
        String nome="";
        int numCon=0;
        String con="";
        String abrirNew="";
        
        
        System.out.println("Voce deseja Abrir Uma Conta? [S/N]");
        con = v.nextLine();
        
        
        if(con.equals("S")){
        
       while(!abrirNew.equals("N")){
        System.out.print("Qual o seu Nome: ");
        nome = v.nextLine();
        
        
            Conta_Bancaria Marcia =  new Conta_Bancaria(2, "Marcia");
            Conta_Bancaria Joao = new Conta_Bancaria(1, "Joao");
       }   
    }else{
            System.out.println("Entendemos");
        }
    
    }
}
