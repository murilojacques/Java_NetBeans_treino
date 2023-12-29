/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Murilo
 */
public class Conta_Bancaria {
    int numConta;
    String tipo;
    String dono;
    float saldo;
    boolean Conta_Aberta;
    
    public Conta_Bancaria(){
        this.tipo = "";
        this.abrirC();
        this.saldo = 0.0f;
    }
    
    public Conta_Bancaria(int numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getConta_Aberta() {
        return Conta_Aberta;
    }

    public void setConta_Aberta(boolean Conta_Aberta) {
        this.Conta_Aberta = Conta_Aberta;
    }
    
    
    public void fecharC(){
        this.Conta_Aberta = false;
    }
    
    public void abrirC(){
        this.Conta_Aberta = true;
    }
    
    public void depositar(float f){
        this.saldo += f;
        System.out.println("\nValor Depositado com Sucesso!!!");
        System.out.println("Total depositado atualmente na conta: "+ this.getSaldo());
    }
    
    public void sacar(float s){
        this.saldo += s;
        System.out.println("\nValor Retirado com Sucesso!!!");
        System.out.println("Total depositado atualmente na conta: "+ this.getSaldo());
    }
    
    public void pagar(float p){
        this.saldo -= p;
        System.out.println("\nPagamento Realizado Com Sucesso");
    }
    
    
    
}
