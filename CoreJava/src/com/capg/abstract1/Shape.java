package com.capg.abstract1;

public abstract class Shape {
   
	abstract void draw();
	
	void shapeInfo() {
		System.out.println("shape information");
	}
}

class Rectangle extends Shape{

	@Override
	void draw() {
	  System.out.println("draw the rectangle");
	}
}
class Circle extends Shape{
	
	@Override
	void draw() {
		System.out.println("draw the Circle");
	}
}

class  Main{

	public static void main(String[] args) {
     Rectangle rectangle=new Rectangle();	
     Circle circle=new Circle();
     rectangle.draw();
     rectangle.shapeInfo();
     
     circle.draw();
     circle.shapeInfo();
	}
}