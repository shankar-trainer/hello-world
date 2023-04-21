
public class ShapeMain {

	public static void main(String[] args) {

		Circle1 circle1 = new Circle1("red", 20.45f);
		Rectangle rectangle = new Rectangle("blue", 200.34f, 20.0f);

		System.out.println("Cicrle color is " + circle1.color);
		System.out.println("Cicrle radius is " + circle1.radius);

		System.out.println("===================");
		System.out.println("Rectangle color is " + rectangle.color);
		System.out.printf("\nRectangle length and width  are %f and %f ", rectangle.length, rectangle.width);

	}
}
