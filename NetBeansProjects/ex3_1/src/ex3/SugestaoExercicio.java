/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author Murilo
 */
public class SugestaoExercicio {
    private Musculacao exercicioMusculacao;
    private Corrida exercicioCorrida;

    public Musculacao getExercicioMusculacao() {
        return exercicioMusculacao;
    }

    public void setExercicioMusculacao(Musculacao exercicioMusculacao) {
        this.exercicioMusculacao = exercicioMusculacao;
    }

    public Corrida getExercicioCorrida() {
        return exercicioCorrida;
    }

    public void setExercicioCorrida(Corrida exercicioCorrida) {
        this.exercicioCorrida = exercicioCorrida;
    }
    
    public void gerar(Byte opcao){
    if(opcao == 1){
    
        exercicioMusculacao = new Agachamento();
        exercicioCorrida = new CorridaResistencia();
    }
    else{
    
        exercicioMusculacao = new TrenoProwler();
        exercicioCorrida = new CorridaCemMetros();
    }
    }
}
