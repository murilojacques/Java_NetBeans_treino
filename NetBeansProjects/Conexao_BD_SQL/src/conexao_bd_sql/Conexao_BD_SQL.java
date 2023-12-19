/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexao_bd_sql;

import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao_BD_SQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try {
        Conexao conector = new Conexao();
       
       conector.conectar();
       
            Statement st = conector.conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM usuario"); //variavel da classe ResultSet para receber o valor da consulta
            rs.next();
            System.out.println(rs.getInt("COUNT(*)"));
            } catch (SQLException ex) {
            Logger.getLogger(Conexao_BD_SQL.class.getName()).log(Level.SEVERE, null, ex);
    } 
   }
    
}
