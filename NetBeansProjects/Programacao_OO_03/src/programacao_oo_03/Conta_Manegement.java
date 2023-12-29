/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_oo_03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Murilo
 */
public class Conta_Manegement {
    List<Conta_Bancaria> dados = new ArrayList();
    public void AdicionarCon(Conta_Bancaria conta){
        for(int a=0; a<dados.size(); a++){
            dados.set(a, conta);
        }}
    
    public void listar(int id){
        if(id < dados.size()){
        Conta_Bancaria cb = dados.get(id);
            System.out.println("Nome Dono: "+cb.getDono());
                }
    }
}
