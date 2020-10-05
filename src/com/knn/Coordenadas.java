package com.knn;

import java.util.Arrays;

public class Coordenadas {
    private int x,y,c;
    //private  float distance[];
    public Coordenadas(){
        this.c =-1;
    }
    public Coordenadas(int x, int y) { //constructor
        this.x = x;
        this.y = y;
        this.c = -1;
      //  this.distance = distance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    /*public float getDistance() {
        return distance ;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }*/

    @Override
    public String toString() {
        return "Coordenadas{" +
                "x=" + x +
                ", y=" + y +
                ", c=" + c +
                '}';
    }
}
