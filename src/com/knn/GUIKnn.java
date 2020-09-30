package com.knn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIKnn {
    private JButton correrButton;
    private JButton limpiarButton;
    private JTable table1;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JPanel panelmain;

    public GUIKnn() {
        correrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KNN knn = new KNN();
                knn.run();
            }
        });
    }

    public void vista(){
        JFrame frame = new JFrame("KNN");
        frame.setContentPane(new GUIKnn().panelmain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
