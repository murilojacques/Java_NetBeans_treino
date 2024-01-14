/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_08;

/**
 *
 * @author Murilo
 */
public class Tecnico extends Aluno{
        private int registroProfissional;
    
    public Tecnico(String n, int i, String g, String c, int m, int r) {
        super(n, i, g, c, m);
        this.setNome(n);
        this.setIdade(i);
        this.setMatricula(m);
        this.setCurso(c);
        this.setGenero(g);
        this.setRegistroProfissional(r);
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    public void praticar(){
        System.out.println("O Parca esta a praticar!!!");
    }
}
