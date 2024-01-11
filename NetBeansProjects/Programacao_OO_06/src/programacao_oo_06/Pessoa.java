/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_06;

/**
 *
 * @author Murilo
 */
public class Pessoa {
    private String nome ="";
    private int idade=0;
    private String genero="";

    public Pessoa(String n, int i, String g) {
        this.setNome(n);
        this.setIdade(i);
        this.setGenero(g);
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void fazerAniver(){
        this.setIdade(this.getIdade()+1);
    }
}
