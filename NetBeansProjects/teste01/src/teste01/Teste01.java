/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste01;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class Teste01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
        
       /** double i=0.0f;
        System.out.println("Digite um Numero: ");
        i = a.nextDouble();
        i+= Math.pow(i, 2);
        String t;
        t = String.format("%.2f", i);
       boolean b = (i > 5.4f)? true : false;
        System.out.println(b + " O numero digitado foi: "+ t);**/
     
       int num = 1;
       int r = 0;
    
    while(num != r){
         num=-1;
         r = (int) (1 +  Math.random()*(11-1));
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero entre 1 a 10 e veja se acerta"));
    if(num == r){
        JOptionPane.showMessageDialog(null, "Acertou" + r);
    } else if(num != r){
        JOptionPane.showMessageDialog(null, "errou  "+ r + " " + Math.random());
    } else if(num > 10 || num < 1){
        JOptionPane.showMessageDialog(null, "Numero Invalido");
    }
    }
  }
    
}
