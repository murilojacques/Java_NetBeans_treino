/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.projeto_01__jogocorrida;

/**
 *
 * @author Murilo
 */
public class Jogo {
    private Frame frame;
    private myPanel panel;
    
    public Jogo(){
        panel = new myPanel();
        frame = new Frame(panel);
        panel.requestFocus();
    }
}
