/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_uec_db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class ParticipantesDAO {
    
    public void cadastrar(participantes participantes) {
        EntityManager em = EntityManagement.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(participantes);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            EntityManagement.closeEntityManager();
        }
    }
    
    public List<participantes> Listar(){
        EntityManager em = EntityManagement.getEntityManager();
        
        Query Listagem = em.createQuery("SELECT p FROM participantes p");
        List<participantes> participantes = Listagem.getResultList();
        return participantes;
    }
    
    
    public void Excluir(Object i){
        EntityManager em = EntityManagement.getEntityManager();
        String b =(String)i;
        int j = Integer.parseInt( b);
       participantes p = em.find(participantes.class,j);
       if(p != null){
           em.getTransaction().begin();
           em.remove(p);
           em.getTransaction().commit();
       }else{
           JOptionPane.showMessageDialog(null, "Selecione uma Linha");
       }
    }
}
