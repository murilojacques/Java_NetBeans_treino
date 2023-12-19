/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Murilo
 */
public class ExemploConexao {

    public static void main(String[] args) throws SQLException {
       Connection conexao = null;
       
       String url="jdbc:mysql://localhost/exemplo_senac";
       String user="root";
       String password="Mu2006_jf";
       
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conexao = DriverManager.getConnection(url, user, password);
    System.out.println("Conexão estabelecida com o MySQL e com o banco de dados!");
    
} catch (ClassNotFoundException ex) {
    System.out.println("Driver do banco de dados não localizado!");
    
} catch (SQLException ex) {
    System.out.println("Ocorreu um erro ao acessar o banco: "+ ex.getMessage());
}
finally {
    if (conexao != null) {
        conexao.close();
    }}
    }
}
