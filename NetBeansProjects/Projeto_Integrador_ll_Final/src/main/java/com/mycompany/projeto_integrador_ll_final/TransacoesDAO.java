/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_integrador_ll_final;

import jakarta.persistence.EntityManager;

/**
 *
 * @author Murilo
 */
public class TransacoesDAO {
     public void cadastrar(transacoes atividade) {
        EntityManager em = EntityManagement.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(atividade);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            EntityManagement.closeEntityManager();
        }
    }
}
