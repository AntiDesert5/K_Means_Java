package com.knn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUIKnn {
    private JButton correrButton;
    private JButton limpiarButton;
    private JTable table1;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JPanel panelmain;
    private JPanel jpanel1;
    KNN objectKNN = new KNN();
    public GUIKnn() {
        correrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KNN knn = new KNN();
                objectKNN.setN((int)spinner1.getValue());
                //set Clases
                objectKNN.setNcolores((int)spinner2.getValue());
                //Agregamos N pares ordenados con un array de objetos.
                knn.GenerarClusters();
                dibujarClases();
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

    private void dibujarClases(){
//        objectKNN.setXNeighbor(Integer.parseInt(jTextXK.getText()));
//        objectKNN.setYNeighbor(Integer.parseInt(jTextYK.getText()));
        objectKNN.setXNeighbor(4);
        objectKNN.setYNeighbor(20);
        ArrayList<Float> impresion = new ArrayList<>();
        int[] frecuencias = new int[objectKNN.getNcolores()];
        for (int i = 0; i < objectKNN.getNcolores(); i++){
            frecuencias[i] = 0;
        }

        java.awt.Graphics g = jpanel1.getGraphics();
        g.setColor(Color.BLACK);

        //Random rand = new Random();
        //int rango = 0;
        int separador = (int) Math.floorDiv(680,objectKNN.getNcolores());
        //System.out.println("INIT SEPARATOOOR: "+separador+" Clases: "+ objectKNN.getNcolores());
        int pasos = separador;
        int count = 0;
        // generacion de pares ordenados con ArrayList de objetos y pintar en grupos
        for(Coordenadas par:objectKNN.getClases()){
            //g.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
            //cambiarColor();
            //rango = rand.nextInt(objectKNN.getNcolores());
            //mientras que la coordenada x no sea menor ejecuta los pasos hasta llegar a su grupo
            while(!(par.getX() < separador)){
                separador += pasos;
                count+=1;
            }
            switch(count){
                case 0:
                    g.setColor(Color.GREEN);
                    frecuencias[0] +=1;
                    break;
                case 1:
                    g.setColor(Color.BLUE);
                    frecuencias[1] +=1;
                    break;
                case 2:
                    g.setColor(Color.YELLOW);
                    frecuencias[2] +=1;
                    break;
                case 3:
                    g.setColor(Color.MAGENTA);
                    frecuencias[3] +=1;
                    break;
                case 4:
                    g.setColor(Color.CYAN);
                    frecuencias[4] +=1;
                    break;
                case 5:
                    g.setColor(Color.GRAY);
                    frecuencias[5] +=1;
                    break;
                case 6:
                    g.setColor(Color.PINK);
                    frecuencias[6] +=1;
                    break;
            }
            par.setC(count);
            System.out.println(par.toString());
            count = 0;
            separador = pasos;
            g.fillOval(par.getX(), par.getY(), 5, 5);

        }
        //posX, Pos Y,tamX,tamY
        //g.fillOval(-2, 100, 4, 4);
        //g.fillOval(419, 100, 4, 4);
        g.setColor(Color.RED);
        g.fillOval(objectKNN.getXNeighbor(), objectKNN.getYNeighbor(), 5, 5);

        //objectKNN.imprimirTabla();

        System.out.print("Frecuencias: ");
        for (int i = 0; i < frecuencias.length; i++){
            System.out.print(" ,"+frecuencias[i]);
        }
        System.out.println("");


    }
}
