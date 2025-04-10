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
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="Conta", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id")})
public class ContaEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome_usuario;
    
    private String endereco;
    
    private String login;
    
    private int senha;
    
    private long cpf;
    
    private long cnpj;

    private String tipo;

    private int saldo;

    private boolean status;
    
    private String pfpj;

    
    
	public int getSenha() {
		// TODO Auto-generated method stub
		return senha;
	}

	public void setId(Object object) {
		// TODO Auto-generated method stub
		
	}

	public Object getLogin() {
		// TODO Auto-generated method stub
		return login;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return id;
	}



}
