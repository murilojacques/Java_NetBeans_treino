/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacao_oo_10;

/**
 *
 * @author Murilo
 */
public class Programacao_OO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gafanhotos g = new Gafanhotos("Murilo", 17, "M", "Mu");
        Video v = new Video("ViDEO de Marcos"); 
        Visualizacao vis = new Visualizacao(g, v); 
        vis.filme.setViews(500);
        System.out.println(vis.filme.getViews());
        vis.avaliar();
        vis.avaliar();
        vis.avaliar();
        System.out.println(vis.filme.getAvaliacao());
    }

}
