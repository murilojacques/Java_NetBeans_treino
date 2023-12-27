/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_02;

/**
 *
 * @author Murilo
 */
public class Caneta {

    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada; 

    
    
    public Caneta() {
        this.modelo = "Faber Castel";
        this.ponta = 0.7f;
        this.cor = "Azul";
        this.tampar();
    }
    
    public Caneta(String m, float p, String c){
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.destampar();
    }

    
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    
    

    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("\nSOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: "+ this.getCor());
        System.out.println("Tampada: "+ this.isTampada());
    }
}
