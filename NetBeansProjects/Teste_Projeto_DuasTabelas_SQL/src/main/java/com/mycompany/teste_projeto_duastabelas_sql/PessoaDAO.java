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
public class PessoaDAO {
    public void cadastrar(pessoa p){
        EntityManager em = Entity_Management.getEntityManager();
        
        try{
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            Entity_Management.closeEntityManager();
        }
    }
    
    public pessoa confirmar(int i){
        EntityManager em = Entity_Management.getEntityManager();
        try{
            boolean c;
            em.find(pessoa.class, i);
           return em.find(pessoa.class, i);
        }finally{
            Entity_Management.closeEntityManager();
        }
    }
}
