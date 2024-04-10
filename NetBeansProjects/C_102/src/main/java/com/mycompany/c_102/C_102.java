/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_102;

/**
 *
 * @author Murilo
 */
public class C_102 {

    public static void main(String[] args) {
        
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(6));
        tree.insert(new Node(7));
        tree.insert(new Node(2));
        tree.insert(new Node(4));
        tree.insert(new Node(3));
        
        //tree.display();
        
        System.out.println(tree.search(7));
        
        tree.remove(3);
        tree.display();
    }
}
