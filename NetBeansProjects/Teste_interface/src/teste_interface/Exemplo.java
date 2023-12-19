/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste_interface;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
/**
 *
 * @author Murilo
 */
public class Exemplo implements ActionListener{ 
    
    JFrame frame = new JFrame("Teste de eventos");
    JLabel texto = new JLabel();
    JButton botao = new JButton("Clique");
    
    Exemplo(){
        
        frame.add(texto);
        frame.add(botao);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        texto.setBounds(10,80, 300,50);
        botao.setBounds(100,10, 100,30);
        
        botao.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botao){
            System.out.println(e.getSource());
            texto.setText("O botão foi pressionado!");
            System.out.println(e.getSource());
        }
    }
    
    
   
}
