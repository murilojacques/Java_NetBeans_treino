/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package janela;
import java.awt.event.ActionEvent;
  import java.awt.event.ActionListener;
  import javax.swing.JOptionPane;
  import javax.swing.JTextField;
/**
 *
 * @author Murilo
 */
public class AcaoBotao implements ActionListener{
    private JTextField campoNome;
    
    public AcaoBotao(JTextField campoNome){
        this.campoNome = campoNome;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       JOptionPane.showMessageDialog(null, "Boas Vindas " + campoNome.getText() + "!");
    }
    
    
}
