/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.plataformer;

import application.plataformer.inputs.KeyboardInputs;
import application.plataformer.inputs.MouseInputs;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
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
    private float xDir = 1f;
    private float yDir = 0.8f;
    private int frame = 0;
    private long lastCheck = 0;
    private Color color = new Color(150, 20, 90);
    private Random random;
    
    public Painel_Jogo(){
        random = new Random();
        mouseInputs = new MouseInputs(this);
        keyboardInputs = new KeyboardInputs(this);
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
        
        updateRectangle();
        g.setColor(color);
        g.fillRect ((int)xDelta, (int)yDelta, 120, 60);
    }

    private void updateRectangle() {
        xDelta += xDir;
        if(xDelta > 400 || xDelta < 0){
            xDir *= -1;
            color = getRndColor();
        }
        
        yDelta += yDir;
        if(yDelta > 400 || yDelta < 0){
            yDir *= -1;
            color = getRndColor();
        }
        
    }

    private Color getRndColor() {
        int r = random.nextInt(0, 255);
        int g = random.nextInt(0, 255);
        int b = random.nextInt(0, 255);
        
        return new Color(r, g, b);
    }
}
