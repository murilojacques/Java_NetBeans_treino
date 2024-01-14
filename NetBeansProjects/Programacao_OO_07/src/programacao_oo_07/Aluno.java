/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_07;

/**
 *
 * @author Murilo
 */
public class Aluno extends Pessoa{
    private boolean matricula;
    private String curso;

    public Aluno(String n, int i, String g, String c) {
        this.setNome(n);
        this.setIdade(i);
        this.setGenero(g);
        this.setMatricula(true);
        this.setCurso(c);
    }

    
    
    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cancelaMatri(){
        this.setMatricula(false);
    }
}
