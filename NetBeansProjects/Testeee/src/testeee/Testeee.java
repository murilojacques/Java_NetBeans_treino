/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeee;


import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Testeee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);
        Scanner vari = new Scanner(System.in);
         int opcao=0, i =0;
        String[] hospedes = new String[15];
        String pesquisa, nome;
       
        
        while(opcao != 3){
        System.out.println(" 1- cadastrar \n 2-pesquisar \n 3- sair");
        opcao = vari.nextInt();
        switch(opcao){
        
            case 1:
                
                if(i >= hospedes.length){
                System.out.println("numero maximo de hospedes cadastrados");
                
                }
                if(i < hospedes.length){System.out.println("Digite o nome do hospede: ");
                nome = variavel.nextLine();
                hospedes[i] = nome;
                i=i+1;}
              
                break;
            
            case 2:
                if(opcao==2){
               
                System.out.println("Digite o nome do hospede: ");
                pesquisa = variavel.nextLine(); 
                int a=0;
                for(int ia = 0; ia < hospedes.length; ia++){
              
                    if(pesquisa.equals(hospedes[ia])){
                    System.out.println("Hospede encontrado no indice "+ (ia+1));
                   }
                    else{
                        a=a+1;
                    }}
                    if(a==hospedes.length){
                    System.out.println("Hospede nao encontrado");
                    
                    }
                    a=0;
                
                }
                break;
             
            case 3:
                System.out.println("Codigo terminado");
                break;
        
        }}}}
        
    

