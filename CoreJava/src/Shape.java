
public class Shape {
	String s1="hello world";
	void draw() {
		System.out.println("draw the shape ");
	}

	void erase() {
		System.out.println("erase the shape ");
	}
}

class Rectangle extends Shape {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.erase();
		System.out.println(r1.s1);
	}
}

class Circle1 extends Shape {
	public static void main(String[] args) {

		Circle1 c1 = new Circle1();
		c1.draw();
		c1.erase();
		System.out.println(c1.s1);
	}
}
