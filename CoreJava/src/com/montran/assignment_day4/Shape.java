package com.montran.assignment_day4;

interface Spatial {

}

public abstract class Shape {

	abstract double area();

	abstract double voulme();

}

class Sphere extends Shape implements Spatial {
	float radius;

	@Override
	double area() {
		return (float) (Math.PI * radius * radius);
	}

	@Override
	double voulme() {
		return 4 / 3 * Math.PI * radius * radius;
	}
}

class Cube extends Shape implements Spatial {
	@Override
	double area() {
		return 0;
	}

	@Override
	double voulme() {
		return 0;
	}
}

class Rectangle extends Shape {
	@Override
	double area() {
		return -1;
	}

	@Override
	double voulme() {
		return 0;
	}
}

class Triangle extends Shape {
	@Override
	double area() {
		return 0;
	}

	@Override
	double voulme() {
		return -1;
	}
}

class ShapeMain {

	public static void main(String[] args) {
		Shape shape[]= {null,null,null,null,null};
		 shape[0]=new Triangle();
		 shape[1]=new Sphere();
		 shape[2]=new Rectangle();
		 shape[3]=new Cube();
		 shape[4]=new Triangle();
	}
}