/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho02.projetoRH.data;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Murilo
 */
//@Data
@Entity
@Table(name="Vagas", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id")})
public class VagasEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    
    @NotBlank
    @Size(min = 2, max = 100)
    private String nome;
    
    @NotBlank
    @Column(nullable = false)
    private String descricao;
    
    @NotBlank
    @Column(nullable = false)
    private String data;
    
    @NotBlank
    @Column(nullable = false)
    private String salario;
            
    @OneToMany(mappedBy = "vaga", cascade = CascadeType.REMOVE)
    private List<CandidatosEntity> candidatos = new ArrayList<CandidatosEntity>();

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public List<CandidatosEntity> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<CandidatosEntity> candidatos) {
        this.candidatos = candidatos;
    }
    
    
}
