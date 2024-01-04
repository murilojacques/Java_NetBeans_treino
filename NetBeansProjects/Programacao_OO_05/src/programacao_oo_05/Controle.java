/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_05;

import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Murilo
 */
public class Controle implements Controlador {

    boolean ligado;
    int volume = 50;
    boolean tocando;
    static Controle c = new Controle();
    static Tela_Inicial ti = new Tela_Inicial();
    static Tela_Dois td = new Tela_Dois();
    
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        c.setLigado(true);
        ti.setVisible(true);
    }

    @Override
    public void desligar() {
        c.setLigado(false);
        ti.dispose();
    }

    @Override
    public void abrirMenu() {
        if (c.isLigado() == true) {
            
            td.setVisible(true);
            JOptionPane.showMessageDialog(null, "Menu Aberto com sucesso!");
        } else {
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        }
    }

    @Override
    public void fecharMenu() {
        
        
        td.dispose();
        JOptionPane.showMessageDialog(null, "Menu fechado com sucesso!");

    }

    @Override
    public int maisVolume() {
        if (this.getVolume() != 100) {
            this.setVolume(this.getVolume() + 1);
        } else {
            JOptionPane.showMessageDialog(null, "O Volume ja esta no maximo");
        }
        return this.getVolume();
    }

    @Override
    public int menosVolume() {
        if (this.getVolume() != 0) {
            this.setVolume(this.getVolume() - 1);
        } else {
            JOptionPane.showMessageDialog(null, "O Volume ja esta no minimo");
        }
        return this.getVolume();
    }

    @Override
    public String ligarMudo() {
        String m = "MUDO";
        return m;
    }

    @Override
    public int desligarMudo() {
        return this.getVolume();
    }

    @Override
    public void play() {
        if (this.isTocando() != true && this.isLigado()== true) {
            this.setTocando(true);
            JOptionPane.showMessageDialog(null, "Play iniciado");
        } else {
            JOptionPane.showMessageDialog(null, "Ja esta tocando");
        }

    }

    @Override
    public void pause() {
        if (this.isTocando() != false && this.isLigado()== true) {
            this.setTocando(false);
            JOptionPane.showMessageDialog(null, "Pausado");
        } else {
            JOptionPane.showMessageDialog(null, "Ja esta Pausado");
        }
    }

}
