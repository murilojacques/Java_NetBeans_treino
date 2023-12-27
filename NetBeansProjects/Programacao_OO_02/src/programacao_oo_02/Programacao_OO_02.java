/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacao_oo_02;

/**
 *
 * @author Murilo
 */
public class Programacao_OO_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.status();
        
        
        Caneta c2 = new Caneta("BIC", 0.6f, "Preta");
        
        c2.status();
    }
    
}
