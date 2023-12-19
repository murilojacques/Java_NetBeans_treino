
package com.mycompany.uc10_atividade3;
 import jakarta.persistence.Entity;
 import jakarta.persistence.GeneratedValue;
 import jakarta.persistence.GenerationType;
 import jakarta.persistence.Id;
/**
 *
 * @author Murilo
 */
@Entity
public class Podcast {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String produtor="";
    
    private String nomeDoEpisodio="";
    
    private int numeroEpisodio=0;
    
    private double duracao=0.0;
    
    private String URL="";

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNomeDoEpisodio() {
        return nomeDoEpisodio;
    }

    public void setNomeDoEpisodio(String nomeDoEpisodio) {
        this.nomeDoEpisodio = nomeDoEpisodio;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
