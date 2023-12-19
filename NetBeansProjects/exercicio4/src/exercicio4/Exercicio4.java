/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);
        
        
        String tipoImposto="";
        
        
        Pagamentos valorPagamento = new Pagamentos();
        System.out.println("\nNome da Empresa: ");
        valorPagamento.setNomeEmpresa(variavel.nextLine());
        
        while(!tipoImposto.equals("pare")){
        System.out.println("\nPara parar a insercao de dados digite 'pare' abaixo");
        System.out.println("Informe o tipo de imposto (PIS/IPI): ");
        tipoImposto=variavel.nextLine();
        
        if(tipoImposto.equals("PIS")){  
           valorPagamento.impostoPis.setTipoImposto(tipoImposto);
           valorPagamento.PIS();
        
        
        }
        
        if(tipoImposto.equals("IPI")){
           valorPagamento.impostoIpi.setTipoImposto(tipoImposto);
           valorPagamento.IPI();
        }
        }
        System.out.println("\n\nO nome da empresa: "+valorPagamento.getNomeEmpresa());
        for(int i=0; i<valorPagamento.pagamentos.size(); i++){
         if(i<valorPagamento.pagamentos.size()){
      System.out.println("\nO tipo de imposto e: "+ valorPagamento.pagamentos.get(i));   
      i++;
         }
      System.out.println("O valor a ser pago e de: "+ valorPagamento.pagamentos.get(i));
     }
    }
   
}
