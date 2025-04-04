/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.atividade4.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Murilo
 */
@Repository
public interface UserFilmeRepository extends JpaRepository<UserFilmeEntity, Integer>{
    
    /**
     *
     * @param userId
     * @return
     */
    List<UserFilmeEntity> findByUserId(int userId);
    UserFilmeEntity findByFilmeId(int filmeId);
    UserFilmeEntity findByAnaliseId(int analiseId);
    UserFilmeEntity findByUserIdAndFilmeId(int userId, int filmeId);
}
