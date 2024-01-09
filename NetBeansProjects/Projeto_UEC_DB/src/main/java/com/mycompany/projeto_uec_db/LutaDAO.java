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
public class LutaDAO {
    public void cadastrar(luta l){
        EntityManager em = EntityManagement.getEntityManager();
        
        try{
            em.getTransaction().begin();
            em.persist(l);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            EntityManagement.closeEntityManager();
        }
    }
    
    public boolean verificacao(Object i){
         EntityManager em = EntityManagement.getEntityManager();
         lutadores p = em.find(lutadores.class,i);
         boolean verificar = (p != null) ? true : false;
         
         if(verificar == false){
             JOptionPane.showMessageDialog(null, "Participante não encontrado, verifique se o ID foi informado Corretamente");
         }
         
         return verificar;
    }
    
    public List<luta> Listar(){
        EntityManager em = EntityManagement.getEntityManager();
         
        Query listagem = em.createQuery("SELECT l FROM luta l");
        List<luta> lista = listagem.getResultList();
        return lista;
    }
}
