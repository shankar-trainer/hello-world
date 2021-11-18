public class Shape {
//private
//protected 
	public String s = "radius";

	void draw() {
		System.out.println("draw shape");
	}

	void Erase() {
		System.out.println("erase shape");
	}

	protected void area() {
		System.out.println("area of shape");
	}

	static void shapeInfo() {
		System.out.println("shape info method");
	}
}

class Circle1 extends Shape {
	float radius;

	@Override
//public	
	protected

			void area() {
		System.out.println("area of circle is " + (Math.PI * radius * radius));
	}

	public static void main(String[] args) {
		System.out.println("Circle class");
		Circle1 circle1 = new Circle1();
		circle1.radius = 56.78f;
		circle1.draw();
		circle1.Erase();
		circle1.area();
		System.out.println(circle1.s);
		Circle1.shapeInfo();
	}
}

class Rectangle extends Shape {
	float width, length;

	@Override
	public void area() {
		System.out.println("area of rectangle is " + (width * length));
		super.area();

	}

	public static void main(String[] args) {
		System.out.println("Rectangle class");
		Rectangle rectangle = new Rectangle();
		// Shape rectangle = new Rectangle();

		rectangle.width = 87.56f;
		rectangle.length = 870.56f;

		rectangle.draw();
		rectangle.Erase();
		rectangle.area();
		System.out.println(rectangle.s);
		Rectangle.shapeInfo();
	}
}
