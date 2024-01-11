/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_uec_t;

import java.util.Random;

/**
 *
 * @author Murilo
 */
public class Luta {

    private Lutadores desafiado;
    private Lutadores desafiante;
    private int round;
    private boolean aprovada;

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutadores l1, Lutadores l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void Lutar() {
        if (this.isAprovada() == true) {
            this.desafiado.apresentar();
            System.out.println("\n");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Desafiante " + this.desafiante.getNome() + " Venceu");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("Desafiado " + this.desafiado.getNome() + " Venceu");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
            }
        } else {
            System.out.println("A Luta Não pode Acontecer");
        }
    }
}
