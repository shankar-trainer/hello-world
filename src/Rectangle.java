
public class Rectangle extends Shape {

	float width;
	float length;

	public Rectangle(float width, float length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	void area() {
		System.out.println("Area of length " + length + " and width " + width + " is " + (length * width));
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(20.5f, 30.4f);
		rectangle.area();
	}

}
