/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_029;

/**
 *
 * @author Murilo
 */
public class C_029 {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Bicicleta bicicleta1 = new Bicicleta();
        Barco barco1 = new Barco();
        
        Veiculo[] corredores = {carro1, bicicleta1, barco1};
        
        for(Veiculo v: corredores){
            v.andar();
        }
    }
}
