/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.c_027;

/**
 *
 * @author Murilo
 */
public class C_027 {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", "Camaro", 2021);
        Carro carro2 = new Carro("Ford", "Mustang", 2022);
        Carro carro3 = new Carro(carro1);
        
        carro2.copiar(carro1);

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        carro1.descricao();
        System.out.println();
        carro2.descricao();
        System.out.println();
        carro3.descricao();
    }
}
