public class Shape {
	String shape = "Shape";

	void draw() {
		System.out.println("draw method");
	}

	void area() {
		System.out.println("area method");
	}
}
                    
class Rectangle extends Shape {
               // Rectangle is a shape   -- is a relationship
	void perimiter() {
		System.out.println("perimiter of rectangle ");
	}
}

class Square extends Shape {
	// Square is a shape
	void info() {
		System.out.println("square has same size of all sides");
	}
}