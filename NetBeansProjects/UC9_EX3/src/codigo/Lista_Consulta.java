/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

 
 import java.util.ArrayList;
import java.util.Arrays;
 import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Murilo
 */
public class Lista_Consulta {
    
    private static final List<Codigo> lista = new ArrayList<>();
    
    public static List<Codigo> Listar() {
          return lista;
      }
    
    
     public static void Adicionar(Codigo paciente) {
          lista.add(paciente);
      }
     
     
     }
        

    

    

    

