
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Murilo
 */
public class Tela_Inicial extends javax.swing.JFrame {
    static String obj = "C:\\Users\\Murilo\\Documents\\NetBeansProjects\\Arquivo\\src\\Texto.txt";
    static String obj2 = "C:\\Users\\Murilo\\Documents\\NetBeansProjects\\Arquivo\\src\\Texto2.txt";
    static int A=1;
    static String[] dados = new String[A];
    static String l="";
    
    
public static void gravar(String l){ 
        String valores=l + System.getProperty("line.separator");
        System.out.println(valores);
        
       int nLinhas=1000000;
       int con=999999;
            try {
                  FileWriter Writer = new FileWriter(obj);
                  BufferedWriter bw = new BufferedWriter(Writer);
                  int b =0;
                  /**while(nLinhas > con);{**/
                  /**for(int i=nLinhas; i > 0; i--){**/

                  bw.write(valores + TextField_Dados.getText());
                 /** bw.write(dados[A++]);**/
                  System.out.println("Sucesso ao gravar no arquivo.");
               /**}}**/
                  
                  bw.flush();
                  bw.close();
            }
              catch (IOException e) {
                  System.out.println("Ocorreu algum erro.");
              }}
   

        public static void Ler(){
            List<List<String>> data = new ArrayList<>();
        try {
                 
                  
                  FileReader fr = new FileReader(obj);
                  BufferedReader br = new BufferedReader(fr);

                  String line=""; 
                  for(int i=0; i<dados.length; i++){
                  while((line=br.readLine())!= null){
                  line=br.readLine();
                  dados[i]=line;
                  A++;
                  }
                  System.out.println(dados[i++]);
                  }
                 /** while ((line = br.readLine())!= null){ 
                  System.out.println(line);
                  List<String> lineData = Arrays.asList(line.split(";"));
                  data.add(lineData);
                  line = br.readLine();
                  System.out.println(line);
                  }
                  
                    for (List<String> list : data) {
                      for (String str : list) {
                          System.out.println(str);
                          TextField_Dados.setText(str + "; ");
                      }
                      System.out.println();
                  }**/
                  
                 
                  br.close();
              } catch (IOException e) {
                  System.out.print(e);
              }}
    
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Campo_Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Campo_Idade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextField_Dados = new javax.swing.JTextArea();
        Botao_Salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Idade:");

        TextField_Dados.setColumns(20);
        TextField_Dados.setRows(5);
        jScrollPane1.setViewportView(TextField_Dados);

        Botao_Salvar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Botao_Salvar.setText("Salvar");
        Botao_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_SalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Campo_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(Campo_Idade))
                .addGap(18, 18, 18)
                .addComponent(Botao_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Campo_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Campo_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Botao_Salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
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
        String nome="";
        int idade=0;

        nome=Campo_Nome.getText();
        idade= Integer.parseInt(Campo_Idade.getText());
        String valor=nome + ", " + idade + ";";
        
        if(TextField_Dados.getText().isEmpty()){
            Ler();
        }
        
        gravar(valor);
        
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
    private javax.swing.JButton Botao_Salvar;
    private static javax.swing.JTextField Campo_Idade;
    private static javax.swing.JTextField Campo_Nome;
    private static javax.swing.JTextArea TextField_Dados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
