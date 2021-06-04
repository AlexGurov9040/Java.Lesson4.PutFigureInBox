package com.gurov.lesson4.task1;

public class PutBox {

    public static void main(String[] args){

        PutBox app = new PutBox();
        app.Start();
    }

    public static void Start(){

        Cylinder cylinder = new Cylinder(2,3);
        Ball ball = new Ball(2.5);
        Pyramid pyramid = new Pyramid(4,2.2);
        Box box = new Box(50);
        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));
        System.out.println(box.add(pyramid));
        box.Display();
    }
}
