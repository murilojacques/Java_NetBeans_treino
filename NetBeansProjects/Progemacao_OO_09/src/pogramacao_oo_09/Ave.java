/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pogramacao_oo_09;

/**
 *
 * @author Murilo
 */
public class Ave extends Animal{
    protected String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    
    @Override
    public void emitiSom(){
        System.out.println("Som de ave");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mim come q nem Falcao");
    }
    
    public void fazerNinho(){
        System.out.println("Meu parca passarinho ta a fazer um Ninho!");
    }
}
