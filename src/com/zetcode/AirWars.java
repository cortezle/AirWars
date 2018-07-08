/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zetcode;

/**
 *
 * @author Lucho
 */
import java.awt.EventQueue;
import javax.swing.JFrame;

public class AirWars extends JFrame implements Commons {

    public AirWars() {

        initUI();
    }

    private void initUI() {

        add(new Board());
        setTitle("Space Invaders");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            AirWars ex = new AirWars();
            ex.setVisible(true);
        });
    }
}
