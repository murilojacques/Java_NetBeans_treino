/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.projetinho02.projetoRH.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Murilo
 */
public interface CandidatosRepository extends JpaRepository<CandidatosEntity, Long>{
    
    List<CandidatosEntity> findByVaga(VagasEntity vaga);
    
    CandidatosEntity findByRg(int rg);
    
    List<CandidatosEntity> findByNomeCandidato(String nomeCandindato);
}
