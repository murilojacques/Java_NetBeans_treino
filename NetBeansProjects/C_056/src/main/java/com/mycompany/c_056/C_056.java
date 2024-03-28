/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_056;



enum Planeta{
    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8),
    PLUTAO(9); // Ta aqui pq sempre deixam ele de lado, coitadinho;
    
    int i;
    
    Planeta(int numeracaoPlaneta){
        this.i = numeracaoPlaneta;
    }
}

public class C_056 {

    public static void main(String[] args) {
        
        Planeta meuPlaneta = Planeta.TERRA;
        possoViverLa(meuPlaneta);
    }
    
    public static void possoViverLa(Planeta p){
        switch(p){
            case TERRA:
                System.out.println("Ta suave meu Bom, pode viver la tranquilo");
                System.out.println("Esse e o planeta numero #" + p.i);
                break;
            case MARTE:
                System.out.println("Vai da nao, MAS provavelmente vai ser a primeira colonia Terraquia no futuro, MUAHAHAHAHAHAHA");
                System.out.println("Esse e o planeta numero #" + p.i);
                break;
            case PLUTAO:
                System.out.println("Mano coitado nem e mais planeta");
                System.out.println("Esse e o planeta numero #" + p.i);
                break;
            default:
                System.out.println("nao tem como viver nesse Planeta... ainda");
                System.out.println("Esse e o planeta numero #" + p.i);
                break;
        }
    }
}
