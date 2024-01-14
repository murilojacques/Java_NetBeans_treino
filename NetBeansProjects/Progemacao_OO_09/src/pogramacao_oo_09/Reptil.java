/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pogramacao_oo_09;

/**
 *
 * @author Murilo
 */
public class Reptil extends Animal{
    protected String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover(){
        System.out.println("ratejando");
    }
    
    @Override
    public void emitiSom(){
        System.out.println("Som de reptil");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mim come q nnem crocodilo");
    }
}
