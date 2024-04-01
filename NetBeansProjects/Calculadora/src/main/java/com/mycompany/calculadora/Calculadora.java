/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Murilo
 */
public class Calculadora {

    JFrame frame;
    JTextField field;
    JButton[] numbers = new JButton[10]; // Array de botoes para ter os numeros de 0 a 9
    JButton[] functionButtons = new JButton[8]; // Array de Botoes para ter os botoes das outras funcoes da Calculadora (mais, menos, multiplicacao, sinal de Igual, etc...)
    JButton addButton, subButton, multButton, divButton;
    JButton deciButton, equButton, delButton, clrButton;

    JPanel panel;
    Font font = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operador;
    
    public static void main(String[] args) {
        
        Calculadora(){
            frame = new JFrame("Calculadora");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 640);
            frame.setLayout(null);

            frame.setVisible(true);
        }
    }
}
