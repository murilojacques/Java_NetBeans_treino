/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package programacao_oo_05;

/**
 *
 * @author Murilo
 */
public interface Controlador {
     public abstract void ligar();
     
     public abstract void desligar();
     
     public abstract void abrirMenu();
     
     public abstract void fecharMenu();
     
     public abstract int maisVolume();
     
     public abstract int menosVolume();
     
     public abstract void ligarMudo();
     
     public abstract void desligarMudo();
     
     public abstract void play();
     
     public abstract void pause();
}
