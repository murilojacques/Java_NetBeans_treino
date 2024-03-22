/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_041;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class C_041 {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Salve meu Mano", "Mensagem de Bom Dia", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Informo que o dia esta bom hoje", "Mensagem para Informar", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Voce gosta de Pão de Queijo?", "Pergunta", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "O seu computador esta com VIRUS!!!", "Mensagem de Aviso", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "ERRO! ERRRO! ERRRRO! ERRRRRO!", "ERRO", JOptionPane.ERROR_MESSAGE);
        
      /** int i = JOptionPane.showConfirmDialog(null, "Voce Concorda?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION); 
       switch(i){
           case 0:
            System.out.println("Bom Saber, Voce esta cem Porcento Correto quem Falar que não concordas e Indiota");
           break;
           
           case 1:
            System.out.println("Mas e Claro que voce nao deve Concordar, Concordar com esses Termos seria Absurdo, Voce esta correto");
           break;
       
           case 2:
            System.out.println("Ta Bom Ne");
           break;
           
           case -1:
            System.out.println("WEE-OON");
           break;
       }
       * **/
        
    /** String cor = JOptionPane.showInputDialog("Digite sua Cor Favorita");
     switch(cor){
           case"azul":
            System.out.println("Cor do Ceu e do Mar, que escolha Maravilhosa");
           break;
           
           case "vermelho":
            System.out.println("Cor forte e bonita, otima escolha");
           break;
           
           case "preto":
            System.out.println("uma cor sombria tipo o Batman, ou seria a falta de Cor, de qualquer forma e a cor mais versatil");
           break;
           
           case "branco":
            System.out.println("bela cor, a juncao de todas as outras");
           break;
           
           case "roxo":
            System.out.println("otima escolha para uma cor, roxo que cor magnifica");
           break;
           
           default:
               System.out.println("Cor mais PAIA que essa tua nao existe");
           break;
     }**/
    
    String[] respostas = {"nao, voce e incrivel", "obrigado", "Ai qui vergonhaa *cora*"};
    ImageIcon imagem = new ImageIcon("SERIO.ico"); // ele nao aceita favicon (imagem.ico)
    
    JOptionPane.showOptionDialog(null,
            "Voce é incrivel",
            "mensagem Secreta",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            imagem,
            respostas,
            0);
    
    }
}
