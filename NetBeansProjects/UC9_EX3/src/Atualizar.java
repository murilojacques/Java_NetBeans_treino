

import codigo.Codigo;
import codigo.Lista_Consulta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Murilo
 */
public class Atualizar {
     
     
    public static void Atualizar(){
         String[] colunas = { "Paciente", "CPF", "Telefone", "Data", "Ja era paciente", "Consulta Realizada"};
  DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
 List<Codigo> listaCompleta = new ArrayList();
  listaCompleta = Lista_Consulta.Listar();
 
  
   for(int i=0; i<listaCompleta.size(); i++) {
     
      Codigo pacienteAtual = listaCompleta.get(i);
      String[] linha = { 
          pacienteAtual.getPaciente(),
          pacienteAtual.getCPF(),
          pacienteAtual.getTelefone(),
          pacienteAtual.getData(),
          pacienteAtual.getJPaciente(),
          pacienteAtual.getConRealizada()    
      };
       tabelaModelo.addRow(linha);
  }
 Tela_Agendamento.Tabela2.setModel(tabelaModelo);
    };   
    
    
   

     static void excluirPaciente(int posPaciente){
     List<Codigo> listaCompleto = new ArrayList();
     listaCompleto = Lista_Consulta.Listar();
     if(posPaciente >= 0){
        
         String[] options = { "Sim", "Não" };
         
         int deletar = JOptionPane.showOptionDialog(
                 null,
                 "Tem certeza que deseja excluir?", 
                 "Exclusão de aluno", 
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, 
                 null, 
                 options, 
                 options[0]
         );
         
       
         if(deletar == 0){
               
                 listaCompleto.remove(posPaciente);
                 
                
                 Atualizar.Atualizar();
         }else{
             
            Tela_Agendamento.Tabela2.clearSelection();             
         }
     }  
  }
}
