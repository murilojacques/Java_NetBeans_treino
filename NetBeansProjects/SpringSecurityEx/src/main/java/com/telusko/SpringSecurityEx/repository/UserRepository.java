/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.telusko.SpringSecurityEx.repository;

import com.telusko.SpringSecurityEx.data.UserEntity;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Murilo
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{

    public UserEntity findByUsername(String username);
    
}
