/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_08;

/**
 *
 * @author Murilo
 */
public final class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public Professor(String n, int i, String g,String especialidade, float salario) {
        this.setNome(n);
        this.setIdade(i);
        this.setGenero(g);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void recerberAumento(float a){
        this.setSalario(this.getSalario()+a);
    }
    
}
