/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Testes;

import dao.PacienteDAO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Teste_Cadastro_ComCamposNulos {
    
    private PacienteDAO pac;
    private Paciente p;
    
    public Teste_Cadastro_ComCamposNulos() {
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
            
           //Teste de Verificação de campos nulos: Feito para conferir se o codigo esta aceitando valores nulos em campos Obrigatorios
           // nesta versão foi testado com O Campo Nome
            p = new Paciente( 17, "", "ASDFGHJKL", d, "(11)1524-7896", "12345678910", "0123654789", "EMAIL.COM", 5);
            
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
