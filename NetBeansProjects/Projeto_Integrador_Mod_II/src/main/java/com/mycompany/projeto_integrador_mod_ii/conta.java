/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_integrador_mod_ii;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
@Entity
@Table(name = "conta", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id")})
public class conta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome_usuario = "";
    
    private String endereco ="";
    
    private int cpf = 0;

    private String tipo = "";

    private float saldo = 0.0f;

    private boolean status;

    public conta(String n, String e, int cpf, String t, float s, boolean st) {
        this.setNome_usuario(n);
        this.setEndereco(e);
        this.setCpf(cpf);
        this.setTipo(t);
        this.setSaldo(s);
        this.setStatus(st);
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirCon(String t, String n, boolean a, ContaDAO cdao) {
        if (!n.equals(null) && (!t.equals(null))) {
            this.setNome_usuario(n);
            if (t.equals("cc")) {
                this.setTipo(t);
                this.setStatus(true);
                this.setSaldo(50.0f);
                this.setStatus(a);
                cdao.cadastrar(this);
            }
            if (t.equals("cp")) {
                this.setTipo(t);
                this.setStatus(true);
                this.setSaldo(150.0f);
                this.setStatus(a);
                cdao.cadastrar(this);
            } else {
                JOptionPane.showMessageDialog(null, "<html>O campo tipo de Conta so aceita os tipos cc [Conta Corrente]\n e cp [Conta Poupanca], por favor verifique se o campo estao corretamente preenchidos</html>");
            }
        } else {
            JOptionPane.showMessageDialog(null, "<html>Todos os campos devem estar preenchidos, sendo que os unicos tipos de Conta Aceitos sao cc [Conta Corrente]\n e cp [Conta Poupanca], por favor verifique se os campos estao corretamente preenchidos</html>");
        }
    }

    public void sacar(float s, ContaDAO cdao) {
        if (this.isStatus() == true) {
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
                cdao.atualizar(this);
            } else {
                JOptionPane.showMessageDialog(null, "O valor a ser sacado e maior que o valor total armazenado na conta, nao e possivel fazer a retirada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A Conta em Questao esta Fechada e nao e possivel depositar nem sacar valor dela");
        }
    }
    
    
    public void depoitar(float s, ContaDAO cdao){
         if(this.isStatus() == true){
          this.setSaldo(this.getSaldo() + s);
          cdao.atualizar(this);
       }else{
            JOptionPane.showMessageDialog(null, "A Conta em Questao esta Fechada e nao e possivel depositar nem sacar valor dela");
        }
    }
}
