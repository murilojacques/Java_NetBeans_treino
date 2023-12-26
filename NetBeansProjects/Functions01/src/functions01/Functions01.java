/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functions01;

import java.util.Scanner;
import functions01.Operacoes;

/**
 *
 * @author Murilo
 */
public class Functions01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);
        System.out.println("Soma: 1 \nSubtracao: 2 \nMultiplicacao: 3 \nDivisao: 4 \n");

        System.out.print("Digite aqui: ");
        int v = variavel.nextInt();

        System.out.print("\nDigite o primeiro valor: ");
        double a = variavel.nextDouble();
        System.out.print("\nDigite o Segundo valor: ");
        double b = variavel.nextDouble();

        switch (v) {
            case 1:
                double sm = Operacoes.soma(a, b);
                System.out.println(String.format("\nResultado: "+"%.2f", sm));
                System.out.println(Operacoes.contador(a, b));
                break;

            case 2:
                double su = Operacoes.sub(a, b);
                System.out.println(String.format("\nResultado: "+"%.2f", su));
                System.out.println(Operacoes.contador(a, b));
                break;

            case 3:
                double mu = Operacoes.mult(a, b);
                System.out.println(String.format("\nResultado: "+"%.2f", mu));
                System.out.println(Operacoes.contador(a, b));
                break;

            case 4:
                double div = Operacoes.div(a, b);
                System.out.println(String.format("\nResultado: "+"%.2f", div));
                System.out.println(Operacoes.contador(a, b));
                break;
        }
    }

}
