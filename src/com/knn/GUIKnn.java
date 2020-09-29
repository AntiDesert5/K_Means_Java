package com.knn;

import javax.swing.*;
import java.awt.*;

public class GUIKnn {
    private JButton button1;
    private JButton button4;
    private JTable table1;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JPanel panelmain;

    public void vista(){
        JFrame frame = new JFrame("KNN");
        frame.setContentPane(new GUIKnn().panelmain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
