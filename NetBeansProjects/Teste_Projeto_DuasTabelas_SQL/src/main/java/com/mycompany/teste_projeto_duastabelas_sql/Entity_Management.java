/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste_projeto_duastabelas_sql;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Murilo
 */
public class Entity_Management {
    private static final String PERSISTENCE_UNIT = "Teste";
    
    private static jakarta.persistence.EntityManager em;
    private static EntityManagerFactory fabrica;
    
    public static EntityManager getEntityManager(){
        if(!fabrica.isOpen() && fabrica == null){
            fabrica = Persistence.createEntityManagerFactory( PERSISTENCE_UNIT);
        }
        if(!em.isOpen() && em == null){
            em = fabrica.createEntityManager();
        }
        return em;
    }
    
    
     public static void closeEntityManager(){
        if(em.isOpen() || em != null){
            em.close();
            fabrica.close();
        }
    }
}
