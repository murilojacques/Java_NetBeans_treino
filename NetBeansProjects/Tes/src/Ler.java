
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Murilo
 */
public class Ler {
     public static void main(String[] args)
          {
              try {
                  File obj = new File("C:\\Users\\Murilo\\Documents\\NetBeansProjects\\Tes\\obj.txt");
                  Scanner Reader = new Scanner(obj);
                  while (Reader.hasNextLine()) {
                      String data = Reader.nextLine();
                      System.out.println(data);
                  }
                  Reader.close();
              }
              catch (FileNotFoundException e) {
                  System.out.println("Ocorreu algum erro.");
              }
          }
}
