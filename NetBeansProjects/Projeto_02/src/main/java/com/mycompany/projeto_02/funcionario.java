/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_02;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Murilo
 */
@Entity
public class funcionario {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   
   private int id;
   private String tipoPagamento;
   private int horista_id;
   private int assalariado_id;
   private String setor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public int getHorista_id() {
        return horista_id;
    }

    public void setHorista_id(int horista_id) {
        this.horista_id = horista_id;
    }

    public int getAssalariado_id() {
        return assalariado_id;
    }

    public void setAssalariado_id(int assalariado_id) {
        this.assalariado_id = assalariado_id;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
   
   
}
