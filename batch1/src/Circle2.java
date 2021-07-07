public class Circle2 extends Shape1{

	private float radius;

	public Circle2(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	void draw() {
System.out.println("draw the circle");		
	}

	@Override
	void area() {
		System.out.println("area of circle is "+(Math.PI*radius*radius));
	}
	
}
