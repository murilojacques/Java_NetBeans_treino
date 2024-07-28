/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plataformer_ant;

import plataformer_ant.inputs.MouseInputs;
import plataformer_ant.inputs.KeyboardInputs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Murilo
 */
public class Painel_Jogo extends JPanel{
    
    private KeyboardInputs keyboardInputs;
    private MouseInputs mouseInputs;
    private float xDelta = 100;
    private float yDelta = 100;
    private BufferedImage img;
    
    public Painel_Jogo(){
        
        importImg();
        
        mouseInputs = new MouseInputs(this);
        keyboardInputs = new KeyboardInputs(this);
        setPanelSize();
        addKeyListener(keyboardInputs);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    
    public void MoverXDelta(int valor){
        this.xDelta += valor;
    }
    
    public void MoverYDelta(int valor){
        this.yDelta += valor;
    }
    
    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //g.drawImage(null, x, y, null);
    }


    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setMinimumSize(size);
        setMaximumSize(size);
        setPreferredSize(size);
    }

    private void importImg() {
        InputStream is = getClass().getResourceAsStream("res/player_sprites.png");
        
        try{
            img = ImageIO.read(is);
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
