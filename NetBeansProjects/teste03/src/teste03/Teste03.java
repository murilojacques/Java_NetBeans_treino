/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste03;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Teste03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         *
         * String a = "Opa Como vai, Tudo suave meu Mano?"; String[] r = new
         * String[1000]; r = a.split(" ", r.length); try{ for(int i=0;
         * i<r.length; i++){ System.out.println(r[i]); } }catch(Exception e){
         * throw e; }
         *
         */

        Scanner variavel = new Scanner(System.in);
        String a = "";
        System.out.println("Digite seu nome: ");
        a = variavel.nextLine();
        boolean b = (a.strip().toUpperCase().contains("MARCOS"));
        System.out.println(b);

    }

}
