/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.plataformer;

/**
 *
 * @author Murilo
 */
public class Game implements Runnable{
    
    private Tela_Jogo tela_Jogo;
    private Painel_Jogo painel_Jogo;
    private Thread gameThread;
    private final int FPS_SET = 120;
    
    public Game(){
        painel_Jogo = new Painel_Jogo();
        tela_Jogo = new Tela_Jogo(painel_Jogo);
        painel_Jogo.requestFocus();
        StartGameLoop();
    }

    private void StartGameLoop(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    
    
    @Override
    public void run() {
        
        long lastFrame = System.nanoTime();
        long now = System.nanoTime();
        double timePerFrame = 1000000000.0/FPS_SET;
        
        int frame = 0;
        long lastCheck = System.currentTimeMillis();
        
        while(true){
            
            now = System.nanoTime();
            if(now - lastFrame >= timePerFrame){
                painel_Jogo.repaint();
                lastFrame = now;
                frame++;
            }
            
            if(System.currentTimeMillis() - lastCheck >= 1000){
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS: " + frame);
            frame = 0;
            }
        }
        
    }
}
