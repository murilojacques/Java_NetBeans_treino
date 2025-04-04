/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ProdutosDAO {
    //listagemVIEW lv = new listagemVIEW();
    Connection conn;
    PreparedStatement prep;
    Statement st;
    ResultSet rs;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto){
        try{
        conn = new conectaDAO().connectDB();
        prep = conn.prepareStatement("Insert Into produtos (nome, valor, status) values (?, ?, ?)");
        prep.setString(1, produto.getNome());
        prep.setInt(2, produto.getValor());
        prep.setString(3, produto.getStatus());
        prep.execute();
        JOptionPane.showMessageDialog(null,"Valores Gravados com Sucesso!");
        
        }catch(Exception e){}
    }
    
    public ArrayList<ProdutosDTO> listarProdutos() throws SQLException{
        try{
        conn = new conectaDAO().connectDB();
        String q = "SELECT id, nome, valor, status FROM produtos";
        prep = conn.prepareStatement(q);
        rs = prep.executeQuery();
        while (rs.next()){
            ProdutosDTO p = new ProdutosDTO();
             p.setId( rs.getInt("id"));
             p.setNome(rs.getString("nome"));
             p.setValor(rs.getInt("valor"));
             p.setStatus(rs.getString("status"));
             System.out.println(p);
             listagem.add(p);
  
        }
        }catch(SQLException e){
            throw e;
        }
        
        /**String colunas[] = {"id", "Nome", "Valor", "Status"};
        String dados[][] = new String[listagem.size()][colunas.length];
         int i=0;
        
        for(ProdutosDTO l: listagem){
            dados[i] = new String[]{
                String.valueOf(l.getId()),
                String.valueOf(l.getNome()),
                String.valueOf(l.getValor()),
                String.valueOf(l.getStatus())
            };
                    i++;
        }
        DefaultTableModel tabelaModelo = new DefaultTableModel(dados, colunas);
        lv.listaProdutos.setModel(tabelaModelo);
    **/
        return listagem;
    }
    
    
    
        
}

