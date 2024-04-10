/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_100;

import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class C_100 {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        
        //JOptionPane.showMessageDialog(null, "VIRUS VIRUS,  ENTRRE EM CONTATO COM A MICROSOFT!!!!!, DE PREFERENCIA COM O GATES OU HUSK", "Mensagem de Aviso", 0);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);
        
        graph.Print();
        
        System.out.println(graph.checkEdge(3, 2));
        
        System.out.println("");
        
        graph.depthFirstSearch(4);
    }
    
}
