/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.toentediado;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Murilo
 */
public class DB_EntityManager {
    
    private static String PERSISTENCE_UNIT = "toentediado";
    
   private static jakarta.persistence.EntityManager em;
    private static EntityManagerFactory fabrica;
    
 
    public static jakarta.persistence.EntityManager getEntityManager(){
        if(fabrica == null || !fabrica.isOpen())
            fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        
        if(em == null || !em.isOpen())
            em = fabrica.createEntityManager();

        return em;
    }
    
    public static void closeEntityManager(){
        if(em.isOpen() && em != null){
            
            em.close();
            fabrica.close();
        }}
}
