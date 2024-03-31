/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_071;

import java.util.*;

/**
 *
 * @author Murilo
 */
public class ProgramaCriptografia {

    private Scanner scanner;
    private Random random;
    private ArrayList<Character> lista;
    private ArrayList<Character> listaEmbaralhada;
    private char character;
    private String linha;
    private char[] letras;

    ProgramaCriptografia() {

        scanner = new Scanner(System.in);
        random = new Random();
        lista = new ArrayList();
        listaEmbaralhada = new ArrayList();
        character = ' ';

        novaChave();
        fazerPergunta();

    }

    private void fazerPergunta() {
        while (true) {
            System.out.println("*************************************************************");
            System.out.println("O que voce quer fazer? ");
            System.out.println("(N)ovaChave, (P)egarChave, (C)riptografar, (D)escriptografar, (S)air");
            char resposta = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch (resposta) {
                case 'N':
                    novaChave();
                    break;

                case 'P':
                    pegarChave();
                    break;

                case 'C':
                    Criptografar();
                    break;

                case 'D':
                    Descriptografar();
                    break;

                case 'S':
                    sair();
                    break;

                default:
                    System.out.println("Resposta invalida");
                    break;

            }

        }
    }

    private void novaChave() {
        character = ' ';
        lista.clear();
        listaEmbaralhada.clear();

        for (int i = 32; i < 127; i++) {
            lista.add(Character.valueOf(character));
            character++;
        }

        listaEmbaralhada = new ArrayList(lista);
        Collections.shuffle(listaEmbaralhada);
        System.out.println("Uma nova Chave foi gerada");

    }

    private void pegarChave() {
        System.out.println("Chave: ");
        for (Character x : lista) {
            System.out.print(x);
        }
        System.out.println();
        for (Character x : listaEmbaralhada) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void Criptografar() {
        System.out.println("Digite Uma frase para ser Ciptografada: ");
        String mensagem = scanner.nextLine();
        letras = mensagem.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if(letras[i] == lista.get(j)){
                    letras[i]=listaEmbaralhada.get(j);
                    break;// esse break e essencial
                }
            }
        }
        System.out.println("mensagem Criptografada: ");
        for(char x: letras){
            System.out.print(x);
        }
    }

    private void Descriptografar() {
        System.out.println("Digite Uma frase para ser Decriptografada: ");
        String mensagem = scanner.nextLine();
        letras = mensagem.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            
            for (int j = 0; j < listaEmbaralhada.size(); j++) {
                if(letras[i] == listaEmbaralhada.get(j)){
                    letras[i]=lista.get(j);
                    break;// esse break e essencial
                }
            }
        }
        System.out.println("mensagem Decriptografada: ");
        for(char x: letras){
            System.out.print(x);
        }
    }

    private void sair() {
        System.out.println("Obrigado, tenha um Bom Dia!");
        System.exit(0);
    }

}
