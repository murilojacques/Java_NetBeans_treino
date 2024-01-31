/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_02;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Murilo
 */
public class EntityManagement {
    private static final String PERSISTENCE_UNIT = "projeto02";
    
   static jakarta.persistence.EntityManager em;
   static EntityManagerFactory fabrica;
    
    public static EntityManager getEm(){
        if(fabrica == null || !fabrica.isOpen()){
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        if(em == null || !em.isOpen()){
            em = fabrica.createEntityManager();
        }
        return em;
    }
        
    
    public static void closeEm(){
        if(em != null && em.isOpen()){
            em.close();
            fabrica.close();
        }
    }
}
