/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste_db;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Murilo
 */
public class Teste_DB {

    
    public static void main(String[] args) {
       conexao conectar = new conexao();
       
       conectar.conectar();
       
       
       Statement st = null;
       
        try {
            
           st = conexao.conn.createStatement();
           System.out.println( "Pronto para execucao de comandos sql." );
           
           String sql = null;
        } catch (SQLException sqle) {
           System.out.println( "Erro no acesso ao Bando de Dados : " +
                                        sqle.getMessage() );
        }
       
        String nome="'" +"marcos"+"'";
        String idade="'"+"20"+"'";
        String endereco="'"+"AAAAAAA"+"'";
        
        try{
            String sql = null;

    sql = "insert into alunos (nome, idade, endereco) values ("+nome+", "+idade+", "+endereco+")";
    st.executeUpdate(sql);
    System.out.println("Dados inseridos.");
        
        }catch (SQLException sqle ){
    System.out.println( "Erro inserindo : " + sqle.getMessage() );
}
      
    
}}
