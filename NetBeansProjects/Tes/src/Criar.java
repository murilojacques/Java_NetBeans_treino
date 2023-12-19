
import java.io.File;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Murilo
 */
public class Criar {
    public static void main(String[] args)
          {
        
              try {
                  File obj = new File("C://teste//arquivo.txt");
                  if (obj.createNewFile()) {
                      System.out.println("Arquivo criado: " + obj.getName());
                  }
                  else {
                      System.out.println("Arquivo já existe.");
                  }
              }
              catch (IOException e) {
                  System.out.println("Ocorreu um erro." + e.getMessage());
              }
          }
}
