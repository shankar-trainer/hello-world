
public class Circle {

	static float area(float r) {
		return 3.14f * r * r;
	}

	public static void main(String[] args) {

		double radius = 67.767676;

		float radius1 = 78.67F; // all decimal are by default double
		
		float ar=area(radius1);
		
		System.out.println("area of radius "+radius1+" is "+ar);
		
		System.out.printf("\narea of radius %f is %f ",radius1,ar);
		System.out.printf("\narea of radius %.2f is %.2f ",radius1,ar);

	}
}
