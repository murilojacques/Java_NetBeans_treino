/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_048;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Murilo
 */
public class Frame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        

        loadItem.addActionListener(this);
        exitItem.addActionListener(this);
        saveItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f para abrir a aba File
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + e para abrir a aba Edit 
        helpMenu.setMnemonic(KeyEvent.VK_H); // alt + h para abrir a aba help
        loadItem.setMnemonic(KeyEvent.VK_L); // l para carregar
        saveItem.setMnemonic(KeyEvent.VK_S); // s para salvar
        exitItem.setMnemonic(KeyEvent.VK_E); // e para Sair
        
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
            
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("Carregando Arquivo");
        }
        else if(e.getSource() == saveItem){
            System.out.println("Salvando!");
        }
        else if(e.getSource() == exitItem){
            System.out.println("Saindo...");
            System.exit(0);
        }
    }
}
