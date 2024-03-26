/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Testes;

import dao.PacienteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
public class Teste_Busca_CPF {
    
    private PacienteDAO pac;
    
    public Teste_Busca_CPF() {
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
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void verificarBusca(){
        String query = "WHERE CPF = '123.456.789-00'";
        try {
          ArrayList<Paciente> pacientes = pac.buscarPacienteFiltro(query);
          if(pacientes.isEmpty()){
              JOptionPane.showMessageDialog(null, "Filtro de Busca Com Erro, nenhum paciente Encontrado");
          }
          else{
              JOptionPane.showMessageDialog(null, "Paciente Encontrado o Filtro de Busca esta Funcionando");
          }
        } catch (SQLException ex) {
            Logger.getLogger(Teste_Busca_CPF.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
