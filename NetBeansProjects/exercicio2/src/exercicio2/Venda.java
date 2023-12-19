/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Murilo
 */
public class Venda {
    PacoteViagem pacoteVenda = new PacoteViagem();
    private String nomeCliente;
    private String formaPagamento;
    private float dolarReal;
    float ValorConvertido;

    public float getDolarReal() {
        return dolarReal;
    }

    public void setDolarReal(float dolarReal) {
        this.dolarReal = dolarReal;
    }

    public String getNomecli() {
        return nomeCliente;
    }

    public void setNomecli(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFormapaga() {
        return formaPagamento;
    }

    public void setFormapaga(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    
    public void descrever(){
    
       System.out.println("Nome do cliente: "+getNomecli());
       System.out.println("metodo de pagamento: "+getFormapaga());
       pacoteVenda.hospedagem1.descrever();
       System.out.println("tempo de estadia: "+ pacoteVenda.getQdias()+" dias");
       System.out.println("Valor total de hospedagem: $"+ pacoteVenda.calcularHospedagem( pacoteVenda.hospedagem1.getValordiaria(),  pacoteVenda.getQdias()));
       System.out.println("Margem total de lucro: "+ pacoteVenda.valorlucro( pacoteVenda.getMargemlucro(),  pacoteVenda.getTaxadici()));
       pacoteVenda.transporte1.descrever();
       System.out.println("Valor total do pacote de viagem (considerado em dolar): "+ pacoteVenda.totalPacote( pacoteVenda.calcularHospedagem( pacoteVenda.hospedagem1.getValordiaria(),  pacoteVenda.getQdias()),  pacoteVenda.transporte1.getValor(),  pacoteVenda.valorlucro( pacoteVenda.getMargemlucro(),  pacoteVenda.getTaxadici())));
       
       
    }
    
   
    
    public float converterValor(float num1, float num2){
    return ValorConvertido=(num1*num2);
    }
       
}
