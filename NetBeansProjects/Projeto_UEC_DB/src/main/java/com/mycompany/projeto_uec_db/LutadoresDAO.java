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
public class LutadoresDAO {
    
    public void cadastrar(lutadores participantes) {
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
    
    public List<lutadores> Listar(){
        EntityManager em = EntityManagement.getEntityManager();
        
        Query Listagem = em.createQuery("SELECT l FROM lutadores l");
        List<lutadores> participantes = Listagem.getResultList();
        return participantes;
    }
    
    public List<lutadores> ListarFiltro(String nomeLutador){
        EntityManager em = EntityManagement.getEntityManager();
        List participantes=null;
        
        try{
            
            String textoquery = "SELECT p FROM participantes p "+" WHERE (:nome IS NULL OR p.nome LIKE :nome)";
        Query Resultado = em.createQuery(textoquery);
        Resultado.setParameter("nome", nomeLutador.isEmpty() ? null : "%"+nomeLutador+"%");
        participantes = Resultado.getResultList();
        }finally{
            EntityManagement.closeEntityManager();
        }
        return participantes;
    }
    
    public void atualizar(lutadores p){
    EntityManager em = EntityManagement.getEntityManager();
    
    try{
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }catch(Exception e){
        em.getTransaction().rollback();
        throw e;
    }finally{
        EntityManagement.closeEntityManager();
    }
}
   
    public lutadores obter(Object i){
         EntityManager em = EntityManagement.getEntityManager();
         
         lutadores p = em.find(lutadores.class,i);
         return p;
    }
    
    public void Excluir(Object i){
        EntityManager em = EntityManagement.getEntityManager();
        String b =(String)i;
        int j = Integer.parseInt( b);
       lutadores p = em.find(lutadores.class,j);
       if(p != null){
           em.getTransaction().begin();
           em.remove(p);
           em.getTransaction().commit();
       }else{
           JOptionPane.showMessageDialog(null, "Selecione uma Linha");
       }
    }
}
