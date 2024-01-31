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
public class FuncionarioDAO {
    public void cadastrar(funcionario f){
        EntityManager em = EntityManagement.getEm();
        
        try{
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            EntityManagement.closeEm();
        }
    }
    
    public List<funcionario> listar() {
        EntityManager em = EntityManagement.getEm();
        List funcionarios = null;
        try {
            String textoQuery = "SELECT f FROM funcionario f";
            Query buscaTransacao = em.createQuery(textoQuery);
            funcionarios = buscaTransacao.getResultList();
        } finally {
            EntityManagement.closeEm();
        }
        return funcionarios;
    }
}
