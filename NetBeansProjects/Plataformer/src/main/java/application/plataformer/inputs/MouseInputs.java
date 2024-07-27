/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.plataformer.inputs;

import application.plataformer.Painel_Jogo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Murilo
 */
public class MouseInputs implements MouseListener, MouseMotionListener{
    
    private Painel_Jogo painel_jogo;
    public MouseInputs(Painel_Jogo painel_jogo){
        this.painel_jogo = painel_jogo;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("CLICOU!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("AA");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println("AA");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //System.out.println("AA");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //System.out.println("AA");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //painel_jogo.setRectPos(e.getX(), e.getY());
    }
    
}
