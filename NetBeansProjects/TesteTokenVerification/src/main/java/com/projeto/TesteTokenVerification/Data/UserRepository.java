/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.projeto.TesteTokenVerification.Data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Murilo
 */
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    
    UserEntity findByRg(int rg);
    
    List<UserEntity> findByNome(String name);

   
}
