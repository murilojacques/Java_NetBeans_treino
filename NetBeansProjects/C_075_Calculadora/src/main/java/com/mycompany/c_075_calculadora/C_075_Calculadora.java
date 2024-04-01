/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.c_075_calculadora;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Murilo
 */
public class C_075_Calculadora implements ActionListener {

    JFrame frame;
    JTextField field;
    JButton[] numberButtons = new JButton[10]; // Array de botoes para ter os numeros de 0 a 9
    JButton[] functionButtons = new JButton[9]; // Array de Botoes para ter os botoes das outras funcoes da Calculadora (mais, menos, multiplicacao, sinal de Igual, etc...)
    JButton addButton, subButton, multButton, divButton;
    JButton deciButton, equButton, delButton, clrButton, negButton;

    JPanel panel;
    Font font = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operador;
    
    C_075_Calculadora(){
            frame = new JFrame("Calculadora");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420, 550);
            frame.setLayout(null);
            
            field = new JTextField();
            field.setBounds(50, 25, 300, 50);
            field.setFont(font);
            field.setEditable(false);
            
            
//------------------------------------------Criando os Botoes----------------------------------------------------------------------             
            addButton = new JButton("+");
            subButton = new JButton("-");
            multButton = new JButton("X");
            divButton = new JButton("/");
            deciButton = new JButton(".");
            equButton = new JButton("=");
            delButton = new JButton("Delete");
            clrButton = new JButton("Clear");
            negButton = new JButton("(-)");
            
            functionButtons[0] = addButton;
            functionButtons[1] = subButton;
            functionButtons[2] = multButton;
            functionButtons[3] = divButton;
            functionButtons[4] = deciButton;
            functionButtons[5] = equButton;
            functionButtons[6] = delButton;
            functionButtons[7] = clrButton;
            functionButtons[8] = negButton;

           
            for(int i=0; i<9; i++){
                functionButtons[i].addActionListener(this);
                functionButtons[i].setFont(font);
                functionButtons[i].setFocusable(false);
            }
            
            for(int i=0; i<10; i++){
                numberButtons[i] = new JButton(String.valueOf(i));
                numberButtons[i].addActionListener(this);
                numberButtons[i].setFont(font);
                numberButtons[i].setFocusable(false);
            }
//------------------------------------------Criando os Botoes---------------------------------------------------------------------- 


            delButton.setBounds(150, 430, 100, 50);
            clrButton.setBounds(250, 430, 100, 50);
            negButton.setBounds(50, 430, 100, 50);
            
            panel = new JPanel();
            panel.setBounds(50, 100, 300, 300);
            panel.setLayout(new GridLayout(4, 4, 10, 10));
            panel.setBackground(Color.LIGHT_GRAY);
            panel.setOpaque(true);
            
//------------------------------------------Definindo a ordem dos botoes no GridLayout----------------------------------------------------------------------
            panel.add(numberButtons[1]);
            panel.add(numberButtons[2]);
            panel.add(numberButtons[3]);
            panel.add(addButton);
            panel.add(numberButtons[4]);
            panel.add(numberButtons[5]);
            panel.add(numberButtons[6]);
            panel.add(subButton);
            panel.add(numberButtons[7]);
            panel.add(numberButtons[8]);
            panel.add(numberButtons[9]);
            panel.add(multButton);
            panel.add(deciButton);
            panel.add(numberButtons[0]);
            panel.add(equButton);
            panel.add(divButton);
                    
//------------------------------------------Definindo a ordem dos botoes no GridLayout----------------------------------------------------------------------
            
            frame.add(panel);
            frame.add(negButton);
            frame.add(delButton);
            frame.add(clrButton);
            frame.add(field);
            frame.setVisible(true);
        }

    public static void main(String[] args) {

        C_075_Calculadora calc = new  C_075_Calculadora();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(int i=0; i<10; i++){
            if(e.getSource() == numberButtons[i]){
                field.setText(field.getText().concat(String.valueOf(i)));
            }
        }
        
        if(e.getSource() == deciButton){
            field.setText(field.getText().concat("."));
        }
 
        
//--------------------------------Definindo as acoes dos botoes de funcao(+, -, *, /, =, clear, delete)-------------------------------------
        if(e.getSource() == addButton){
            num1 = Double.parseDouble(field.getText());
            operador = '+';
            field.setText("");
        }
        if(e.getSource() == subButton){
            num1 = Double.parseDouble(field.getText());
            operador = '-';
            field.setText("");
        }
        if(e.getSource() == multButton){
            num1 = Double.parseDouble(field.getText());
            operador = '*';
            field.setText("");
        }
        if(e.getSource() == divButton){
            num1 = Double.parseDouble(field.getText());
            operador = '/';
            field.setText("");
        }
        if(e.getSource() == equButton){
            num2 = Double.parseDouble(field.getText());
            
            switch(operador){
                case'+':
                    result = num1+num2;
                    break;
                case'-':
                    result = num1-num2;
                    break;
                case'*':
                    result = num1*num2;
                    break;
                case'/':
                    result = num1/num2;
                    break;
            }
            field.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource() == clrButton){
            field.setText(""); 
        }
        if(e.getSource() == delButton){
            String string = field.getText();
            field.setText("");
            for(int i=0; i<string.length()-1; i++){
                field.setText(field.getText()+string.charAt(i));
            }
        }
        if(e.getSource() == negButton){
            double temp = Double.parseDouble(field.getText());
            temp *= -1;
            field.setText(String.valueOf(temp));
        }
//--------------------------------Definindo as acoes dos botoes de funcao(+, -, *, /, =, clear, delete)-------------------------------------
        

    }

}
    