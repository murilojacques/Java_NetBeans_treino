/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.projetoIntegrador.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Murilo
 */
//@Data
@Entity
@Table(name="Transacao", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id")})
public class TransacaoEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private int contaOrigemId;
    
    private int conta_destino_id;
    
    private String alteracao_conta;
    
    private int valor;

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getContaOrigemId() {
        return contaOrigemId;
    }

    public void setContaOrigemId(int contaOrigemId) {
        this.contaOrigemId = contaOrigemId;
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
