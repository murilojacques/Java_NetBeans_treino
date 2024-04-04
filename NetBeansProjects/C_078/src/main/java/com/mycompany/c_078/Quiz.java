/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_078;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Murilo
 */
public class Quiz implements ActionListener {

    JFrame frame = new JFrame();

    String[] questions = {
        "Which Company created Java?",
        "Which year was Java Created?",
        "what was Java originally called?",
        "Who is credited with creating Java?"
    };

    String[][] options = {
        {"Sun MicroSystems", "StarBucks", "Microsoft", "Alphabet"},
        {"1989", "1996", "1972", "1492"},
        {"Apple", "Latte", "Oak", "Koffing"},
        {"Steve Jobs", "Bill Gates", "James Gosling", "Mark Zuckerberg"}
    };

    char[] answers = {
        'A',
        'B',
        'C',
        'C'
    };

    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_questions = questions.length;
    double result;
    int seconds = 10;

    JTextField textField = new JTextField();
    JTextArea textArea = new JTextArea();

    JButton buttonA = new JButton("A");
    JLabel answer_LabelA = new JLabel();
    JButton buttonB = new JButton("B");
    JLabel answer_LabelB = new JLabel();
    JButton buttonC = new JButton("C");
    JLabel answer_LabelC = new JLabel();
    JButton buttonD = new JButton("D");
    JLabel answer_LabelD = new JLabel();

    JLabel timeLabel = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();

    JTextField percentage = new JTextField();

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            seconds--;
            seconds_left.setText(String.valueOf(seconds));
            
            if (seconds <= 0) {
                displayAnswers();
            }

        }
    });

    Quiz() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));

        textField.setBounds(0, 0, 600, 50);
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 0));
        textField.setOpaque(true);
        textField.setFont(new Font("Ink Free", Font.BOLD, 30));
        textField.setBorder(BorderFactory.createBevelBorder(2));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);
        textField.setText("");

        textArea.setBounds(0, 51, 600, 50);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(25, 25, 25));
        textArea.setForeground(new Color(25, 255, 0));
        textArea.setOpaque(true);
        textArea.setFont(new Font("MV Boli", Font.BOLD, 25));
        textArea.setBorder(BorderFactory.createBevelBorder(2));
        textArea.setEditable(false);
        textArea.setText("");

        buttonA.setBounds(25, 150, 100, 100);
        buttonA.setFont(new Font("MV Boli", Font.PLAIN, 35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);

        buttonB.setBounds(25, 275, 100, 100);
        buttonB.setFont(new Font("MV Boli", Font.PLAIN, 35));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);

        buttonC.setBounds(25, 400, 100, 100);
        buttonC.setFont(new Font("MV Boli", Font.PLAIN, 35));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);

        buttonD.setBounds(25, 525, 100, 100);
        buttonD.setFont(new Font("MV Boli", Font.PLAIN, 35));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);

        answer_LabelA.setBounds(130, 150, 475, 100);
        answer_LabelA.setBackground(new Color(50, 50, 50));
        answer_LabelA.setForeground(new Color(25, 255, 0));
        answer_LabelA.setFont(new Font("MV Boli", Font.PLAIN, 30));

        answer_LabelB.setBounds(130, 275, 475, 100);
        answer_LabelB.setBackground(new Color(50, 50, 50));
        answer_LabelB.setForeground(new Color(25, 255, 0));
        answer_LabelB.setFont(new Font("MV Boli", Font.PLAIN, 30));

        answer_LabelC.setBounds(130, 400, 475, 100);
        answer_LabelC.setBackground(new Color(50, 50, 50));
        answer_LabelC.setForeground(new Color(25, 255, 0));
        answer_LabelC.setFont(new Font("MV Boli", Font.PLAIN, 30));

        answer_LabelD.setBounds(130, 525, 475, 100);
        answer_LabelD.setBackground(new Color(50, 50, 50));
        answer_LabelD.setForeground(new Color(25, 255, 0));
        answer_LabelD.setFont(new Font("MV Boli", Font.PLAIN, 30));

        seconds_left.setBounds(485, 660, 100, 100);
        seconds_left.setBackground(new Color(25, 25, 25));
        seconds_left.setForeground(new Color(255, 25, 25));
        seconds_left.setFont(new Font("Ink Free", Font.BOLD, 60));
        seconds_left.setBorder(BorderFactory.createBevelBorder(2));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        timeLabel.setBounds(460, 635, 140, 25);
        timeLabel.setBackground(new Color(50, 50, 50));
        timeLabel.setForeground(new Color(255, 25, 25));
        timeLabel.setFont(new Font("MV Boli", Font.PLAIN, 16));
        timeLabel.setOpaque(true);
        timeLabel.setText("Timer >:D");
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        
        number_right.setBounds(195, 260, 200, 100);
        number_right.setBackground(new Color(25, 25, 25));
        number_right.setForeground(new Color(25, 255, 0));
        number_right.setFont(new Font("Ink Free", Font.BOLD, 50));
        number_right.setBorder(BorderFactory.createBevelBorder(2));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);

        percentage.setBounds(195, 361, 200, 100);
        percentage.setBackground(new Color(25, 25, 25));
        percentage.setForeground(new Color(25, 255, 0));
        percentage.setFont(new Font("Ink Free", Font.BOLD, 50));
        percentage.setBorder(BorderFactory.createBevelBorder(2));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        
        //frame.add(number_right);
        //frame.add(percentage);
        frame.add(timeLabel);
        frame.add(seconds_left);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(answer_LabelA);
        frame.add(answer_LabelB);
        frame.add(answer_LabelC);
        frame.add(answer_LabelD);
        frame.add(textArea);
        frame.add(textField);
        frame.setVisible(true);

        nextQuestion();
    }

    public void nextQuestion() {

        if (index >= total_questions) {
            results();
        } else {
            textField.setText("Question " + (index + 1));
            textArea.setText(questions[index]);
            answer_LabelA.setText(options[index][0]);
            answer_LabelB.setText(options[index][1]);
            answer_LabelC.setText(options[index][2]);
            answer_LabelD.setText(options[index][3]);
            timer.start();
        }
    }

    public void displayAnswers() {
        timer.stop();
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (answers[index] != 'A') {
            answer_LabelA.setForeground(Color.red);
        }
        if (answers[index] != 'B') {
            answer_LabelB.setForeground(Color.red);
        }
        if (answers[index] != 'C') {
            answer_LabelC.setForeground(Color.red);
        }
        if (answers[index] != 'D') {
            answer_LabelD.setForeground(Color.red);
        }

        Timer pause = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer_LabelA.setForeground(new Color(25, 255, 0));
                answer_LabelB.setForeground(new Color(25, 255, 0));
                answer_LabelC.setForeground(new Color(25, 255, 0));
                answer_LabelD.setForeground(new Color(25, 255, 0));

                answer = ' ';
                seconds = 10;
                seconds_left.setText(String.valueOf(seconds));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);

                index += 1;

                nextQuestion();
            }
        });
        pause.setRepeats(false);
        pause.start();
    }

    public void results() {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        result = (correct_guesses/(double) total_questions) * 100;
        System.out.println(total_questions);
        System.out.println(correct_guesses);
        System.out.println(result);
        
        textField.setText("RESULTS!");
        textArea.setText("");
        answer_LabelA.setText("");
        answer_LabelB.setText("");
        answer_LabelC.setText("");
        answer_LabelD.setText("");

        number_right.setText("(" + String.valueOf(correct_guesses) + "/" + String.valueOf(total_questions) + ")");
        percentage.setText(String.valueOf(result) + " %");

        frame.add(percentage);
        frame.add(number_right);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (e.getSource() == buttonA) {
            answer = 'A';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        if (e.getSource() == buttonB) {
            answer = 'B';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        if (e.getSource() == buttonC) {
            answer = 'C';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        if (e.getSource() == buttonD) {
            answer = 'D';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }

        displayAnswers();
    }
}
