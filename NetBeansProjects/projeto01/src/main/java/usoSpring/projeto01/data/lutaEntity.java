/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usoSpring.projeto01.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.sql.Date;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Murilo
 */
@Entity
@Data
public class lutaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private int desafiado_id;
    
    private int desafiante_id;
    
    private int rounds;
    
    private boolean aprovada;
    
    private Date data;
}
