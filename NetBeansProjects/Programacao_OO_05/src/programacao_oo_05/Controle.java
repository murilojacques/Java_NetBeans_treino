/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_05;

import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class Controle implements Controlador {
    boolean ligado;
    int volume=0;
    boolean tocando;
    Tela_Dois td = new Tela_Dois();
    Tela_Inicial ti = new Tela_Inicial();
    
    @Override
    public void ligar() {
        this.setLigado(true);
        ti.setVisible(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    @Override
    public void abrirMenu() {
           if(this.isLigado(ligado)== true){
               JOptionPane.showMessageDialog(null, "Menu Aberto com sucesso!");
           }
    }

    @Override
    public void fecharMenu() {
           if(this.isLigado(ligado)== true){
               JOptionPane.showMessageDialog(null, "Menu fechado com sucesso!");
           }
    }

    @Override
    public int maisVolume() {
        //if(this.getVolume() != 100){
         this.setVolume(this.getVolume()+1);
        // }else{
           // JOptionPane.showMessageDialog(null,"O Volume ja esta no maximo");
       //}
         return this.getVolume();
    }

    @Override
    public int menosVolume() {
        if(this.getVolume() > 0){
           this.setVolume(this.getVolume()-1);
           
        }else{
            JOptionPane.showMessageDialog(null,"O Volume ja esta no minimo");
        }
        return this.getVolume();
    }

    @Override
    public void ligarMudo() {
         this.setVolume(0);
    }

    @Override
    public void desligarMudo() {
        this.setVolume(volume);
    }

    @Override
    public void play() {
           
    }

    @Override
    public void pause() {
           
    }

    
    
    private boolean isLigado(boolean ligado) {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
   
}
