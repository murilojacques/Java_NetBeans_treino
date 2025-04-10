/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.toentediado;

/**
 *
 * @author Murilo
 */
public class Tela_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Inicial
     */
    public Tela_Inicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Nome = new javax.swing.JLabel();
        Campo_Nome = new javax.swing.JTextField();
        txt_Idade = new javax.swing.JLabel();
        Campo_Idade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Genero = new javax.swing.JLabel();
        Campo_Genero = new javax.swing.JTextField();
        txt_Nacionalidade = new javax.swing.JLabel();
        Campo_Nacionalidade = new javax.swing.JTextField();
        Botao_Cadastrar = new javax.swing.JButton();
        Botao_Listagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Nome.setText("Nome:");

        txt_Idade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Idade.setText("Idade:");

        jLabel3.setText("Idade:");

        txt_Genero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Genero.setText("Gênero:");

        Campo_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_GeneroActionPerformed(evt);
            }
        });

        txt_Nacionalidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Nacionalidade.setText("Nacionalidade:");

        Botao_Cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Botao_Cadastrar.setText("Cadastrar");
        Botao_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_CadastrarActionPerformed(evt);
            }
        });

        Botao_Listagem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Botao_Listagem.setText("Listagem");
        Botao_Listagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ListagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(txt_Genero))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_Nacionalidade)
                                .addGap(4, 4, 4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Nome)
                            .addComponent(txt_Idade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Campo_Nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Botao_Cadastrar)
                        .addGap(66, 66, 66)
                        .addComponent(Botao_Listagem)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nome)
                    .addComponent(Campo_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Genero)
                            .addComponent(Campo_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Campo_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Idade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nacionalidade)
                    .addComponent(Campo_Nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_Cadastrar)
                    .addComponent(Botao_Listagem))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_GeneroActionPerformed

    private void Botao_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_CadastrarActionPerformed
        informacoes dados = new informacoes();
        
        try{
            dados.setNome(Campo_Nome.getText());
            dados.setIdade(Integer.valueOf(Campo_Idade.getText()));
            dados.setGenero(Campo_Genero.getText());
            dados.setNacionalidade(Campo_Nacionalidade.getText());
            
            
            
            informacoesDao.Cadastrar(dados);
            
        }catch(Exception e){}
    }//GEN-LAST:event_Botao_CadastrarActionPerformed

    private void Botao_ListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_ListagemActionPerformed
        Tela_Listagem tela_listagem = new Tela_Listagem();
        tela_listagem.setVisible(true);
    }//GEN-LAST:event_Botao_ListagemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Cadastrar;
    private javax.swing.JButton Botao_Listagem;
    private javax.swing.JTextField Campo_Genero;
    private javax.swing.JTextField Campo_Idade;
    private javax.swing.JTextField Campo_Nacionalidade;
    private javax.swing.JTextField Campo_Nome;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txt_Genero;
    private javax.swing.JLabel txt_Idade;
    private javax.swing.JLabel txt_Nacionalidade;
    private javax.swing.JLabel txt_Nome;
    // End of variables declaration//GEN-END:variables
}
