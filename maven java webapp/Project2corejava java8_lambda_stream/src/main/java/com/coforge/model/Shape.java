package com.coforge.model;

public abstract class  Shape {
private  String color;

    public String getColor() {
        return color;
    }

    public Shape(String color) {
        this.color = color;
    }

    abstract void draw(); // abstract methods have no body
    abstract void area();

      // concrete methods -- with body
    void info(){
        System.out.println("shape abstract super class");
    }
}

class Rectangle extends  Shape{
   private float width;
   private float  length;

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public Rectangle(String color, float width, float length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    void draw() {
        System.out.println("Rectangle draws");
    }

    @Override
    void area() {
        System.out.println("area of rectangle is "+(width*length));
    }
}

