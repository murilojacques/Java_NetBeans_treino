/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.projetoRHVerVideo.appRH.repository;

import java.util.List;

import com.projetoRHVerVideo.appRH.model.Candidato;
import com.projetoRHVerVideo.appRH.model.Candidato;
import com.projetoRHVerVideo.appRH.model.Vaga;
import com.projetoRHVerVideo.appRH.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
	
	Iterable<Candidato>findByVaga(Vaga vaga);
	
	Candidato findByRg(String rg);
	
	Candidato findById(long id);
	
	List<Candidato>findByNomeCandidato(String nomeCandidato);
}
