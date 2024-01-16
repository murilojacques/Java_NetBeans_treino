/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_teste_01;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Murilo
 */
public class ContaDAO {
    public void cadastrar(conta c){
        EntityManager em = EntityManagement.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            EntityManagement.closeEntityManager();
        }
    }
    
    public conta verificar(String login, int senha){
        EntityManager em = EntityManagement.getEntityManager();
        conta c =null;
        try{
            String textoQuery = "SELECT c FROM conta c" + " WHERE c.login = :login"+" AND c.senha = :senha";
            Query busca = em.createQuery(textoQuery);
            busca.setParameter("login", login);
            busca.setParameter("senha", senha);
            c = (conta) busca.getSingleResult();
        }finally{
            EntityManagement.closeEntityManager();
        }
        return c;
    }
    
    public void atualizar(conta c){
        EntityManager em = EntityManagement.getEntityManager();
        
        try{
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            EntityManagement.closeEntityManager();
        }
    }
}
