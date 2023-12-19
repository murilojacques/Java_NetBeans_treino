/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class Horista extends Funcionario {
    Scanner dados = new Scanner(System.in);
    Scanner dados2 = new Scanner(System.in);
    private int horasTra=0;
    private float valorHora=0;
    private float Salario=0;

    public int getHorasTra() {
        return horasTra;
    }

    public void setHorasTra(int horasTra) {
        this.horasTra = horasTra;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    
    
    @Override
    public void Descricao() {
    System.out.println("\nNOME: "+ nome);
   System.out.println("CPF: "+ cpf);
   System.out.println("ENDERECO: "+ endereco);
   System.out.println("TELEFONE: "+ telefone);
   System.out.println("SETOR: "+ setor);
   System.out.println("VALOR HORA: "+ valorHora);
   System.out.println("HORAS TRABALHADAS: "+ horasTra);
   System.out.println("SALARIO: "+ getSalario());
   
   
    }
    
    @Override
    public void CalculosalarioMensal(){
    System.out.println("Insira o valor recebido por hora trabalhada: ");
    setValorHora(dados.nextInt());
    System.out.println("Insira o numero de horas trabalhadas: ");
    setHorasTra(dados2.nextInt());
    setSalario(valorHora*horasTra);
    }
    
    @Override
     public void AumentarSalario(){
    Salario=((Salario/100)*getPorcentagem()+Salario);
    System.out.println("\nNOME: "+ nome);
   System.out.println("CPF: "+ cpf);
   System.out.println("ENDERECO: "+ endereco);
   System.out.println("TELEFONE: "+ telefone);
   System.out.println("SETOR: "+ setor);
   System.out.println("VALOR HORA: "+ valorHora);
   System.out.println("HORAS TRABALHADAS: "+ horasTra);
   System.out.println("SALARIO: "+ getSalario());
   
     }
     
   
}
