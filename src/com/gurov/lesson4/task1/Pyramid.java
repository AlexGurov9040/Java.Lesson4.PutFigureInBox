package com.gurov.lesson4.task1;

public class Pyramid extends Shape{

    private double h;
    private double s;

    public Pyramid(double h,double s){

        super(h * s * 4 / 3);
        this.h = h;
        this.s = s;
    }
}
