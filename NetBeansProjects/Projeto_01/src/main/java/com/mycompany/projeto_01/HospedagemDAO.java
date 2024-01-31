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
public class HospedagemDAO {
    public hospedagem escolhaHospedagem(int i){
        EntityManager em = EntityManagement.getEntityManager();
         try{
             hospedagem h = em.find(hospedagem.class, i);
             return h;
         }catch(Exception e){
             throw e;
         }finally{
             EntityManagement.closeEntityManager();
         }
    }
    
    
}
