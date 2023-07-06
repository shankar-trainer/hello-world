
public class Circle {

	public static void main(String[] args) {

		// double radius=456.6;
		float radius = 456.6F;

		float area = 3.14f * radius * radius;
		float circumference = 2 * 3.14f * radius;

		System.out.println("Circle Information ");
		System.out.println("\t Radius " + radius);
		System.out.println("\t Area " + area);
		System.out.println("\t Circumference " + circumference);

		System.out.println("Circle Information \n\t Radius " + radius + "\n\t Area " + area + "\n\t Circumference "
				+ circumference);

		System.out.printf("Circle Information \n\t Radius %f \n\t Area %f \n\t Circumference  %f", radius, area,
				circumference);

	}
}
