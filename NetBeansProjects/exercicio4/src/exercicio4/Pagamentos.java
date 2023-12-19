/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Pagamentos {
   protected String nomeEmpresa="";
    Scanner vari = new Scanner(System.in);

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

        ArrayList<Object> pagamentos = new ArrayList<>();
        
        PIS impostoPis = new PIS();
        IPI impostoIpi = new IPI();
   
    public void PIS(){ 
        
        System.out.println("\nInsira o seu debito: ");
        impostoPis.setDebito(vari.nextInt());
        System.out.println("\nInsira o seu credito: ");
        impostoPis.setCredito(vari.nextInt());
        pagamentos.add(impostoPis.getTipoImposto());
        impostoPis.CalculoImposto();
        pagamentos.add(impostoPis.CalculoImposto());
       
        
        
        }
    
    public void IPI(){
        
            System.out.println("Defina o valor do produto: ");
            impostoIpi.setValorProduto(vari.nextInt());
            System.out.println("Defina o valor do frete: ");
            impostoIpi.setValorFrete(vari.nextInt());
            System.out.println("Defina o valor do seguro: ");
            impostoIpi.setValorSeguro(vari.nextInt());
            System.out.println("Defina o valor das despesas adicionais: ");
            impostoIpi.setOutrasDespesas(vari.nextInt());
            System.out.println("Defina o valor da aliquota: ");
            impostoIpi.setAliquota(vari.nextInt());
            pagamentos.add(impostoIpi.getTipoImposto());
            impostoIpi.CalculoImposto();
            pagamentos.add(impostoIpi.CalculoImposto());
        }}
     
     
    

