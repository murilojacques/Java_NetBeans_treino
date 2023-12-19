
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

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
      
      public static void Atualizar(Pessoa pessoa){
          String[] colunas = { "Nome"};
  DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
  List<Pessoa> listaCompleta = ListaPessoa.Listar();
  
   for(int i=0; i<listaCompleta.size(); i++) {
     
      Pessoa pessoaAtual = listaCompleta.get(i);
      String[] linha = { 
          pessoaAtual.getNome()  
      };
       tabelaModelo.addRow(linha);
  }
  A.jTable1.setModel(tabelaModelo);
    };    
      }

