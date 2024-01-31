/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_01;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Murilo
 */
@Entity
public class pacoteViagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeHospede;
    private int transporte_id;
    private int hospedagem_id;
    private String destino;
    private int qDias;
    private float valorTotal;
    private float margemLucro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public int getTransporte_id() {
        return transporte_id;
    }

    public void setTransporte_id(int transporte_id) {
        this.transporte_id = transporte_id;
    }

    public int getHospedagem_id() {
        return hospedagem_id;
    }

    public void setHospedagem_id(int hospedagem_id) {
        this.hospedagem_id = hospedagem_id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getqDias() {
        return qDias;
    }

    public void setqDias(int qDias) {
        this.qDias = qDias;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(float margemLucro) {
        this.margemLucro = margemLucro;
    }
    
    
}
