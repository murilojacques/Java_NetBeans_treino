/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste_interface;

 import javax.swing.JOptionPane;
/**
 *
 * @author Murilo
 */
public class Aplicacao {
    
    Aplicacao(){
        
        String nome;
        Double altura;
        Double peso;
        Double imc;
        String mensagem;
        
        
        JOptionPane.showMessageDialog(null, "Insira as seguintes informações ");
        nome = JOptionPane.showInputDialog("Digite seu nome ");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em cm "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em Kg "));
        
        imc = peso/(altura/100 * altura/100);
        
        JOptionPane.showInputDialog("Seu imc é "+imc);
        
        if(imc<18.5){
            mensagem = nome+" você está muito magro \n Precisa engordar";
        }
        else if(imc < 24.9){
            mensagem = nome+" você está com o peso ideal \n Não precisa de dieta";
        }
        else if(imc < 29.9){
            mensagem = nome+" você está com sobrepeso \n Precisa de uma dieta para emagrecer";
        }
        else if(imc < 30){
            mensagem = nome+" você está com obesidade.\nPrecisa de uma dieta, exercicios e uma mudança de vida";
        }
        else {
            mensagem = nome+" você está com obesidade grave.\nPrecisa procurar um médico";
        }
        
         JOptionPane.showMessageDialog(null, mensagem);
    }
}
