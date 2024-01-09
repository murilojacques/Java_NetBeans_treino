/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_integrador_mod_ii;

/**
 *
 * @author Murilo
 */
public class Projeto_Integrador_Mod_II {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String nome = "Marcos";
        String endereco = "xingu 741";
        int cpf = 01452452367;
        int cnpj = 0;
        String tipo = "conta corrente";
        float saldo = 50.0f;
        boolean status = true;
        String pfpj = "pf";
        
        conta c = new conta(nome, endereco, cpf, cnpj, tipo, saldo, status, pfpj);
        
        ContaDAO cdao = new ContaDAO();
        
        cdao.cadastrar(c);
    }
}
