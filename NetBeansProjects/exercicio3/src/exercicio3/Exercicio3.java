/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       Scanner variavel = new Scanner(System.in);
       Scanner vari = new Scanner(System.in);
       Scanner v = new Scanner(System.in);
      
       String tipoFuncionario="";
       int cont=0, porcentagemGeral=0;
       
       
       Funcionario[] empregado = new Funcionario[10];
       
       
       
           while(!tipoFuncionario.equals("pare")&& cont<10){
       System.out.println("\nPara parar a insercao de dados digite 'pare' na aba de definicao abaixo");
       System.out.println("\nDefina se e assalariado ou horista: ");
       tipoFuncionario = variavel.nextLine();
       if(tipoFuncionario.equals("assalariado")){
       
        empregado[cont]=new Assalariado();
       
        System.out.println("\nEscreva o seu nome");
        empregado[cont].setNome(variavel.nextLine());
        System.out.println("Digite o seu cpf: ");
        empregado[cont].setCpf(v.nextLine());
        System.out.println("Digite o seu endereco: ");
        empregado[cont].setEndereco(variavel.nextLine());
        System.out.println("Insira o seu numero de telefone: ");
        empregado[cont].setTelefone(vari.nextInt());
        System.out.println("Insira o setor em que trabalha: ");
        empregado[cont].setSetor(variavel.nextLine());
        
        empregado[cont].CalculosalarioMensal();
        
        cont++;
       }
       if(tipoFuncionario.equals("horista")){
       
           empregado[cont]=new Horista();
           
           System.out.println("\nEscreva o seu nome");
        empregado[cont].setNome(variavel.nextLine());
        System.out.println("Digite o seu cpf: ");
        empregado[cont].setCpf(variavel.nextLine());
        System.out.println("Digite o seu endereco: ");
        empregado[cont].setEndereco(variavel.nextLine());
        System.out.println("Insira o seu numero de telefone: ");
        empregado[cont].setTelefone(vari.nextInt());
        System.out.println("Insira o setor em que trabalha: ");
        empregado[cont].setSetor(variavel.nextLine());
        
        empregado[cont].CalculosalarioMensal();
        
        cont++;
       }  
      }
     
     for(int j=0; j<cont; j++){
    empregado[j].Descricao();
    }
     
     
  System.out.println("\n\n\nInforme a porcentagem de aumento de salario dos funcionarios: ");
  porcentagemGeral=vari.nextInt();
  for(int j=0; j<cont; j++){
   empregado[j].setPorcentagem(porcentagemGeral);
  }
  
   for(int j=0; j<cont; j++){
    empregado[j].AumentarSalario();
    
    }
}}

