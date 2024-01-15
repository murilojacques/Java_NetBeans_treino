/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_10;

/**
 *
 * @author Murilo
 */
public class Gafanhotos extends Pessoa{
    private String login="";
    private int totAssistido=0;

    public Gafanhotos(String nome, int idade, String genero, String login) {
        super(nome, idade, genero);
        
        this.setLogin(login);
        this.setTotAssistido(0);
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
    }

    @Override
    public String toString() {
        return "Gafanhotos{" + "login=" + login + ", totAssistido=" + totAssistido + ", Nome=" + this.getNome() +", Idade=" + this.getIdade() +", genero=" + this.getGenero() +'}';
    }
    
}
