package com.knn;

import java.util.ArrayList;
import java.util.Random;

public class KNN {
    ArrayList<Float> instances = new ArrayList<Float>();
    //static double[][] instances = new double[10000][2]; //X y Y
    int clusters = 10;//datos que se piden en el form
    int K, ncolores; //puntos
    private int XNeighbor,YNeighbor;
    private ArrayList<Coordenadas> clases = new ArrayList<>(); //un arreglo donde guardaremos toda la info de las cordenadas, puntos
    private  ArrayList<centroides> centroides= new ArrayList<>();
    public int getNcolores() {
        return ncolores;
    }

    public void setNcolores(int ncolores) {
        this.ncolores = ncolores;
    }

    public int getClusters() {
        return clusters;
    }

    public void setClusters(int clusters) {
        this.clusters = clusters;
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

    public int getK() {
        return K;
    }

    public void setK(int k) {
        K = k;
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
        for(int i = 0; i< getK(); i++){ //definimos tamaño de puntos, generamos cordenadas para cada punto.
            Xaux = r.nextInt(680);
            Yaux = r.nextInt(545);
            clases.add( new Coordenadas( Xaux, Yaux, -1, distancia(Xaux,Yaux)));
            //System.out.println("Clases Axel: "+ clases.get(i));

        }
        for(int i =0; i<getClusters();i++){
            int aux=r.nextInt(getK());
            //ojo debe de ser la misma semilla, vas a regarla si pones diferente xd
            centroides.add( new centroides(clases.get(aux).getX(),clases.get(aux).getY())); //mandamos los valores de x y y a un arreglo
            System.out.println("Centroides: "+centroides.get(i));
        }
    }
    //no se si lo necesite despues
    public float distancia(int x, int y){

        float d;
        return d =(float) Math.sqrt( Math.pow(getXNeighbor()-x,2)+ Math.pow(getYNeighbor()- y,2));


    }

}
