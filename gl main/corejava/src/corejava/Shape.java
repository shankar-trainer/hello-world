package corejava;

public abstract class Shape {
	String name;
	static String fname;

	abstract void draw();

	public Shape() {

	}

	void disp() {

	}
}

class Circle extends Shape {

	public Circle() {
		name = "circle";
	}

	@Override
	void draw() {
		System.out.println("drawing circle");
	}

}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("drawing rectangle ");
	}

	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();

		shape = new Rectangle();
		shape.draw();
		// Shape shape2=new Shape();
	}
}
