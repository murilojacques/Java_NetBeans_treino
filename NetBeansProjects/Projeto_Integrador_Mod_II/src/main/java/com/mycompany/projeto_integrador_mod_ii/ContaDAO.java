/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_integrador_mod_ii;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class ContaDAO {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void cadastrar(conta conta) {
        EntityManager em = EntityManagement.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(conta);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            EntityManagement.closeEntityManager();
        }
    }
    
    public List<conta> listar(String id) {
        EntityManager em = EntityManagement.getEntityManager();
        List conta = null;
        try {
            String textoQuery = "SELECT c FROM conta c" + " WHERE c.id = :id";
            Query buscaConta = em.createQuery(textoQuery);
            buscaConta.setParameter("id", id);
            conta = buscaConta.getResultList();
        } finally {
            EntityManagement.closeEntityManager();
        }
        return conta;
    }

    public void atualizar(conta d) {
        EntityManager em = EntityManagement.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            EntityManagement.closeEntityManager();
        }
    }

    public conta obter(int id) {
        EntityManager em = EntityManagement.getEntityManager();
        try {
            return em.find(conta.class, id);
        } finally {
            EntityManagement.closeEntityManager();
        }
    }

    public void excluir(int id) {
        EntityManager em = EntityManagement.getEntityManager();

        try {
            conta c = em.find(conta.class, id);
            if (c != null) {
                em.getTransaction().begin();
                em.remove(c);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
            
        } finally {
            EntityManagement.closeEntityManager();
        }
    }

    public conta verificar(String login, int senha) {
        EntityManager em = EntityManagement.getEntityManager();
        conta c = null;
        try {
            String textoQuery = "SELECT c FROM conta c" + " WHERE c.login = :login" + " AND c.senha = :senha";
            Query busca = em.createQuery(textoQuery);
            busca.setParameter("login", login);
            busca.setParameter("senha", senha);
            c = (conta) busca.getSingleResult();
            setId(c.getId());
        } finally {
            EntityManagement.closeEntityManager();
        }
        return c;
    }

    public int obterId() {
        EntityManager em = EntityManagement.getEntityManager();
        try {
            return Tela_Login.con.getId();
        } finally {
            EntityManagement.closeEntityManager();
        }
    }
    
    
}
