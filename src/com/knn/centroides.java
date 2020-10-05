package com.knn;

public class centroides {
    private int x,y, k;



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

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public centroides(int x, int y) {
        this.x = x;
        this.y = y;
        this.k=-1;

    }
    public centroides(){
        this.k =-1;
    }

    @Override
    public String toString() {
        return "centroides{" +
                "x=" + x +
                ", y=" + y +
                ", k=" + k +
                '}';
    }
}
