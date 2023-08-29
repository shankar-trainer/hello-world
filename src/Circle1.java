
public class Circle1 extends Shape {
	float radius=9.0f;
	
	@Override
	void area() {
		System.out.println("area of circle with radius "+radius+" is "+(Math.PI*radius*radius));
	}

	public static void main(String[] args) {
		Circle1 circle1 = new Circle1();
		circle1.radius=4.5f;
		circle1.area();
	}
}
