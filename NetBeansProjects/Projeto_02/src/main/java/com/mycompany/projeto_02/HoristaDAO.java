/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_02;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author Murilo
 */
public class HoristaDAO {
     public void cadastrar(horista h){
        EntityManager em = EntityManagement.getEm();
        
        try{
            em.getTransaction().begin();
            em.persist(h);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            EntityManagement.closeEm();
        }
    }
     
     public List<horista> listar() {
        EntityManager em = EntityManagement.getEm();
        List horistas = null;
        try {
            String textoQuery = "SELECT h FROM horista h";
            Query buscaTransacao = em.createQuery(textoQuery);
            horistas = buscaTransacao.getResultList();
        } finally {
            EntityManagement.closeEm();
        }
        return horistas;
    }
}
