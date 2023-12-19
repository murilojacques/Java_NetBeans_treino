/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author Murilo
 */
public class PIS implements Imposto {
    protected double debito=0;
    protected double credito=0;
    protected double Taxa=1.65;
    String tipoImposto;

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public String getTipoImposto() {
        return tipoImposto;
    }

    public void setTipoImposto(String tipoImposto) {
        this.tipoImposto = tipoImposto;
    }

   

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getTaxa() {
        return Taxa;
    }

    public void setTaxa(double Taxa) {
        this.Taxa = Taxa;
    }
     
    @Override
    public String Descricao(){
    
      return tipoImposto;
    }
    
    @Override
    public double CalculoImposto(){
        
        
    return((debito-credito)*(Taxa/100));
    
    
    }

   
}
