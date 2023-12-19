/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.toentediado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
/**
 *
 * @author Murilo
 */
public class informacoesDao {
    public static void Cadastrar(informacoes dados){
        EntityManager em = DB_EntityManager.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(dados);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
              throw e;
        }finally{
              DB_EntityManager.closeEntityManager();
          }
    }
    
    public List<informacoes> listar(){
        EntityManager em = DB_EntityManager.getEntityManager();
        try{
            Query listagem = em.createQuery("SELECT i FROM informacoes i");
            List<informacoes> info = listagem.getResultList();
            return info;
        }catch(Exception e){
             em.getTransaction().rollback();
             throw e;
        }
    }
}
