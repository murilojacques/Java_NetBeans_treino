/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner variavel = new Scanner(System.in);
       Scanner vari = new Scanner(System.in);
       String a;
       int valor1, valor2;
       
      

       
       Venda venda1 = new Venda();
 
       System.out.println("Insira as informacoes relacionadas ao pacote de viagem ");
       System.out.println("\nInsira o destino da Viagem: ");
       venda1.pacoteVenda.setDestino(variavel.nextLine());
       System.out.println("\ninsira a quantidade de dias de viagem: ");
        venda1.pacoteVenda.setQdias(vari.nextInt());
       System.out.println("informe a margem de lucro do pacote de viagem: ");
       venda1.pacoteVenda.setMargemlucro(vari.nextInt());
       System.out.println("informe o valor estimado de taxas adicionais(Valor informado sera em porcentagem): ");
        venda1.pacoteVenda.setTaxadici(vari.nextInt());
       
       
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
       
       System.out.println("\n\nInsira as informacoes sobre a hospedagem \n");
       System.out.println("Descricao da hospedagem: ");
        venda1.pacoteVenda.hospedagem1.setDescricao(variavel.nextLine());
       System.out.println("\nvalor da diaria da hospedagem (considere o valor em dolar): ");
        venda1.pacoteVenda.hospedagem1.setValordiaria(vari.nextInt());
      
              
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
 
        
       System.out.println("\n\nInsira as informacoes relacionadas ao transporte \n");
       
      do{
       System.out.println("digite o modo de trasnporte (aereo, maritimo, rodoviario ou ferroviario): ");
       a = variavel.nextLine();
        venda1.pacoteVenda.transporte1.setTipo(a);
       switch(a){
           case "maritimo":
                venda1.pacoteVenda.transporte1.maritimo();
               break;
           case "aereo":
                venda1.pacoteVenda.transporte1.aereo();
               break;
           case "rodoviario":
                venda1.pacoteVenda.transporte1.rodoviario();
               break;
           case "ferroviario":
                venda1.pacoteVenda.transporte1.ferroviario();
               break;
           default :
               System.out.println("metodo de transporte invalido");
               break;
               
       }}while(!a.equals("maritimo")&& !a.equals("aereo")&& !a.equals("rodoviario")&& !a.equals("ferroviario") );
       
       System.out.println("\nDigite o valor do trasnporte (considere o valor em dolar): ");
        venda1.pacoteVenda.transporte1.setValor(vari.nextInt());
        venda1.pacoteVenda.transporte1.descrever();
       

       
       System.out.println("--------------------------------------------------------------------------------------------------------------------");
       System.out.println("--------------------------------------------------------------------------------------------------------------------");
       
       System.out.println("\n\nPacote de Viagem 1: \n");
        venda1.pacoteVenda.hospedagem1.descrever();
       System.out.println("tempo de estadia: "+ venda1.pacoteVenda.getQdias()+" dias");
       System.out.println("Valor total de hospedagem: $"+ venda1.pacoteVenda.calcularHospedagem( venda1.pacoteVenda.hospedagem1.getValordiaria(),  venda1.pacoteVenda.getQdias()));
       System.out.println("Margem total de lucro: "+venda1.pacoteVenda.valorlucro( venda1.pacoteVenda.getMargemlucro(),  venda1.pacoteVenda.getTaxadici()));
        venda1.pacoteVenda.transporte1.descrever();
       System.out.println("Valor total do pacote de viagem: "+ venda1.pacoteVenda.totalPacote( venda1.pacoteVenda.calcularHospedagem( venda1.pacoteVenda.hospedagem1.getValordiaria(),  venda1.pacoteVenda.getQdias()),  venda1.pacoteVenda.transporte1.getValor(),  venda1.pacoteVenda.valorlucro( venda1.pacoteVenda.getMargemlucro(),  venda1.pacoteVenda.getTaxadici())));
       
       
       System.out.println("\n\nPara a conversao de valor do pacote de viagem para Reais informe o valor do Dolar: ");
       venda1.setDolarReal(vari.nextInt());
       
       System.out.println("\n\n\n\nInsira seu nome: ");
       venda1.setNomecli(variavel.nextLine());
       System.out.println("Insira a forma de pagamento: ");
       venda1.setFormapaga(variavel.nextLine());
       System.out.println("\n\nVenda do pacote de viagem efetuada: ");
       
       venda1.descrever();
       
      System.out.println("Valor total do pacote de viagem em Reais: R$"+ venda1.converterValor( venda1.pacoteVenda.totalPacote( venda1.pacoteVenda.calcularHospedagem( venda1.pacoteVenda.hospedagem1.getValordiaria(),  venda1.pacoteVenda.getQdias()),  venda1.pacoteVenda.transporte1.getValor(), venda1.pacoteVenda.valorlucro( venda1.pacoteVenda.getMargemlucro(),  venda1.pacoteVenda.getTaxadici())), venda1.getDolarReal()));
       
       
    }
    
}
