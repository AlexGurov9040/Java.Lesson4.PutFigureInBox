package com.gurov.lesson4.task1;

public class Cylinder extends SolidOfRevolution{

    private double height;

    public Cylinder(double radius,double height){

        super(Math.PI * Math.pow(radius,2) * height,radius);
        this.height = height;
    }

}
