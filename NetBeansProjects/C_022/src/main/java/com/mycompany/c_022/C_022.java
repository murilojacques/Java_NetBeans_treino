/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_022;

/**
 *
 * @author Murilo
 */
public class C_022 {

    public static void main(String[] args) {
       Carro carro1 = new Carro("BMW", 2021);
       Carro carro2 = new Carro("Lamborghini", 2020);
       
       Garagem garagem = new Garagem();
       garagem.estacionar(carro1);
       garagem.estacionar(carro2);
       
       garagem.descricao(0);
        System.out.println("");
       garagem.descricao(1);
    }
}
