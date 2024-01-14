/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pogramacao_oo_09;

/**
 *
 * @author Murilo
 */
public class Programacao_OO_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Peixe p = new Peixe();
       Ave a = new Ave();
       
       m.setPeso(85.3f);
       m.setIdade(2);
       m.setMembros(4);
       m.setCorPelo("Preto");
       m.locomover();
       m.alimentar();
       m.emitiSom();
        System.out.println("\n");
       p.setPeso(0.35f);
       p.setIdade(1);
       p.setMembros(0);
       p.setCorEscama("Azul");
       p.locomover();
       p.alimentar();
       p.emitiSom();
       p.soltarBolhas();
        System.out.println("\n");
       a.setPeso(0.89f);
       a.setIdade(2);
       a.setMembros(2);
       a.setCorPena("Branca");
       a.locomover();
       a.alimentar();
       a.emitiSom();
       a.fazerNinho();
        System.out.println("\n");
        System.out.println("\n");
        
       Canguru c = new Canguru();
       c.usarBolsa();
       c.locomover();
        System.out.println("\n");
       Cachorro dog = new Cachorro();
       
       dog.reagir(5, 10f);
    }
    
}
