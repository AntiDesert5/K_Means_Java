package com.knn;

public class Coordenadas {
    private int x,y,c;
    private  float distance;

    public Coordenadas(int x, int y, int c, float distance) { //constructor
        this.x = x;
        this.y = y;
        this.c = c;
        this.distance = distance;
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

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Coordenadas{" +
                "x=" + x +
                ", y=" + y +
                ", c=" + c +
                ", distance=" + distance +
                '}';
    }
}
