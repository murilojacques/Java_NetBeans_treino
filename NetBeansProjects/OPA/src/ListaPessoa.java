
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Murilo
 */
public class ListaPessoa {
    private static final List<Pessoa> lista = new ArrayList<>();
    
    public static List<Pessoa> Listar() {
          return lista;
      }
    
    public static void Adicionar(Pessoa pessoa) {
          lista.add(pessoa);
      }
}
