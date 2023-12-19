
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Murilo
 */
public class Conexao {
    static Connection conn;
    
    public String url = "jdbc:mysql://localhost:3306/CenaFlix"; //Nome da base de dados
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
