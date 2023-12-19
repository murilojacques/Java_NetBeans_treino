/*
 * The MIT License
 *
 * Copyright 2023 Murilo.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.mycompany.uc10_atividade3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Murilo
 */
public class PodcastDAO {
     public void cadastrar(Podcast podcast){
          EntityManager em = DB_Access_EntityManager.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(podcast);
              em.getTransaction().commit();
          }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              DB_Access_EntityManager.closeEtityManager();
          }
     }
         
     
     
     public List<Podcast> listar(String filtroProdutor){
          EntityManager em = DB_Access_EntityManager.getEntityManager();
      List Podcast = null;
      
      try{
          String textoQuery = "SELECT p FROM Podcast p "+"WHERE (:produtor IS NULL OR p.produtor LIKE :produtor)";
          
          Query listagem = em.createQuery(textoQuery);
          
          listagem.setParameter("produtor", filtroProdutor.isEmpty() ? null : "%" + filtroProdutor + "%");
          
          Podcast=listagem.getResultList();
      }finally{
          DB_Access_EntityManager.closeEtityManager();
       }
      return Podcast;
     }
     
     
          public List<Podcast> Listar(){
       EntityManager em = DB_Access_EntityManager.getEntityManager();
       try{
           Query listagem = em.createQuery("SELECT c FROM Podcast c");
           List<Podcast> podcast = listagem.getResultList();
           return podcast;
       }catch(Exception e){
           em.getTransaction().rollback();
          throw e;
       }}}
       
   
      

