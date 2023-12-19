/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author Murilo
 */
public class PacoteViagem {

    
   
   private String destino;
   private int qdias;
   private float margemlucro, total, taxadici;
   
   
   
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQdias() {
        return qdias;
    }

    public void setQdias(int qdias) {
        this.qdias = qdias;
    }

    public float getMargemlucro() {
        return margemlucro;
    }

    public void setMargemlucro(float margemlucro) {
        this.margemlucro = margemlucro;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTaxadici() {
        return taxadici;
    }

    public void setTaxadici(float taxadici) {
        this.taxadici = taxadici;
    }
   
    
    public float thospedagem(float num1, int num2){
    return (num1*num2);
    }
    
    public float tpacote(int num1, float num2, float num3, float num4){
    return (num1+num2+num3+num4);
    }
    
    
    
   
}
