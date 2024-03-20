/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_033;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.Border;

/**
 *
 * @author Murilo
 */
public class C_033 {

    public static void main(String[] args) {
        ImageIcon imagem = new ImageIcon("OIP.jpg");
        Border border = BorderFactory.createLineBorder(Color.blue);
        
        // Labels normalmente Tentam Ocupar todo o espaço do JFrame caso um tamanho não tenha sido definido para ele ->(JLabel)
        
        JFrame frame = new JFrame();
        frame.setSize(485, 670);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        
        
        JLabel label = new JLabel();
        label.setText("Salve Mano");
        label.setIcon(imagem);
        label.setHorizontalTextPosition(JLabel.CENTER);// Posicao do Texto
        label.setVerticalTextPosition(JLabel.BOTTOM); // Posicao do Texto
        label.setForeground(new Color(0, 255, 220));
        label.setFont(new Font("MV Boli", Font.BOLD, 65));
        label.setIconTextGap(-115);
        label.setBackground(Color.black); // Define A Cor de fundo Do Label  
        label.setOpaque(true); // Necessario para a cor de Fundo ter efeito
        label.setBorder(border);
        label.setHorizontalAlignment(CENTER);// Posicao do Texto + Imagem dentro do  JFrame
        //frame.setLayout(null);
        //label.setBounds(0, 0, 250, 470); // Define a posicao do Label com os parametros: x, y, Dimensao Horizontal, Dimensao Vertical
        
        frame.add(label);
        
        frame.pack();// Ajusta o tamanho Do Frame para caber todos os componentes dentro dele
    }
}
