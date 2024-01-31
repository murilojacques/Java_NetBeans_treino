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
public class AssalariadoDAO {
     public void cadastrar(assalariado a){
        EntityManager em = EntityManagement.getEm();
        
        try{
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            EntityManagement.closeEm();
        }
    }
     
     public List<assalariado> listar() {
        EntityManager em = EntityManagement.getEm();
        List assalariados = null;
        try {
            String textoQuery = "SELECT a FROM assalariado a";
            Query buscaTransacao = em.createQuery(textoQuery);
            assalariados = buscaTransacao.getResultList();
        } finally {
            EntityManagement.closeEm();
        }
        return assalariados;
    }
}
