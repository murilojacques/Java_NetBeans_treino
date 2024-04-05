/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_080;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Murilo
 */
public class Paddle extends Rectangle {

    int id;
    int yVelocity;
    int xVelocity;
    int speed = 10;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int Id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = Id;
    }

    public void keyPressed(KeyEvent e) {

        switch (id) {

            case 1:

                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed);
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed);
                }
                if (e.getKeyCode() == KeyEvent.VK_D) {
                    System.out.println(e.getKeyCode());
                    setXDirection(speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    setXDirection(-speed);
                    move();
                }
                break;

            case 2:

                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {

                    setYDirection(speed);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    System.out.println(e.getKeyCode());
                    setXDirection(speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    setXDirection(-speed);
                    move();
                }

                break;

        }

    }

    public void keyReleased(KeyEvent e) {

        switch (id) {

            case 1:

                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(0);
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0);
                }
                if (e.getKeyCode() == KeyEvent.VK_D) {
                    setXDirection(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    setXDirection(0);
                    move();
                }
                break;

            case 2:

                if (e.getKeyCode() == KeyEvent.VK_UP) {

                    setYDirection(0);

                }

                if (e.getKeyCode() == KeyEvent.VK_DOWN) {

                    setYDirection(0);

                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    setXDirection(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    setXDirection(0);
                    move();
                }

                break;

        }

    }

    public void setYDirection(int yDirection) {

        yVelocity = yDirection;

    }

    public void setXDirection(int xDirection) {
        xVelocity = xDirection;
    }

    public void move() {

        y = y + yVelocity;
        x = x + xVelocity;
    }

    public void draw(Graphics g) {

        if (id == 1) {
            g.setColor(Color.blue);
        } else {

            g.setColor(Color.red);
        }
        g.fillRect(x, y, width, height);

    }

}
