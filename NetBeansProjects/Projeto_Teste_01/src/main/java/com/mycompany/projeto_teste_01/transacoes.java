/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_teste_01;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

/**
 *
 * @author Murilo
 */
@Entity

public class transacoes {
    @JdbcTypeCode(SqlTypes.JSON)
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int conta_origem_id;
    private int conta_destino_id;
    private String alteracao_conta;
    private float valor;

    public void fazerTransacao(int conta_origem_id, int conta_destino_id, String alteracao_conta, int valor) {
        this.conta_origem_id = conta_origem_id;
        this.conta_destino_id = conta_destino_id;
        this.alteracao_conta = alteracao_conta;
        this.valor = valor;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConta_origem_id() {
        return conta_origem_id;
    }

    public void setConta_origem_id(int conta_origem_id) {
        this.conta_origem_id = conta_origem_id;
    }

    public int getConta_destino_id() {
        return conta_destino_id;
    }

    public void setConta_destino_id(int conta_destino_id) {
        this.conta_destino_id = conta_destino_id;
    }

    public String getAlteracao_conta() {
        return alteracao_conta;
    }

    public void setAlteracao_conta(String alteracao_conta) {
        this.alteracao_conta = alteracao_conta;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
