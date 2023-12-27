/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_01;

/**
 *
 * @author Murilo
 */
public class Caneta {

    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;

    void status() {
        String t = (this.tampada == true) ? "Sim, esta tampada" : "Nao, esta destampada";
        System.out.println("\nModelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("A canta esta tampada? " + t);
    }

    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("\nERRO! Nao posso rabiscar\n");
        } else {
            System.out.println("\nEstour rabiscando\n");
        }
    }

    public void tampar() {
        System.out.println("\nA Canta foi tampada!");
        this.tampada = true;
    }

    public void destampar() {
        System.out.println("\nA canta foi destampada!");
        this.tampada = false;
    }
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    

}
