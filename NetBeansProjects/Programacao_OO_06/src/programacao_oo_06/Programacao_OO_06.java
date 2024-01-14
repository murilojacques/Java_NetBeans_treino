/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacao_oo_06;

/**
 *
 * @author Murilo
 */
public class Programacao_OO_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pessoa p[] = new Pessoa[5];
       
       p[0] = new Pessoa("Marcus de Almeida", 24, "M");
       p[1] = new Pessoa("Andreia Marques", 37, "F");
       p[2] = new Pessoa("Pedro Rocha", 21, "M");
       p[3] = new Pessoa("Manuela Cardoso", 15, "F");
       p[4] = new Pessoa("Vinicius Souza", 13, "M");
       
       Livro l1 = new Livro("Romeu e Julieta", "William Shakespeare", 192, true, p[2]);
       l1.folhear();
       l1.avancarPag();
       l1.fechar();
       l1.descricao();
    }
    
}
