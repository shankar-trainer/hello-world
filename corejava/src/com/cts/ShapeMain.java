package com.cts;

public class ShapeMain {

	public static void main(String[] args) {
		Rectangle shape1 = new Rectangle();
		shape1.width = 12.3f;
		shape1.length = 22.2f;

		shape1.area();
		shape1.draw();

		Circle circle = new Circle();
		circle.radius = 5.43f;
		circle.area();
		circle.draw();
		
		//Shape shape=new Shape(;)

	}
}
