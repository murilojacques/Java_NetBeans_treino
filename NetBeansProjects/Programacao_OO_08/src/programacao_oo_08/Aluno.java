/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_08;

/**
 *
 * @author Murilo
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    

    public Aluno(String n, int i, String g, String c, int m) {
        this.setNome(n);
        this.setIdade(i);
        this.setGenero(g);
        this.setMatricula(m);
        this.setCurso(c);
    }

    
    
    public int isMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade De Aluno "+this.getNome());
    }
}
