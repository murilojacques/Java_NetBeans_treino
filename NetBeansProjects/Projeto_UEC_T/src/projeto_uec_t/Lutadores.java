/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_uec_t;

/**
 *
 * @author Murilo
 */
public class Lutadores {

    private String nome;
    private int idade;
    private float altura;
    private String nacionalidade;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutadores(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.nacionalidade = nacionalidade;
        this.setPeso(peso);
        
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Invalido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "peso Leve";
        } else if (this.getPeso() < 83.9) {
            this.categoria = "Peso Medio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    
    public void apresentar(){
        System.out.println("CHEGOU A HORA! Apresentando "+this.getNome());
        System.out.println("Diretamente de seu pais de origem: "+this.getNacionalidade());
        System.out.println("Com "+this.getIdade() + " anos de Idade e " + this.getAltura() + " de Altura");
        System.out.println("pesando "+ this.getPeso() + "Kg");
        System.out.println(this.getVitorias()+" vitorias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
    }
    
    public void status(){
        System.out.println(this.getNome()+" e um "+this.getCategoria());
        System.out.println("ganhou "+this.getVitorias() + " Vezes");
        System.out.println("perdeu "+this.getDerrotas() + " Vezes");
        System.out.println("empatou "+this.getEmpates() + " Vezes");
    }
}
