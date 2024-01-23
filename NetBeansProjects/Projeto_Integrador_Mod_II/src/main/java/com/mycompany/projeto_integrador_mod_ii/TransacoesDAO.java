/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_integrador_mod_ii;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

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
     
     public List<transacoes> listar(String id) {
        EntityManager em = EntityManagement.getEntityManager();
        List transacao = null;
        try {
            String textoQuery = "SELECT c FROM transacoes c" + " WHERE c.conta_origem_id = :id";
            Query buscaTransacao = em.createQuery(textoQuery);
            buscaTransacao.setParameter("id", id);
            transacao = buscaTransacao.getResultList();
        } finally {
            EntityManagement.closeEntityManager();
        }
        return transacao;
    }
     
      public transacoes BuscarCliente(int id) {
        EntityManager em = EntityManagement.getEntityManager();
        transacoes c = null;
        try {
            String textoQuery = "SELECT t FROM transacoes t" + " WHERE c.conta_origem_id = :id";
            Query busca = em.createQuery(textoQuery);
           
            busca.setParameter("id", id);
            c = (transacoes) busca.getSingleResult();
            
        } finally {
            EntityManagement.closeEntityManager();
        }
        return c;
    }
}
