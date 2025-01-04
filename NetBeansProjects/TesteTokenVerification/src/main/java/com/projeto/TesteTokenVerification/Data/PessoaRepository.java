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
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long>{
    
    PessoaEntity findByRg(int rg);
    
    List<PessoaEntity> findByNome(String name);

   PessoaEntity findByNomeAndSenha(String name, String senha);
}
