/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_integrador_ll_etapa4;


/**
 *
 * @author Murilo
 */

public class transacoes {
    
    private int id;
    
    private conta conta_origem_id;
    
    private conta conta_destino_id;
    
    private String alteracao_conta="";
    
    private float valor=0.0f;

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public conta getConta_origem_id() {
        return conta_origem_id;
    }

    public void setConta_origem_id(conta conta_origem_id) {
        this.conta_origem_id = conta_origem_id;
    }

    public conta getConta_destino_id() {
        return conta_destino_id;
    }

    public void setConta_destino_id(conta conta_destino_id) {
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
