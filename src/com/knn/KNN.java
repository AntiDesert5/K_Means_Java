package com.knn;

import java.util.ArrayList;

public class KNN {
    ArrayList<Float> instances = new ArrayList<Float>();
    //static double[][] instances = new double[10000][2]; //X y Y
    double datos = 10;//datos que se piden en el form
    int k=3;//valor de grupos

    public void runKnn(){
        for (int i = 0; i <= 1; i++) { //for para generar datos aleatorios, se piden en el form
            for (int j = 0; j < datos; j++) {
                instances[j][i] = Math.random()*100 + 1; //de 1 a 99
            }
        }
    }

    public void run() {
        runKnn();
        for (int i = 0; i <= 1; i++) { //for para generar datos aleatorios, se piden en el form
            for (int j = 0; j < datos; j++) {
                System.out.println(instances[j][i] + " ");
            }
        }
    }

}
