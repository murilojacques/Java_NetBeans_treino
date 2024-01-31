/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_01;

import jakarta.persistence.EntityManager;

/**
 *
 * @author Murilo
 */
public class PacoteViagemDAO {
    public void cadastrar(pacoteViagem p){
        EntityManager em = EntityManagement.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            EntityManagement.closeEntityManager();
        }
    }
}
