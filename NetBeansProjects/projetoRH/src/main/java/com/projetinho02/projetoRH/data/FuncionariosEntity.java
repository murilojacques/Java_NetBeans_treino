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
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Murilo
 */
@Data
@Entity
@Table(name = "funcionarios", uniqueConstraints = {@UniqueConstraint(columnNames = "id")})
public class FuncionariosEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    @Column(nullable = false)
    @Size(min=2, max=50)
    private String nome;
    
    @NotBlank
    @Column(nullable = false, unique = true)
    @Size(min=11, max=50)
    private String cpf;
    
    @NotBlank
    @Column(nullable = false)
    @Size(min=2, max=60)
    private String email;
    
    @Column(nullable = false)
    private int idade;
    
    @OneToMany(mappedBy = "funcionarioId", cascade = CascadeType.REMOVE)
    private List<DependentesEntity> dependentes = new ArrayList<DependentesEntity>();
    
}
