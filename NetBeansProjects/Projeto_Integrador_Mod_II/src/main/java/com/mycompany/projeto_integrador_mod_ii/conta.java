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
    
    private String login;
    
    private int senha;
    
    private int cpf = 0;
    
    private int cnpj = 0;

    private String tipo = "";

    private float saldo = 0.0f;

    private boolean status;
    
    private String pfpj="";
    

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
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

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
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

    public String getPfpj() {
        return pfpj;
    }

    public void setPfpj(String pfpj) {
        this.pfpj = pfpj;
    }

    public void criarCon(String t, String n, String login, int senha, String e, int cpf, int cnpj,  String pfpj) {
        
            this.setNome_usuario(n);
        switch (t) {
            case "cc" -> {
                this.setTipo(t);
                this.setStatus(true);
                this.setSaldo(50.0f);
                this.setLogin(login);
                this.setSenha(senha);
                this.setEndereco(e);
                this.setCpf(cpf);
                this.setCnpj(cnpj);
                this.setPfpj(pfpj);
            }
            case "cp" -> {
                this.setTipo(t);
                this.setStatus(true);
                this.setSaldo(150.0f);
                this.setLogin(login);
                this.setSenha(senha);
                this.setEndereco(e);
                this.setCpf(cpf);
                this.setCnpj(cnpj);
                this.setPfpj(pfpj);
            }
            default -> JOptionPane.showMessageDialog(null, "<html>O campo tipo de Conta so aceita os tipos cc [Conta Corrente]\n e cp [Conta Poupanca], por favor verifique se o campo estao corretamente preenchidos</html>");
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
