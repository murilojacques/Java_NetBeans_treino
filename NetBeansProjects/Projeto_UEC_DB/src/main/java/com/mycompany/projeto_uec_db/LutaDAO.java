/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_uec_db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.sql.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class LutaDAO {

    public void cadastrar(luta l) {
        EntityManager em = EntityManagement.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(l);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            EntityManagement.closeEntityManager();
        }
    }

    public boolean verificacao(Object i, Object j, Date d, String r) {
        EntityManager em = EntityManagement.getEntityManager();
        lutadores p = em.find(lutadores.class, i);
        lutadores l = em.find(lutadores.class, j);

        boolean verificar = (!p.getCategoria().equals(l.getCategoria())) && (p != null && l != null && d != null && r != null) ? true : false;

        if (verificar == false) {
            JOptionPane.showMessageDialog(null, "--------------------------------ATENCAO!-------------------------------- \n Nao foi Possivel registrar esta luta, verifique se \n nenhuma das acoes abaixo foi executada por acidente \n\n 1- Inserir o mesmo Lutador consecutivamente \n 2- Inserir Lutadores de categorias Diferentes \n 3- Ter deixado campos em Branco");
        }

        return verificar;
    }

    public List<luta> Listar() {
        EntityManager em = EntityManagement.getEntityManager();

        Query listagem = em.createQuery("SELECT l FROM luta l");
        List<luta> lista = listagem.getResultList();
        return lista;
    }

    public luta obter(int i) {
        EntityManager em = EntityManagement.getEntityManager();

        luta l = em.find(luta.class, i);
        return l;
    }

    public void Lutar(luta l, lutadores l1, lutadores l2) {
        LutadoresDAO ldao = new LutadoresDAO();
        if (l.getAprovada() == true) {
            System.out.println("#### Desafiante #### \n ------------------------------------------");
            l1.apresentar();
            System.out.println("\n");
            System.out.println("#### Desafiado #### \n ------------------------------------------");
            l2.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    l1.empateLuta();
                    l2.empateLuta();
                    ldao.atualizar(l2);
                    ldao.atualizar(l1);
                    break;
                case 1:
                    System.out.println("Desafiante " + l1.getNome() + " Venceu");
                    l1.ganharLuta();
                    l2.perderLuta();
                    ldao.atualizar(l2);
                    ldao.atualizar(l1);
                    break;
                case 2:
                    System.out.println("Desafiado " + l2.getNome() + " Venceu");
                    l2.ganharLuta();
                    l1.perderLuta();
                    ldao.atualizar(l2);
                    ldao.atualizar(l1);
            }
        } else {
            System.out.println("A Luta Não pode Acontecer");
        }
    }
}
