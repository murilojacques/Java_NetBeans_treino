/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_01;

import jakarta.persistence.EntityManager;

/**
 *
 * @author Murilo
 */
public class TransporteDAO {
     public transporte escolhaTransporte(int i){
        EntityManager em = EntityManagement.getEntityManager();
       try{
       transporte t = em.find(transporte.class, i);
       return t;
       }catch(Exception e){
           throw e;
       }finally{
         EntityManagement.closeEntityManager();  
       }  
    }
}
