
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.Integer.valueOf;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Murilo
 */
public class Tela_Programa extends javax.swing.JFrame {
   
    public Tela_Programa() {
        
        initComponents();
        geraAcessbilidade();
    }
 
    public final void geraAcessbilidade() {

            
            Botao_Salvar.setMnemonic(KeyEvent.VK_S);
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Campo_PressaoSi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Campo_PressaoDi = new javax.swing.JTextField();
        CheckBox_Estresse = new javax.swing.JCheckBox();
        Botao_Salvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Campo_Tabela = new javax.swing.JTextArea();
        Campo_Data = new javax.swing.JFormattedTextField();
        Campo_Hora = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setLabelFor(Campo_Data);
        jLabel1.setText("Data:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setLabelFor(Campo_Hora);
        jLabel2.setText("Hora:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setLabelFor(Campo_PressaoSi);
        jLabel3.setText("Pressão Sistólica:");
        jLabel3.setNextFocusableComponent(Campo_PressaoDi);

        Campo_PressaoSi.setToolTipText("Digite o valor da Pressão Sistólica");
        Campo_PressaoSi.setNextFocusableComponent(Campo_PressaoDi);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setLabelFor(Campo_PressaoDi);
        jLabel4.setText("Pressão Diastólica:");
        jLabel4.setToolTipText("Digite o valor da Pressão Diastólica");

        Campo_PressaoDi.setNextFocusableComponent(CheckBox_Estresse);

        CheckBox_Estresse.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CheckBox_Estresse.setText("Estresse");
        CheckBox_Estresse.setToolTipText("Você está sobre estresse no momento da medição das pressões Sistólica e Diastólica\n\n");

        Botao_Salvar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Botao_Salvar.setText("Salvar");
        Botao_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_SalvarActionPerformed(evt);
            }
        });

        Campo_Tabela.setColumns(20);
        Campo_Tabela.setRows(5);
        jScrollPane1.setViewportView(Campo_Tabela);

        try {
            Campo_Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Campo_Data.setToolTipText("Digite a data do dia de hoje no padrão  dd/mm/aaaa");

        try {
            Campo_Hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(CheckBox_Estresse))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Campo_PressaoSi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Campo_PressaoDi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                        .addComponent(Botao_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Campo_Hora))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Campo_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Campo_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Campo_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Campo_PressaoSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Campo_PressaoDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBox_Estresse)
                    .addComponent(Botao_Salvar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
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

    private void Botao_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_SalvarActionPerformed
      String obj= "C:\\Users\\Murilo\\Documents\\NetBeansProjects\\UC9_EX4\\src\\texto.txt";
      
       
        
       
     int i=0;
      int p=0;
      
        
       String data;
       String hora;
       int PreSi;
       int PreDi;
       String estresse="";
       
       data=Campo_Data.getText();
       hora=Campo_Hora.getText();
       PreSi=Integer.parseInt( Campo_PressaoSi.getText());
       PreDi=Integer.parseInt( Campo_PressaoDi.getText());
       if(CheckBox_Estresse.isSelected())
       {estresse="Em estresse";}
       else{estresse="sem estresse";}
       
       String valores=Campo_Data.getText() + ", "+ Campo_Hora.getText() + ", " + Integer.valueOf( Campo_PressaoSi.getText()) + ", " + String.valueOf(Campo_PressaoDi.getText()) + ", " + estresse + ";";
       String[] dados = new String[10000];
       
       
       try{
        FileReader fr = new FileReader(obj);
        BufferedReader br = new BufferedReader(fr);
        
        String line="";
        Campo_Tabela.append(valores + "\n");
        dados[i]=valores;
         
         while ((line = br.readLine())!= null){
               i=i+1;
                 dados[i]=line;
                 System.out.println(dados[i]);
                  Campo_Tabela.append(dados[i] + "\n");
             System.out.println(i + "\n");
        }
         i=i+1;
         
          System.out.println(dados[i] + "\n" + "\n");
        
         br.close();
  

        FileWriter Writer = new FileWriter(obj);
        BufferedWriter bw = new BufferedWriter(Writer);
        
        
         System.out.println(dados[i] + "\n");
          System.out.println(i + "\n" + "\n");
            while(p != i){
            /**for (String dado1 : dados) {**/
                bw.write(dados[p] + "\n");
                System.out.println(dados[p]);
                p=p+1;
                /**if(p!=i){
                    bw.write(dados[p+1] + "\n");
                    p=p+1;
                }**/
                
            }
        bw.close();
        
        }catch(IOException e){}
    }//GEN-LAST:event_Botao_SalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela_Programa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Salvar;
    private javax.swing.JFormattedTextField Campo_Data;
    private javax.swing.JFormattedTextField Campo_Hora;
    private static javax.swing.JTextField Campo_PressaoDi;
    private static javax.swing.JTextField Campo_PressaoSi;
    private javax.swing.JTextArea Campo_Tabela;
    private javax.swing.JCheckBox CheckBox_Estresse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
