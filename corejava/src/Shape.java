
public class Shape {

	void draw(String s) {
		System.out.println("draw the shape");
	}

	protected void area() {
		System.out.println("area of the shape");
	}
}

class Rectangle extends Shape {
	int width, length;

	@Override
	void draw(String s) {
		System.out.println("drawing the rectangle");
	}

	@Override
//protected
	public void area() {
		System.out.println("Rectangle area " + (width * length));
	}

	public static void main(String[] args) {

		Rectangle react = new Rectangle();
		react.length = 20;
		react.width = 30;

		react.area();
		react.draw();

	}

}