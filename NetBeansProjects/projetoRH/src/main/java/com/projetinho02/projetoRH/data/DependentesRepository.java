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
public interface DependentesRepository extends JpaRepository<DependentesEntity, Long>{
    
    List<DependentesEntity> findByFuncionarioId(FuncionariosEntity func);
}
