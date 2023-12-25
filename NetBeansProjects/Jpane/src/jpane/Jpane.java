/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpane;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class Jpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);
        int v=0;
        double nv=0;
        int t=0;
        do{
       v = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um valor <br><em>[Valor  0  interrompe a insercao de dados]</em> </html>", "Boas Vindas", JOptionPane.WARNING_MESSAGE));
       System.out.println(v);
       nv++;
       t += v;
        } while(v != 0);
        
       JOptionPane.showMessageDialog(null, "<html><hr>\n" + "Numero de valores informados: "+ (nv-1) +  "<br>Valor total informado: "+ t + "<br>Media dos valores informados: " + String.format("%.1f",(t/(nv-1)))+ "</html>");
    }
    
}
