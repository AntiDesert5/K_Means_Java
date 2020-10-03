package com.knn;

import java.util.ArrayList;
import java.util.Random;

public class KNN {
    ArrayList<Float> instances = new ArrayList<Float>();
    //static double[][] instances = new double[10000][2]; //X y Y
    double datos = 10;//datos que se piden en el form
    int k=3;//valor de grupos
    int N, ncolores; //puntos
    private int XNeighbor,YNeighbor;
    private ArrayList<Coordenadas> clases = new ArrayList<>();

    public int getNcolores() {
        return ncolores;
    }

    public void setNcolores(int ncolores) {
        this.ncolores = ncolores;
    }

    public int getXNeighbor() {
        return XNeighbor;
    }

    public void setXNeighbor(int XNeighbor) {
        this.XNeighbor = XNeighbor;
    }

    public int getYNeighbor() {
        return YNeighbor;
    }

    public void setYNeighbor(int YNeighbor) {
        this.YNeighbor = YNeighbor;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public ArrayList<Coordenadas> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Coordenadas> clases) {
        this.clases = clases;
    }

    public void GenerarClusters(){
        Random r = new Random();
        int Xaux = 0;
        int Yaux = 0;
        //tamaño de panel x y y
        for(int i=0; i<getN();i++){
            Xaux = r.nextInt(680);
            Yaux = r.nextInt(545);
            clases.add( new Coordenadas( Xaux, Yaux, -1, distancia(Xaux,Yaux)));
            //System.out.println( clases.get(i));
        }
    }
    public float distancia(int x, int y){

        float d;
        return d =(float) Math.sqrt( Math.pow(getXNeighbor()-x,2)+ Math.pow(getYNeighbor()- y,2));


    }

}
