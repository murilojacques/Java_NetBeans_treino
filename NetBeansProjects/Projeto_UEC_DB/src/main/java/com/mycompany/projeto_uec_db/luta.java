/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_uec_db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;

/**
 *
 * @author Murilo
 */
@Entity
public class luta {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    int desafiado_id;
    int desafiante_id;
    int rounds=0;
    String aprovada="";
    Date data;

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDesafiado_id() {
        return desafiado_id;
    }

    public void setDesafiado_id(int desafiado_id) {
        this.desafiado_id = desafiado_id;
    }

    public int getDesafiante_id() {
        return desafiante_id;
    }

    public void setDesafiante_id(int desafiante_id) {
        this.desafiante_id = desafiante_id;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public String getAprovada() {
        return aprovada;
    }

    public void setAprovada(String aprovada) {
        this.aprovada = aprovada;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
}
