package com.cts;

public abstract class Shape {

	abstract  void draw();
	abstract  void area();
	
	void shapeInfo(String shapeName) {
		System.out.println("shape is "+shapeName);
	}  
}

class Rectangle extends Shape{
    float length, width;
    
	@Override
	void draw() {
		System.out.println("drawing the rectangle");
	}

	@Override
	void area() {
		System.out.println("area is "+(length* width));
	}
}
class Circle extends Shape{
	float radius;
	
	@Override
	void draw() {
		System.out.println("drawing the shape");
	}
	
	@Override
	void area() {
		System.out.println("area is "+(3.14*radius*radius));
	}
}