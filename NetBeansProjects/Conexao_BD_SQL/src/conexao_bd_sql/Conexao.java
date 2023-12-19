/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao_bd_sql;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Conexao {
    Connection conn;
    
    public String url = "jdbc:mysql://localhost:3306/exemplo_senac"; //Nome da base de dados
    public String user = "root"; //nome do usuário do MySQL
    public String password = "Mu2006_jf"; //senha do MySQL 
    
     public boolean conectar(){
          try {
              
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao realizada com sucesso");
            return true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexao com o banco " + ex.getMessage());
            return false;
        }    
    }
     
     
     
     public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
        
        }}
     
     
}
