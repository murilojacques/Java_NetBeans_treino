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
import java.sql.Date;
import lombok.Data;
import jakarta.persistence.Id;

/**
 *
 * @author Murilo
 */
@Data
@Entity
@Table(name="Luta", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id")})
public class lutaEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private int desafiado_id;
    
    private int desafiante_id;
    
    private int rounds;
    
    private boolean aprovada;
    
    private Date data;
}
