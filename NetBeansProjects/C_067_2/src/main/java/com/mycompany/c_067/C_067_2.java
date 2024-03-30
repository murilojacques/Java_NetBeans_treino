/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_067;

import java.io.IOException;
import java.io.*;

/**
 *
 * @author Murilo
 */
public class C_067_2 implements Serializable{
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    
        Usuario u = null;
        
        FileInputStream fileIn = new FileInputStream("C:\\Users\\Murilo\\Documents\\NetBeansProjects\\C_067\\InfoUsuario.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        u = (Usuario) in.readObject();
        
        System.out.println(u.nome);
        System.out.println(u.senha);
    }
}
