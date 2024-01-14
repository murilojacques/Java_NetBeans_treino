/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pogramacao_oo_09;

/**
 *
 * @author Murilo
 */
public class Cachorro extends Mamifero{
    public void enterrandoOsso(){
        System.out.println("enterrando osso!");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o Rabo");
    }
    
    @Override
    public void emitiSom(){
        System.out.println("AU! AU! AU! RRRR!");
    }
    
    public void reagir(String f){
        if(f.equals("agradavel")){
            System.out.println("au au au");
            this.abanarRabo();
        } else if(f.equals("desagradavel")){
            System.out.println("RRRRRRRRRRRRRRRRRR! AU!");
        } else {
            System.out.println("O Dog ta Consfuso! ;-;");
        }
    }
     public void reagir(int h){
        if(h < 24 && h>=0){
            if(h>0 && h<=5 || h>18 && h<24){
                this.abanarRabo();
            }
            else if(h>5 && h<13){
                this.abanarRabo();
                System.out.println("au au au");
            }
            else{
                System.out.println("Dog esta a Ignorar");
            }
        } else{
            System.out.println("Horario Invalido");
        }
    }
      public void reagir(boolean d){
        if(d == true){
            this.abanarRabo();
        } else{
            System.out.println("RRRRRRRRRRRRRRRRRR! AU!");
            
            this.emitiSom();
        }
    }
       public void reagir(int i, float p){
        if(i<10 && p<27.5f){
            this.abanarRabo();
        } else if(p>27.5f && i<10){
            this.emitiSom();
        } else if(i>10 && p<27.5f){
            System.out.println("RRRRRRRRRRRRRRRRRR! AU!");
        } else if(i>10 && p > 27.5f){
            System.out.println("Dog esta a Ignorar");
        }
    }
}
