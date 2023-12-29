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
        Scanner v = new Scanner(System.in);
        Scanner va  = new Scanner(System.in);
        Conta_Manegement cm = new Conta_Manegement();
        
        int swt = 0;
        int numCon = 1;
        
        String con = "";
        String abrirNew = "";
        String nome = "";

        while (swt != 6) {
            System.out.println("Criar Conta: 1\n" + "Abrir Conta: 2\n" + "Fechar Conta: 3\n" + "Sacar: 4\n" + "Depositar: 5\n" + "Fechar Programa: 6\n");
            swt = va.nextInt();

            switch (swt) {
                case 1:
                    System.out.print("\nVoce Deseja Criar uma Conta? [S/N]");
                    con = v.nextLine();

                    if (con.equals("S")) {
                        System.out.print("Qual o seu Nome: ");
                        nome = v.nextLine();
                        Conta_Bancaria conta = new Conta_Bancaria(numCon, nome);
                        cm.AdicionarCon(conta);
                        numCon +=1;
                    }else{
                        break;
                    }    
                    break;
                    
                case 2:
                    
                    break;
            }

            Conta_Bancaria conta = new Conta_Bancaria(2, "Marcia");
            Conta_Bancaria Joao = new Conta_Bancaria(1, "Joao");

        }

    }
}
