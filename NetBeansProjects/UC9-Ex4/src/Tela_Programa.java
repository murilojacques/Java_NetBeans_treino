
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

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

            
            Botao_Salva.setMnemonic(KeyEvent.VK_S);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Campo_Data = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        Campo_Hora = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        Campo_PressaoSi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Campo_PressaoDi = new javax.swing.JTextField();
        CheckBox_Estresse = new javax.swing.JCheckBox();
        Botao_Salva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Campo_Tabela = new javax.swing.JTextArea();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Pressão Sistólica:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("Data:");

        try {
            Campo_Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Campo_Data.setToolTipText("Digite a data do dia de hoje no padrão:  dd/mm/aaaa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Hora:");

        try {
            Campo_Hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Campo_Hora.setToolTipText("Digite a Hora da verificação no padrão:  hh:mm");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setText("Pressão Sistólica:");

        Campo_PressaoSi.setToolTipText("Digite o valor da Pressão Sistólica");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setText("Pressão Diastólica:");
        jLabel5.setToolTipText("Digite o valor da Pressão Diastólica");

        Campo_PressaoDi.setToolTipText("Digite o valor da pressão Diastólica");

        CheckBox_Estresse.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        CheckBox_Estresse.setText("Estresse");
        CheckBox_Estresse.setToolTipText("Você está sobre estresse no momento da medição das pressões Sistólica e Diastólica\n\n");

        Botao_Salva.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Botao_Salva.setText("Salvar");
        Botao_Salva.setToolTipText("Clique aqui pra salvar os valores informados");
        Botao_Salva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_SalvaActionPerformed(evt);
            }
        });

        Campo_Tabela.setColumns(20);
        Campo_Tabela.setRows(5);
        Campo_Tabela.setToolTipText("Tabela de valores já salvos no sistema");
        jScrollPane1.setViewportView(Campo_Tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Campo_Data, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(Campo_Hora))
                                    .addGap(49, 49, 49))
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Campo_PressaoSi, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(Campo_PressaoDi))
                        .addContainerGap(176, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(CheckBox_Estresse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botao_Salva, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Campo_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Campo_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Campo_PressaoSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Campo_PressaoDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBox_Estresse)
                    .addComponent(Botao_Salva))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
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

    private void Botao_SalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_SalvaActionPerformed
     try{    String path=("C:\\Users\\Murilo\\Documents\\NetBeansProjects\\UC9-Ex4\\src\\T.txt");
         File obj = new File(path);
        int i=0;
        int p=0;
        
        String data;
        String hora;
        int pressa_sistolica;
        int pressao_diastolica;
        String estresse="";

        if(CheckBox_Estresse.isSelected())
        {estresse="Em estresse";}
        else{estresse="sem estresse";}

        String valores= data=Campo_Data.getText() + ", "+ Campo_Hora.getText() + ", " + Integer.valueOf( Campo_PressaoSi.getText()) + ", " + String.valueOf(Campo_PressaoDi.getText()) + ", " + estresse + ";";
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
                  Campo_Tabela.append(dados[i] + "\n");
        }
         i=i+1;
         
          
        
         br.close();
  

        FileWriter Writer = new FileWriter(obj);
        BufferedWriter bw = new BufferedWriter(Writer);
        
        
        
            while(p != i){
                bw.write(dados[p] + "\n");
                System.out.println(dados[p]);
                p=p+1;
            }
        bw.close();
        
        }catch(IOException e){}
     }catch(NumberFormatException exc){JOptionPane.showMessageDialog(null,"Algum valor foi inserido incorretamente, verifique se todos os valores inseridos são numericos, por favor tente novamente");}
    
    }//GEN-LAST:event_Botao_SalvaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Salva;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
