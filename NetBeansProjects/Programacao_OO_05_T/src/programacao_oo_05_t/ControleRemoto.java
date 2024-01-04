/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_05_t;

/**
 *
 * @author Murilo
 */
public class ControleRemoto implements Controlador {

    private int volume;
    boolean tocando;
    boolean ligado;

    public ControleRemoto() {
        this.volume = 50;
        this.tocando = false;
        this.ligado = true;
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

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------Menu------");
        System.out.println("Esta ligado? " + this.isLigado());
        System.out.println("Esta Tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o Menu");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado() == true) {
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado() == true) {
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() == true && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() == true && this.getVolume() > 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() == true && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() == true && (this.isTocando())) {
            this.setTocando(false);
        }
    }

}
