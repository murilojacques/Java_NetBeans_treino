/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_integrador_mod_ii;

import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class Tela_SacarDepositar extends javax.swing.JFrame {

    /**
     * Creates new form Tela_SacarDepositar
     */
    ContaDAO cdao = new ContaDAO();
    Tela_Login tl = new Tela_Login();
    conta c;

    public Tela_SacarDepositar() {
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

        Botao_Sacar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Campo_Valor = new javax.swing.JTextField();
        Botao_Depositar = new javax.swing.JButton();
        Botao_Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botao_Sacar.setText("Sacar");
        Botao_Sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_SacarActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor:");

        Botao_Depositar.setText("Depositar");
        Botao_Depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_DepositarActionPerformed(evt);
            }
        });

        Botao_Voltar.setText("Voltar");
        Botao_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao_Sacar)
                    .addComponent(Botao_Depositar))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Botao_Voltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Campo_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Botao_Sacar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(Botao_Depositar)
                .addGap(13, 13, 13)
                .addComponent(Botao_Voltar)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_SacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_SacarActionPerformed
        try {
            c = cdao.obter(cdao.obterId());
            float valor = Float.parseFloat(Campo_Valor.getText().replace(",", "."));
            if(c.getSaldo() > valor && c.isStatus() == true){
            c.setSaldo(c.getSaldo() - valor);
            cdao.atualizar(c);
            }else {
                JOptionPane.showMessageDialog(null,"Nao e possivel realizar o saque verifique se a conta esta aberta e verifique se o valor de saque nao excede o total depositado na conta");
            }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_Botao_SacarActionPerformed

    private void Botao_DepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_DepositarActionPerformed
        try {
            c = cdao.obter(cdao.obterId());
            float valor = Float.parseFloat(Campo_Valor.getText().replace(",", "."));
            if(c.isStatus() == true){
            c.setSaldo(c.getSaldo() + valor);
            cdao.atualizar(c);
            }else {
                JOptionPane.showMessageDialog(null,"Nao e possivel realizar o deposito verifique se a conta esta aberta");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Botao_DepositarActionPerformed

    private void Botao_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_Botao_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_SacarDepositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_SacarDepositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_SacarDepositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_SacarDepositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_SacarDepositar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Depositar;
    private javax.swing.JButton Botao_Sacar;
    private javax.swing.JButton Botao_Voltar;
    private javax.swing.JTextField Campo_Valor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
