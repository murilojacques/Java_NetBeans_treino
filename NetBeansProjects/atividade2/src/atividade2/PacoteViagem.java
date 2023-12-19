/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

/**
 *
 * @author Murilo
 */
public class PacoteViagem {
    Transporte transporte1 = new Transporte();
    Hospedagem hospedagem1 = new Hospedagem();
    float totalHospedagem;
    float totalPacote;

    public Transporte getTransporte1() {
        return transporte1;
    }

    public void setTransporte1(Transporte transporte1) {
        this.transporte1 = transporte1;
    }

    public Hospedagem getHospedagem1() {
        return hospedagem1;
    }

    public void setHospedagem1(Hospedagem hospedagem1) {
        this.hospedagem1 = hospedagem1;
    }
    
    public float calcularHospedagem(float num1, int num2){
    return totalHospedagem=(num1*num2);
    }
    
    public float valorLucro(float num1,float num2){
    return ((num2/100)*num1)+num2;
    }
    
    public float totalPacote(float num1, float num2, float num3){
    return totalPacote=(num1+num2+num3);
    }
    
    public void descrever(){
    
    }
}
