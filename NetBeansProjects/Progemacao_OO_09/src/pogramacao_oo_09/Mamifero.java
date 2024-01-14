/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pogramacao_oo_09;

/**
 *
 * @author Murilo
 */
public class Mamifero extends Animal{
    protected String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    
    @Override
    public void emitiSom(){
        System.out.println("som de mamifero");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mim Come q nem liao");
    }
}
