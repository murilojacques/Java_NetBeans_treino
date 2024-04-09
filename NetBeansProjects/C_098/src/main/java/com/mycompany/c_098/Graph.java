/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_098;

import java.util.ArrayList;

/**
 *
 * @author Murilo
 */
public class Graph {
    
    ArrayList<Node> nodes;
    int[][] matrix;
    
    Graph(int size){
        nodes = new ArrayList<>(); 
        matrix = new int[size][size];
    }
    
    public void addNode(Node node){
        nodes.add(node);
    }
    
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }
    
    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void Print(){
        System.out.print("  ");
        for(Node node: nodes){
            System.out.print(node.data + " ");
        }
        System.out.println(); 
        
        
        for(int i=0; i< matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j=0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
