/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste_projeto_duastabelas_sql;

import jakarta.persistence.EntityManager;

/**
 *
 * @author Murilo
 */
public class TelefoneDAO {
    public void cadastrar(telefone t){
        EntityManager em = Entity_Management.getEntityManager();
        
        try{
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            Entity_Management.closeEntityManager();
        }
    }
    
    public telefone obter(int i){
        EntityManager em = Entity_Management.getEntityManager();
        try{
           return em.find(telefone.class, i);
        }finally{
            Entity_Management.closeEntityManager();
        }
    }
}
