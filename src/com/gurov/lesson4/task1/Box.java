package com.gurov.lesson4.task1;

import java.util.ArrayDeque;

class Box extends Shape {

    private double available;
    private ArrayDeque<Shape> masShape = new ArrayDeque<>();

    public Box(double available){

        super(available);
        this.available = available;
    }

    public boolean add(Shape figure){

        if (figure.getVolume() <= available){
            masShape.add(figure);
            available -= figure.getVolume();
            return true;
        }
        else
            return false;
    }

    public void Display(){

        for (Shape value : masShape)
            System.out.printf("%.3f\n",value.getVolume());
    }
}
