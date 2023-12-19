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
public class Assalariado extends Funcionario {
    Scanner dados= new Scanner(System.in);
    private float salarioMensal=0;
    private int aumento=0;
     Funcionario[] empregado = new Funcionario[10];
    
    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

     @Override
    public void Descricao(){
   System.out.println("\nNOME: "+ nome);
   System.out.println("CPF: "+ cpf);
   System.out.println("ENDERECO: "+ endereco);
   System.out.println("TELEFONE: "+ telefone);
   System.out.println("SETOR: "+ setor);
   System.out.println("SALARIO: "+ getSalarioMensal());
   
    }
    @Override
    public void CalculosalarioMensal(){
    System.out.println("Insira o seu salario: ");
    setSalarioMensal(dados.nextInt());
    }
    
    @Override
    public void AumentarSalario(){
    salarioMensal= ((salarioMensal/100)*getPorcentagem()+salarioMensal);
    System.out.println("\nNOME: "+ nome);
   System.out.println("CPF: "+ cpf);
   System.out.println("ENDERECO: "+ endereco);
   System.out.println("TELEFONE: "+ telefone);
   System.out.println("SETOR: "+ setor);
   System.out.println("SALARIO: "+ getSalarioMensal());
    }
   
     
}
