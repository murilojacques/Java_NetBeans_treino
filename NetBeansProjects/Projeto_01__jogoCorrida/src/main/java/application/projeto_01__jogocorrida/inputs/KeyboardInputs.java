/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.projeto_01__jogocorrida.inputs;

import application.projeto_01__jogocorrida.myPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Murilo
 */
public class KeyboardInputs implements KeyListener{
    
    myPanel panel;
    char direction;
            
    public KeyboardInputs(myPanel panel) {
        this.panel = panel;
        this.direction = panel.getDirection();
        System.out.println(direction);
    }
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("Suave");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        System.out.println(direction);
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                if(direction == 'R'){
                direction = 'N';
                //panel.setDirection('N');
                panel.CarroMovimento("imagens/carro1.png", 'N');
                break;
            }else{
                direction = 'L';
                //panel.setDirection('L');
                panel.CarroMovimento("imagens/carro2.png", 'L');
                break;  
                }
                
            
            case KeyEvent.VK_D:
                if(direction == 'L'){
                direction = 'N';
                //panel.setDirection('N');
                panel.CarroMovimento("imagens/carro1.png", 'N');
                break;
            }else{
                direction = 'R';
                //panel.setDirection('R');
                panel.CarroMovimento("imagens/carro3.jpg", 'R');
                break;  
                }
                
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("Salve");
    }
    
}
