/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author Murilo
 */
public class Venda {
    private String nomecli;
    private String formapaga;
    private float dolarReal;

    public float getDolarReal() {
        return dolarReal;
    }

    public void setDolarReal(float dolarReal) {
        this.dolarReal = dolarReal;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getFormapaga() {
        return formapaga;
    }

    public void setFormapaga(String formapaga) {
        this.formapaga = formapaga;
    }
    
    
    public float converterValor(float num1, float num2){
    return (num1/num2);
    }
    
}
