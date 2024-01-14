/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_07;

/**
 *
 * @author Murilo
 */
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public Funcionario(String n, int i, String g,String setor, boolean trabalhando) {
        this.setNome(n);
        this.setIdade(i);
        this.setGenero(g);
        this.setSetor(setor);
        this.setTrabalhando(trabalhando);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
