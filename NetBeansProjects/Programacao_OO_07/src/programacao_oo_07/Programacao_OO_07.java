/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacao_oo_07;

/**
 *
 * @author Murilo
 */
public class Programacao_OO_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pe = new Pessoa();
        Professor p = new Professor("Marcos", 28, "M", "Fisica", 2800.00f);
        Aluno a = new Aluno("Felipe", 17, "M", "Engenharia");
        Funcionario f = new Funcionario("Marcia", 39, "F", "Administracao", true);

        pe.setNome("Joao");
        pe.setIdade(31);
        pe.setGenero("M");

        f.fazerAniv();
        p.recerberAumento(270.8f);

        System.out.println(p.getSalario());
    }

}
