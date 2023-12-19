/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);
        String resposta="";
        
        System.out.println("Voce gostaria de receber indicacoes de exercicios fisicos para praticar?  (S/N)");
        resposta=variavel.nextLine();
        if(resposta.equals("S")){
        
            System.out.println("\n\nBom saber que voce esta interessado em nosso servico");
            System.out.println("\nVoce gostaria de 1-exercicios de resistencia ou 2-exercicios de velocidade");
            byte opcao = variavel.nextByte();
            
            SugestaoExercicio sugestao = new SugestaoExercicio();
            sugestao.gerar(opcao);
            
            System.out.println("Exercicio de musculacao: "+ sugestao.getExercicioMusculacao().toString());
            System.out.println("Exercicio de corrida: "+ sugestao.getExercicioCorrida().toString());
        }
        else{
        
            
        }
    }
    
}
