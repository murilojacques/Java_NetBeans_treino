/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tela_login;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

/**
 *
 * @author Murilo
 */
public class UsuarioDAO {
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public void Cadastrar(Usuario u){
        EntityManager em = EntityManagement.getEntityManager();
        
        try{
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
            
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            EntityManagement.closeEntityManager();
        }
    }
    
    public Usuario verificar(String login, String senha){
        EntityManager em = EntityManagement.getEntityManager();
        
        Usuario u = null;
        try{
            String query = "SELECT u FROM Usuario u" + " WHERE u.login = :login" + " AND u.senha = :senha";
            Query busca = em.createQuery(query);
            busca.setParameter("login", login);
            busca.setParameter("senha", senha);
            
            u = (Usuario) busca.getSingleResult();
            setId(u.getId());
        }catch(Exception e){
        }finally{
            EntityManagement.closeEntityManager();
        }
        return u;
    }
    
}
