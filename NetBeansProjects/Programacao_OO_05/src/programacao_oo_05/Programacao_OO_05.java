/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacao_oo_05;

import static java.lang.System.exit;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class Programacao_OO_05 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Controle c = new Controle();

        try {
            System.out.print("Voce deseja ligar o sistema [S/N] ");
        String ls = a.nextLine();
            if (ls.equals("S")) {
                
                
                c.ligar();
            } else if (ls.equals("N")) {
                System.out.println("Finalizando programa");
            } else {
                JOptionPane.showMessageDialog(null, "Dado inserido Incorretamente");
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
