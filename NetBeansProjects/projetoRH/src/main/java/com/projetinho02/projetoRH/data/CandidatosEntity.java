/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinho02.projetoRH.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Data
@Entity
@Table(name = "candidato", uniqueConstraints = {@UniqueConstraint(columnNames = "id")})
public class CandidatosEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    
    @NotBlank
    @Size(min = 2, max = 100)
    private String nomeCandidato;
    
    @Column(unique = true, nullable = false)
    private int rg;
    
    @NotBlank
    @Column(unique = true, nullable = false)
    @Size(max = 80)
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "vaga_id", nullable = false, updatable = false)
    private VagasEntity vaga;
}
