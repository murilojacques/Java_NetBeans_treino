/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_teste_01;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import com.mycompany.projeto_teste_01.Tela_Login;
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

    public void cadastrar(conta c) {
        EntityManager em = EntityManagement.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
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

    public void atualizar(conta c) {
        EntityManager em = EntityManagement.getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            EntityManagement.closeEntityManager();
        }
    }

    public conta obter(int i) {
        EntityManager em = EntityManagement.getEntityManager();
        try {
            conta c;
            c = em.find(conta.class, i);
            return c;
        } finally {
            EntityManagement.closeEntityManager();
        }
    }

    public int obterId() {
        EntityManager em = EntityManagement.getEntityManager();
        try {
            return Tela_Login.con.getId();
        } finally {
            EntityManagement.closeEntityManager();
        }
    }
    
    public void excluir(int i){
            EntityManager em = EntityManagement.getEntityManager();
            try{
                conta c = em.find(conta.class, i);
                if(c!=null){
                    em.getTransaction().begin();
                    em.remove(c);
                    em.getTransaction().commit();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Conta Nao existe");
                }
            }finally{
                EntityManagement.closeEntityManager();
            }
        }
}
