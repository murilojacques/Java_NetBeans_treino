/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_022;

import java.util.ArrayList;


/**
 *
 * @author Murilo
 */
public class Garagem {
    ArrayList<Carro> carro = new ArrayList<Carro>();

    public Carro getCarro(int i) {
        return carro.get(i);
    }

    public void setCarro(Carro carro) {
        this.carro.add(carro);
    }
    
    public void estacionar(Carro c){
        this.setCarro(c);
    }
    
    public void descricao(int i){
        Carro c = this.getCarro(i);
        System.out.println("Modelo: "+c.getModelo());
        System.out.println("Ano: "+c.getAno());
    }
}
