/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacao_oo_01;

/**
 *
 * @author Murilo
 */
public class Programacao_OO_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       
       c1.setModelo("Bic");
       c1.setCor("Azul");
       c1.setPonta(0.5f);
       c1.setCarga(85);
       c1.tampar();
       
       c1.status();
       c1.rabiscar();
       
       
       Caneta c2 = new Caneta();
       
       c2.setModelo("Hostnet");
       c2.setCor("Preta");
       c2.setCarga(76);
       c2.setPonta(0.8f);
       c2.destampar();
       
       c2.status();
       c2.rabiscar();
    }
}
