/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.projetinho01.todoSimple.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Murilo
 */
@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long>{
    
    List<TaskEntity> findByUser_Id(Long id);
    
    
    //Versão JPQL do modo de busca de dados no repositorio, não é tão automatizado quando o acima mas permite ser mais especifico nas Buscas
        //@Query(value = "SELECT t FROM TaskEntity t WHERE t.user.id = :user_id")
        //List<TaskEntity> findByUserId(@Param("user_id") Long user_id);
    
    
    //Versão 100% SQL sei la Ta ai, não acho q vou usar isso, so as duas de cima, principalmente a primeira 
        //@Query(value = "SELECT * FROM task t WHERE t.user_id = :user_id", nativeQuery = true)
        //List<TaskEntity> findByUserId(@Param("user_id") Long user_id);
}
