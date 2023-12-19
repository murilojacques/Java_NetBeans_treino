/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Murilo
 */
public class Transporte {
    private String tipo;
     private float valor;
     
    
   public String getTipo(){
   return tipo;
   }
   public void setTipo(String tipo){
   this.tipo=tipo;
   }
   
   public float getValor(){
   return valor;
   }
   public void setValor(int valor){
   this.valor = valor;
   }
   
  public void descrever(){
  System.out.println("metodo de transporte: "+tipo);
  System.out.println("Valor do transporte (considerado em dolar): $"+valor);
  }
  
  public void maritimo(){
  setTipo("maritimo");
  }
   public void aereo(){
  setTipo("aereo");
  }
    public void rodoviario(){
  setTipo("rodoviario");
  }
     public void ferroviario(){
  setTipo("ferroviario");
  }

}
