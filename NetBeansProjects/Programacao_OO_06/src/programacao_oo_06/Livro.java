/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_06;

import java.util.Random;

/**
 *
 * @author Murilo
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = aberto;
        this.leitor = leitor;
        this.setPagAtual(1);
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        Random aleatorio = new Random();
        this.setPagAtual( aleatorio.nextInt(this.getTotPaginas()));
        System.out.println(this.getLeitor().getNome()+" Abriu o livro "+ this.getTitulo()+ " na pagina "+ this.getPagAtual());
    }

    @Override
    public void avancarPag() {
        if((this.getPagAtual()< this.getTotPaginas()) && this.isAberto() == true){
       this.setPagAtual(this.getPagAtual()+1);
        }else {
            System.out.println("Nao e possivel avancar uma pagina");
        }
    }

    @Override
    public void voltarPag() {
        if((this.getPagAtual() > 1) && this.isAberto() == true){
        this.setPagAtual(this.getPagAtual()-1);
        } else {
            System.out.println("Nao e possivel voltar uma pagina");
        }
    }
    
    public void descricao(){
        if(this.isAberto() == true){
        System.out.println("Nosso Leitor "+this.getLeitor().getNome() + " que possue " + this.getLeitor().getIdade()+ " Anos de Idade"+" Esta neste exato momento com o livro "+ this.getTitulo() + " em maos,");
        System.out.println("Este que foi escrito por "+ this.getAutor() + ", tendo ao todo "+this.getTotPaginas()+" paginas.");
        System.out.println("Nosso avido Leitor esta com o livro aberto na pagina "+ this.getPagAtual());
        } else{
            System.out.println("Nosso Leitor "+this.getLeitor().getNome() + " que possue " + this.getLeitor().getIdade()+ " Anos de Idade"+" Esta neste exato momento com o livro "+ this.getTitulo() + " em maos,");
        System.out.println("Este que foi escrito por "+ this.getAutor() + ", tendo ao todo "+this.getTotPaginas()+" paginas.");
        System.out.println("Nosso avido Leitor, porem, esta com o livro fechado.");
        }
    }
    
}
