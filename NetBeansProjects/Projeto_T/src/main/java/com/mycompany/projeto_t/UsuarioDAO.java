/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_t;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import java.util.ArrayList;

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

    public void Cadastrar(Usuario u) {
        EntityManager em = EntityManagement.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            EntityManagement.closeEntityManager();
        }
    }

    public Usuario verificar(String login, String senha) {
        EntityManager em = EntityManagement.getEntityManager();

        Usuario u = null;
        try {
            String query = "SELECT u FROM Usuario u" + " WHERE u.login = :login" + " AND u.senha = :senha";
            Query busca = em.createQuery(query);
            busca.setParameter("login", login);
            busca.setParameter("senha", senha);

            u = (Usuario) busca.getSingleResult();
            setId(u.getId());
        } catch (Exception e) {
        } finally {
            EntityManagement.closeEntityManager();
        }
        return u;
    }

    public List<Usuario> getListagem() {
        EntityManager em = EntityManagement.getEntityManager();

        Query listagem = em.createQuery("SELECT u FROM Usuario u");
        List<Usuario> usuarios = listagem.getResultList();

        return usuarios;
    }

    
    public List<Usuario> getListagemFiltro(int i) {
        EntityManager em = EntityManagement.getEntityManager();

        Query listagem = em.createQuery("SELECT u FROM Usuario u" + " WHERE u.id = :id");
        listagem.setParameter("id", i);
        List<Usuario> usuarios = listagem.getResultList();

        return usuarios;
    }
}
