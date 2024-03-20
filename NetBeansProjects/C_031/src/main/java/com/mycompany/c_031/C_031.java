/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_031;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Murilo
 */
public class C_031 {

    public static void main(String[] args)  {
        try{
            
        FileWriter fw = new FileWriter("poema.txt");
        fw.write("Rosas sao vermelhas");
        fw.close();
        
        FileReader fr = new FileReader("poema.txt");
        int dados = fr.read();
        while(dados != -1){
            System.out.print((char)dados);
            dados = fr.read();
        }
        fr.close();
        }catch(IOException e){
            
        }
    }
}
