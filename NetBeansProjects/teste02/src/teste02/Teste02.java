/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste02;

import java.text.MessageFormat;
import java.lang.NumberFormatException;
import java.lang.IllegalArgumentException;

/**
 *
 * @author Murilo
 */
public class Teste02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     char[] b = {'O', 'p', 'a', ' ', 'T', 'u', 'd', 'o', ' ', 'B', 'e', 'm'};
     String[] arra = {"Opa", "Tudo", "bem"};
     String d ="   Murilo bonito   ";
     d = d.replace("bonito", "Lindao");
        System.out.println(d+ " aaa");
        
        System.out.println("Opa, "+d.strip()+ " q");
     int i = arra.length;
        String a = String.copyValueOf(b, 0, 12);
        System.out.println(a + "  " + i);
        try{
      String c = MessageFormat.format("Salve'', {0}", a);
        System.out.println(c);
        }catch(IllegalArgumentException r){
             throw r;
        
        }
    }
    
}
