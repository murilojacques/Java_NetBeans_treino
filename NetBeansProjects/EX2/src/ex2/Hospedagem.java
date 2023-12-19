/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author Murilo
 */
public class Hospedagem {
   private String descricao;
   private float valordiaria;
    
    
     public String getDescricao(){
   return descricao;
   }
   public void setDescricao(String descricao){
   this.descricao=descricao;
   }
   
   public float getValordiaria(){
   return valordiaria;
   }
   public void setValordiaria(int valordiaria){
   this.valordiaria=valordiaria;
   }
    
    public void descrever(){
  System.out.println("Valor da estadia na hospedagem (considerado em dolar): $"+valordiaria);
  System.out.println("descricao da hospedagem: "+descricao);
 
  }
}
