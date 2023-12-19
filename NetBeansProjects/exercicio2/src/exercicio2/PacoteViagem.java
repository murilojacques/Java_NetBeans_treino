/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Murilo
 */
public class PacoteViagem {
   private String destino;
   private int qdias;
   private float margemlucro, total, taxadici;
   
     Transporte transporte1 = new Transporte();
       Hospedagem hospedagem1 = new Hospedagem();

    public Transporte getTransporte1() {
        return transporte1;
    }

    public void setTransporte1(Transporte transporte1) {
        this.transporte1 = transporte1;
    }
    
   
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
   
    
    public float calcularHospedagem(float num1, int num2){
    return (num1*num2);
    }
    
    public float valorlucro(float num1,float num2){
    return ((num1/100)*num2)+num1;
    }
    
    public float totalPacote(float num1, float num2, float num3){
    return (num1+num2+num3);
    }

}
