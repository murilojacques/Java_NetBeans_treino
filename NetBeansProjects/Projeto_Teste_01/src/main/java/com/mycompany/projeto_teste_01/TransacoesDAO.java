/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_teste_01;

import jakarta.persistence.EntityManager;

/**
 *
 * @author Murilo
 */
public class TransacoesDAO {
    public void cadastrar(transacoes t){
        EntityManager em = EntityManagement.getEntityManager();
        
        try{
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            EntityManagement.closeEntityManager();
        }
    }
}
