package com.knn;

import java.util.ArrayList;
import java.util.Random;

public class KNN {
    ArrayList<Float> instances = new ArrayList<Float>();
    //static double[][] instances = new double[10000][2]; //X y Y
    int clusters = 0;//datos que se piden en el form
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
        int xatrac=0;//var donde se generara atractor x
        int yatrac=0;//var donde se generara atractor y
        //tamaño de panel x y y
        for(int i =0; i<getClusters();i++){
            //nota hasta aqui no son centroides, son atractores
            xatrac = r.nextInt(680);
            yatrac = r.nextInt(545);
            //ojo debe de ser la misma semilla, vas a regarla si pones diferente xd
            //tambien pasamos la distancia para calcular la cercania con los centroide
            centroides.add( new centroides(xatrac,yatrac)); //mandamos los valores de x y y a un arreglo
            System.out.println("Centroides: "+centroides.get(i));
        }
        for(int i = 0; i< getK(); i++){ //definimos tamaño de puntos, generamos cordenadas para cada punto.
            Xaux = r.nextInt(680);
            Yaux = r.nextInt(545);

            clases.add( new Coordenadas( Xaux, Yaux, -1, distancia(Xaux,Yaux)));
            //System.out.println("Clases Axel: "+ clases.get(i));

        }

    }
    //no se si lo necesite despues
   /* public float distancia(int x, int y){

        float d=0;
        for(int i=0;i<getClusters();i++){
            d=(float) Math.sqrt( Math.pow(x-getXNeighbor(),2)+ Math.pow(y-getYNeighbor(),2));

        }
        return d ;


    }*/
    public float[] distancia(int x, int y){

        float d[]= new float[getClusters()];
        float aux=0;
        float aux2=10000;
        int cont=0;
        int var=0;
        for(int i=0;i<getClusters();i++){
            setXNeighbor(centroides.get(i).getX());
            setYNeighbor(centroides.get(i).getY());
            aux=(float) Math.sqrt( Math.pow(x-getXNeighbor(),2)+ Math.pow(y-getYNeighbor(),2));

            if(aux<aux2) { //si el primero es menor que el segundo
                //segundo a 0
                d[i] = aux;
                aux2=aux;
                cont++;

                if(cont==2){
                    cont=1;
                    d[var]=0;
                }
                var=i;
            }
          else{//si el priemro es mayor que el segundo
                //a sero el 1
            d[i]=0;
            }
        }

        return d ;


    }

}
