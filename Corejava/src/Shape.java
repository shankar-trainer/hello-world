public class Shape {
	String color;
	public Shape(String color) {
		super();
		this.color = color;
	}
	void area() {
		System.out.println("Area method");
	}
}

class Circle1 extends Shape {
	 public Circle1(String color, float radius) {
	   super(color);
	   this.radius=radius;
	 }
	float radius;
}
class Rectangle extends Shape {
	public Rectangle(String color, float width, float length) {
		super(color);
		this.width = width;
		this.length = length;
	}
	float width;
	float length;
}