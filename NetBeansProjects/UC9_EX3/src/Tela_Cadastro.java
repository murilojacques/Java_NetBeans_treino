/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import codigo.Codigo;
import codigo.Lista_Consulta;

import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Murilo
 */
public class Tela_Cadastro extends javax.swing.JFrame {
   
    private final String[] tableColumns = {"Paciente", "CPF", "Telefone", "Data", "Ja era paciente", "Consulta Realizada"};
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
    private ArrayList<Codigo> pacienteList = new ArrayList<>(); 
    
    
    private boolean emptyFields(){
     
     boolean empty = true; 

     if(Campo_Nome.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Nome não pode ser vazio.");
     } else if(Campo_CPF.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! CPF não pode ser vazio.");
     } else if(Campo_Telefone.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Idade não pode ser vazio.");
     }else if(Campo_Data.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data não pode ser vazio.");
     } else{
         
         empty = false;
     }
     return empty;
  }
    
    
    
    private Codigo getPacientes(){
     Codigo paciente = new Codigo();
     
     paciente.setConRealizada("nao");
     
     if(Campo_Nome.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "O campo Nome precisa ser preenchido: ");        
  }else{       
        paciente.setPaciente(Campo_Nome.getText().toUpperCase());
         }

     if(CheckBox_Ja_e_paciente.isSelected()){
       paciente.setJPaciente("Sim");
     }else{paciente.setJPaciente("nao");}
     
    if(Campo_CPF.getText().isEmpty() || Campo_CPF.getText().length()<11) {
    JOptionPane.showMessageDialog(null, "O campo CPF precisa ser preenchido: ");        
  }else{
        String validacao = Campo_CPF.getText();
        boolean palavra = validacao.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
        if(palavra=true){
        paciente.setCPF(Campo_CPF.getText().toLowerCase());
        }}
    
    if(Campo_Telefone.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "O campo Telefone precisa ser preenchido: ");        
  }else{
        paciente.setTelefone(Campo_Telefone.getText());
         }
    
    if(Campo_Data.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "O campo Data precisa ser preenchido: ");        
  }else{
        String validacao = Campo_Data.getText();
        boolean palavra = validacao.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
        if(palavra=true){
        paciente.setData(Campo_Data.getText());
        } }
     return paciente;
  }
    
    void inserirPaciente(Codigo paciente){
     Lista_Consulta.Adicionar(paciente);
     
  }
    
  
    
    public Tela_Cadastro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Campo_Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CheckBox_Ja_e_paciente = new javax.swing.JCheckBox();
        Botao_Cadastrar = new javax.swing.JButton();
        Campo_CPF = new javax.swing.JFormattedTextField();
        Campo_Data = new javax.swing.JFormattedTextField();
        Campo_Telefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Cadastrar Consulta");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome do(a) Paciente:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Data da Consulta:");

        CheckBox_Ja_e_paciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CheckBox_Ja_e_paciente.setText("Já é Paciente");
        CheckBox_Ja_e_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_Ja_e_pacienteActionPerformed(evt);
            }
        });

        Botao_Cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Botao_Cadastrar.setText("Cadastrar");
        Botao_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_CadastrarActionPerformed(evt);
            }
        });

        try {
            Campo_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            Campo_Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            Campo_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Botao_Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(CheckBox_Ja_e_paciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Campo_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(Campo_CPF)
                            .addComponent(Campo_Data)
                            .addComponent(Campo_Telefone))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Campo_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Campo_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Campo_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Campo_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(CheckBox_Ja_e_paciente)
                .addGap(26, 26, 26)
                .addComponent(Botao_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_CadastrarActionPerformed
         if(!emptyFields()){
        inserirPaciente(getPacientes()); 
         }
         Codigo a = new Codigo();
        System.out.println(a.getConRealizada());
       
       Atualizar.Atualizar();
       
       dispose();
    }//GEN-LAST:event_Botao_CadastrarActionPerformed

    private void CheckBox_Ja_e_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_Ja_e_pacienteActionPerformed
        
    }//GEN-LAST:event_CheckBox_Ja_e_pacienteActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Cadastrar;
    private javax.swing.JFormattedTextField Campo_CPF;
    private javax.swing.JFormattedTextField Campo_Data;
    private javax.swing.JTextField Campo_Nome;
    private javax.swing.JFormattedTextField Campo_Telefone;
    private javax.swing.JCheckBox CheckBox_Ja_e_paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
