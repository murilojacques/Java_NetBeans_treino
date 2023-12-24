/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste1;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Teste1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);
        int cc = 0;
        String verificar = "";

        while (!verificar.equals("N")) {
            System.out.println("\nDeseja fazer uma cambalhota: (S/N)");
            verificar = variavel.nextLine();
            if(!verificar.equals("S") && !verificar.equals("N")){
                break;
            }
            
            if (verificar.equals("S")) {
                cc++;
                System.out.println("\nCambalhota numero: " + cc);
            }
            
            if (cc >= 16) {
                System.out.println("NAO CONSIGO MAIS FAZER CAMBALHOTAS!!!");
                verificar = "N";
            } else {
                if(cc >=12){
                    System.out.println("Estou muito Cansado");
                    continue;
                }
                
                if(cc>=8){
                    System.out.println("Estou Cansado");
                    continue;
                }
                
                if (cc >= 4) {
                    System.out.println("Estou ficando cansado Cansado");
                    continue;
                }
                
                System.out.println("HAHA esta muito facil");
            }
        }
        System.out.println("\n\nESTOU LIVRE");
    }
        
}
