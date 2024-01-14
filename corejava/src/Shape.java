  // super, parent, base class
public class Shape {

	String name="shape";
	void area() {
		System.out.println("shape area");
	}
}
// child class
class Rectangle extends Shape{
		
	public static void main(String[] args) {
	
		Rectangle rectangle=new Rectangle();
		System.out.println(rectangle.name);
		rectangle.area();
	}
}


