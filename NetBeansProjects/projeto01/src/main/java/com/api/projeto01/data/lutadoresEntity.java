/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.projeto01.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.io.Serializable;
import lombok.Data;
import jakarta.persistence.Id;

/**
 *
 * @author Murilo
 */
@Data
@Entity
@Table(name="Lutadores", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id")})
public class lutadoresEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String nome;
    
    private String idade;
    
    private String altura;
    
    private String peso;
    
    private String nacionalidade;
    
    private String categoria;
    
    private int vitorias;
    
    private int derrotas;
    
    private int empates;
}
