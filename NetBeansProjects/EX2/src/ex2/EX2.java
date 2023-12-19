/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import exercicio2.Hospedagem;
import exercicio2.PacoteViagem;
import exercicio2.Transporte;
import exercicio2.Venda;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner variavel = new Scanner(System.in);
       Scanner vari = new Scanner(System.in);
       String a;
       int valor1, valor2;
       Transporte transporte1 = new Transporte();
       Hospedagem hospedagem1 = new Hospedagem();
       PacoteViagem pacoteviagem1 = new PacoteViagem();
       Venda venda1 = new Venda();
 
       System.out.println("Insira as informacoes relacionadas ao pacote de viagem ");
       System.out.println("\nInsira o destino da Viagem: ");
       pacoteviagem1.setDestino(variavel.nextLine());
       System.out.println("\ninsira a quantidade de dias de viagem: ");
       pacoteviagem1.setQdias(vari.nextInt());
       System.out.println("informe a margem de lucro do pacote de veagem: ");
       pacoteviagem1.setMargemlucro(vari.nextInt());
       
       
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
       
       System.out.println("\n\nInsira as informacoes sobre a hospedagem \n");
       System.out.println("Descricao da hospedagem: ");
       hospedagem1.setDescricao(variavel.nextLine());
       System.out.println("\nvalor da diaria da hospedagem (considere o valor em dolar): ");
       hospedagem1.setValordiaria(vari.nextInt());
       System.out.println( hospedagem1.getDescricao()+"  "+ hospedagem1.getValordiaria());
       
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
 
        
       System.out.println("\n\nInsira as informacoes relacionadas ao transporte \n");
       
      do{
       System.out.println("digite o modo de trasnporte (aereo, maritimo, rodoviario, etc...): ");
       a = variavel.nextLine();
       transporte1.setTipo(a);
       switch(a){
           case "maritimo":
               transporte1.maritimo();
               break;
           case "aereo":
               transporte1.aereo();
               break;
           case "rodoviario":
               transporte1.rodoviario();
               break;
           case "ferroviario":
               transporte1.ferroviario();
               break;
           default :
               System.out.println("metodo de transporte invalido");
               break;
               
       }}while(!a.equals("maritimo")&& !a.equals("aereo")&& !a.equals("rodoviario")&& !a.equals("ferroviario") );
       
       System.out.println("\nDigite o valor do trasnporte (considere o valor em dolar): ");
       transporte1.setValor(vari.nextInt());
       transporte1.descrever();
       
       System.out.println("--------------------------------------------------------------------------------------------------------------------");
       System.out.println("--------------------------------------------------------------------------------------------------------------------");
       
       System.out.println("\n\nPacote de Viagem 1: \n");
       hospedagem1.descrever();
       System.out.println("tempo de estadia: "+pacoteviagem1.getQdias()+" dias");
       System.out.println("Valor total de hospedagem: $"+pacoteviagem1.thospedagem(hospedagem1.getValordiaria(), pacoteviagem1.getQdias()));
       //margem de lucro fica nessa linha//
       transporte1.descrever();
       
       
       
       
       System.out.println("\n\n\n\nInsira seu nome: ");
       venda1.setNomecli(variavel.nextLine());
       System.out.println("Insira a forma de pagamento: ");
       venda1.setFormapaga(variavel.nextLine());
       
       
       //Murilo do futuro analisa a ordem que as info ta sendo inserida no codigo, ta meio bizzarro.//
       
      } 
       
} 
    

