/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_020;

/**
 *
 * @author Murilo
 */
public class Pizza {
    private String massa;
    private String molho;
    private String recheio;
    private String queijo;
    
    Pizza(){
        
    }
    
    Pizza(String m){
        this.setMassa(m);
    }
    
    Pizza(String m, String mo){
        this.setMassa(m);
        this.setMolho(mo);
    }
     
    Pizza(String m, String mo, String r){
        this.setMassa(m);
        this.setMolho(mo);
        this.setRecheio(r);
    }
      
    Pizza(String m, String mo, String r, String q){
        this.setMassa(m);
        this.setMolho(mo);
        this.setRecheio(r);
        this.setQueijo(q);
    }
    

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }
    
    
    
    public void listaIngredientes(){
        System.out.println("Esses sao os ingredientes da Sua Pizza: ");
        System.out.println(this.getMassa());
        System.out.println(this.getMolho());
        System.out.println(this.getRecheio());
        System.out.println(this.getQueijo());
    }
    

    public String toString(){
        String string = this.getMassa()+ ", "+this.getMolho()+", "+this.getRecheio()+", "+this.getQueijo();
        return string;
    }
    
}
