/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.plataformer.inputs;

import application.plataformer.Painel_Jogo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Murilo
 */
public class KeyboardInputs implements KeyListener{
    
    private Painel_Jogo painel_Jogo;
    public KeyboardInputs(Painel_Jogo painel_Jogo){
        this.painel_Jogo = painel_Jogo;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("Botao Pressionado" + e.getKeyCode());
    }

    
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                painel_Jogo.MoverYDelta(-10);
                break;
            case KeyEvent.VK_A:
                painel_Jogo.MoverXDelta(-10);
                break;
            case KeyEvent.VK_S:
                painel_Jogo.MoverYDelta(10);
                break;
            case KeyEvent.VK_D:
                painel_Jogo.MoverXDelta(10);
                break;
        }
    }

    
    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("Botao Pressionado" + e.getKeyCode());
    }
    
}
