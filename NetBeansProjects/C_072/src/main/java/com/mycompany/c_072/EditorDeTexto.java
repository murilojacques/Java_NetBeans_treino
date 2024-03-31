/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_072;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Murilo
 */
public class EditorDeTexto extends JFrame implements ActionListener {

    JTextArea areatexto;
    JScrollPane scrollPane;
    JSpinner spinnerTamanhoTexto;
    JLabel fontLabel;
    JButton btnCorFonte;
    JComboBox fontBox;

    JMenuBar barraMenu;
    JMenu fileMenu;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    

    EditorDeTexto() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setTitle("Editor de texto Simples");
        this.setLayout(new FlowLayout());

        areatexto = new JTextArea();
        areatexto.setPreferredSize(new Dimension(550, 550));
        areatexto.setLineWrap(true);//para impedir de tu segurar uma letra e ela continuar para fora da tela inves de quebrar p linha de baixo
        areatexto.setWrapStyleWord(true);//para impedir de tu segurar uma letra e ela continuar para fora da tela inves de quebrar p linha de baixo
        areatexto.setFont(new Font("Arial", Font.PLAIN, 20));

        scrollPane = new JScrollPane(areatexto);
        scrollPane.setPreferredSize(new Dimension(550, 550));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        fontLabel = new JLabel("Fonte");

        spinnerTamanhoTexto = new JSpinner();
        spinnerTamanhoTexto.setPreferredSize(new Dimension(50, 25));
        spinnerTamanhoTexto.setValue(20);
        spinnerTamanhoTexto.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                areatexto.setFont(new Font(areatexto.getFont().getFamily(), Font.PLAIN, (int) spinnerTamanhoTexto.getValue()));
            }

        });

        btnCorFonte = new JButton("Cor");
        btnCorFonte.addActionListener(this);

        String[] fontes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        fontBox = new JComboBox(fontes);
        fontBox.addActionListener(this);
        fontBox.setSelectedItem("Arial");

        //-------MenuBar----------------------------------------------------------------------------------------------------------------
        barraMenu = new JMenuBar();
        fileMenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        barraMenu.add(fileMenu);

        //-------MenuBar----------------------------------------------------------------------------------------------------------------
        
        this.setJMenuBar(barraMenu);
        this.add(fontLabel);
        this.add(spinnerTamanhoTexto);
        this.add(btnCorFonte);
        this.add(fontBox);
        this.add(scrollPane);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btnCorFonte) {
            JColorChooser colorC = new JColorChooser();

            Color cor = JColorChooser.showDialog(null, "Escolher Cor", Color.BLACK);

            areatexto.setForeground(cor);
        }
        

        if (e.getSource() == fontBox) {
            areatexto.setFont(new Font((String) fontBox.getSelectedItem(), Font.PLAIN, areatexto.getFont().getSize()));
        }

        
        if (e.getSource() == openItem) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de texto", "txt");
            fileChooser.setFileFilter(filter);

            int resposta = fileChooser.showOpenDialog(null);
            
            if (resposta == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                Scanner fileIn = null;
                
                try {
                    fileIn = new Scanner(file);
                    if(file.isFile()){
                        while(fileIn.hasNextLine()){
                            String line = fileIn.nextLine()+"\n";
                            areatexto.append(line);
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(EditorDeTexto.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    fileIn.close();
                }
            }
        }

        
        if (e.getSource() == saveItem) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));

            int resposta = fileChooser.showSaveDialog(null);

            if (resposta == JFileChooser.APPROVE_OPTION) {
                File file;
                PrintWriter fileOut = null;

                file = new File(fileChooser.getSelectedFile().getAbsolutePath());

                try {
                    fileOut = new PrintWriter(file);
                    fileOut.println(areatexto.getText());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(EditorDeTexto.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    fileOut.close();
                }

            }
        }
        

        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
