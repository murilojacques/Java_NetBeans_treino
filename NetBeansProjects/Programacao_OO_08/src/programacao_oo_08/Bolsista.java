/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_08;

/**
 *
 * @author Murilo
 */
public class Bolsista extends Aluno{
        private float bolsa; 
        
    public Bolsista(String n, int i, String g, String c, int m, float b) {
        super(n, i, g, c, m);
        
        this.setNome(n);
        this.setIdade(i);
        this.setGenero(g);
        this.setCurso(c);
        this.setMatricula(m);
        this.setBolsa(b);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" E Bolsista! Pagamento Facilitado!");
    }
    
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        
    }
    
}
