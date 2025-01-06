/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.projeto.TesteTokenVerification.Data;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Murilo
 */
public interface UserRepository extends JpaRepository<PessoaEntity, Integer>{
    Optional<RolesEntity> findByUsername(String username);
    Boolean existsByUsername(String username);
}
