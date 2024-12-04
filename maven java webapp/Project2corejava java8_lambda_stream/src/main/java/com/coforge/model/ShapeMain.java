package com.coforge.model;

public class ShapeMain {
    public static void main(String[] args) {

        //Shape shape=new Shape();// error
        // abstract class can not be instantiated

        Shape shape=new Rectangle("red",234.45f,45.6f);
        shape.area();
        shape.draw();
        shape.info();
    }
}
