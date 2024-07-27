/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.projeto_01__jogocorrida;

import application.projeto_01__jogocorrida.inputs.KeyboardInputs;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Murilo
 */
public class myPanel extends JPanel{
    
    final int PANEL_WIDTH = 1000;
    final int PANEL_HEIGHT = 750;
    int x = 100;
    int y = 50;
    Image carro;
    Image fundo;
    String caminhoImgCarro= "imagens/carro1.png";
    String caminhoImgFundo = "imagens/fundo_Azul.jpg";
    Timer timer;
    
    
    char direction = 'N';

    public char getDirection() {
        return direction;
    }

    
    public void setDirection(char direction) {
        this.direction = direction;
        System.out.println(direction);
    }
    boolean running;
    
    myPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        fundo = new ImageIcon(caminhoImgFundo).getImage();
        carro = new ImageIcon(caminhoImgCarro).getImage();
        
        addKeyListener(new KeyboardInputs(this));
        //StartGame();
    }
    
    /*
    public void StartGame(){
        running = true;
        timer = new Timer(75, this);
        timer.start();
    }*/

    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        
        g2d.drawImage(fundo, 0, 0, this);
        g2d.drawImage(carro, 0, 0, this);
        g.fillRect(x, y, 100, 50);
    }
    
    public void CarroMovimento(String imagem, char direction){
        System.out.println(this.direction);
        caminhoImgCarro = imagem;
        carro = new ImageIcon(caminhoImgCarro).getImage();
        setDirection(direction);
        x += 10;
        y += 5;
        repaint();
    }
    
    /*
    public void move(){
        switch (direction) {
            case 'R':
                carro = new ImageIcon("imagens/carro2.png").getImage();
                System.out.println("AAA");
                break;
            case 'L':
                carro = new ImageIcon("imagens/carro1.png").getImage();
                System.out.println("BBB");
                break;
        }
        System.out.println(running);
        System.out.println(direction);
    }
    */
    
    /*
    public class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                        System.out.println("aaaa");
                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
            }
        }
    }*/
    
}
