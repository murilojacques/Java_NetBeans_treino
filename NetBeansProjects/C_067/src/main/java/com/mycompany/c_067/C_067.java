/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_067;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Murilo
 */
public class C_067 {

    public static void main(String[] args) throws IOException {
        
        FileOutputStream fileout = null;
        ObjectOutputStream out = null;
        
        try {
            Usuario usuario = new Usuario();
            usuario.nome = "Murilo";
            usuario.senha = "s";
            
            fileout = new FileOutputStream("C:\\Users\\Murilo\\Documents\\NetBeansProjects\\C_067\\InfoUsuario.ser");
            out = new ObjectOutputStream(fileout);
            
            out.writeObject(usuario);
            
            System.out.println("Informacoes do Usuario Salvo");
            
        } catch (FileNotFoundException ex) {    
        } finally {
                fileout.close();
        }
    }
}
