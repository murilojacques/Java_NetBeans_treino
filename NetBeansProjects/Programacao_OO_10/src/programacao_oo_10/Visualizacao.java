/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_10;

/**
 *
 * @author Murilo
 */
public class Visualizacao {
    Gafanhotos espectador;
    Video filme;

    public Visualizacao(Gafanhotos espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    public Gafanhotos getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhotos espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    public void avaliar(){
        this.espectador.setExperiencia(this.espectador.getExperiencia()+0.1f);
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.espectador.setExperiencia(this.espectador.getExperiencia()+0.22f);
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        this.espectador.setExperiencia(this.espectador.getExperiencia()+0.35f);
        int tot=0;
        if(porc <= 20){
            tot = 3;
        } else if(porc <=50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        }else if (porc <=100){
            tot = 10;
        }
        
        this.filme.setAvaliacao(tot);
    }
}
