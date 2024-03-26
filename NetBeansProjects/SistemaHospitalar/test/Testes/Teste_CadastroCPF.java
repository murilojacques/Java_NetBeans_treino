/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Testes;

import dao.PacienteDAO;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Murilo
 */
public class Teste_CadastroCPF {
    
    private PacienteDAO pac;
    private Paciente p;
    
    public Teste_CadastroCPF() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pac = new PacienteDAO();
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            d = sdf.parse("02/02/2024");
            
            // Paciente recebeu Um CPF com 4 caracteres inves de 11 para testar se agora o Sitema não aceitara menos de 11 caracteres numericos para o CPF
            // A verificação foi adicionada dentro da Classe PacienteDAO entao esse teste ira Simular o cadastro de um Paciente com o CPF inserido Incorretamente
            p = new Paciente( 17, "Murilo", "ASDFGHJKL", d, "(11)1524-7896", "123.4", "0123654789", "EMAIL.COM", 5);
            
        }catch(Exception e){}
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
   public void verificarCaracteres(){
        try {
            
            pac.cadastrarPaciente(p);
            
        } catch (SQLException ex) {
            Logger.getLogger(Teste_CadastroCPF.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
