class MyRectangle extends MyShape {
	private float width, length;

	public MyRectangle(float width, float length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	void draw() {
		System.out.println("draw the rectangle ");
	}

	@Override
	void area() {
		System.out.printf("area of rectangle is %.2f", (width * length));
	}

}

public class MyShapeMain {

	public static void main(String[] args) {
		// MyShape myShape=new MyShape();
		MyCircle circle = new MyCircle(67.5f);
		circle.area();
		circle.draw();

		MyRectangle myRectangle = new MyRectangle(12.3f, 45.6f);
		myRectangle.draw();
		myRectangle.area();
	}
}
