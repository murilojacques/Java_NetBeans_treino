/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plataformer_ant;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Murilo
 */
public class Tela_Jogo extends JFrame{
    
    public Tela_Jogo(Painel_Jogo painel_Jogo){
        
        this.add(painel_Jogo);
        
        this.setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }
}
