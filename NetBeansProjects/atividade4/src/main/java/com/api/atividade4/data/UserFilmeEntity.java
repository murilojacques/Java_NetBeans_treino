/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.atividade4.data;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Murilo
 */
@Entity
@Data
//@Table(name = "userFilmes")
@NoArgsConstructor
public class UserFilmeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
   
    private Integer userId;
    
    private Integer filmeId;

    private Integer analiseId;
    
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFilmeId() {
        return filmeId;
    }

    public void setFilme(Integer filme) {
        this.filmeId = filme;
    }

    public Integer getAnaliseId() {
        return analiseId;
    }

    public void setAnaliseId(Integer analiseId) {
        this.analiseId = analiseId;
    }
    
    
}
