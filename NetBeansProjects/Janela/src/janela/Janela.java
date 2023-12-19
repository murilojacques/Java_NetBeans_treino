/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package janela;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Murilo
 */
public class Janela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String texto ="";
      
      // Criando a Janela
      JFrame janela = new JFrame();
      janela.setSize(300, 200);
      janela.setTitle("Minha 1ª Janela!");
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setLayout(new FlowLayout());
      
      //criando Label
      JLabel rotulo = new JLabel();
      rotulo.setText("Dentro da janela");
      janela.add(rotulo);
      
      //Criando campo de Entrada
      JTextField campo = new JTextField(10);
      janela.add(campo);
      
      
      //Criando Button
      JButton botao = new JButton();
      botao.setText("Clique aqui");
      janela.add(botao);
      botao.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(janela, "Boas vindas " + campo.getText() + "!");
          }
      }); 
     
      janela.setVisible(true);
    }
    }

