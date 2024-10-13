/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.projetinho01.todoSimple.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Murilo
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    
    UserEntity findByUsername(String username);
    
}
