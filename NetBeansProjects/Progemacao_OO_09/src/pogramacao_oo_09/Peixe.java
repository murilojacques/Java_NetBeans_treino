/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pogramacao_oo_09;

/**
 *
 * @author Murilo
 */
public class Peixe extends Animal{
    protected String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadar");
    }
    
    @Override
    public void emitiSom(){
        System.out.println("Peixe nao faz som");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mim come q nem tubarao");
    }
    
    public void soltarBolhas(){
        System.out.println("GLUB! GLUB!");
    }
}
