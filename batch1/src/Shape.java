public class Shape {
 void draw() {
	System.out.println("draw  shape"); 
 }
 void area() {
	 System.out.println("area of shape");
 }
}

class Rectangle extends Shape{
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		System.out.println("Rectangle class");
		rectangle.draw();
		rectangle.area();
	}
}
class Square extends Shape{
	public static void main(String[] args) {
		Square square=new Square();
		System.out.println("Square class");
		square.draw();
		square.area();
	}
}
class Circle1 extends Shape{
	public static void main(String[] args) {
		Circle1 circle=new Circle1();
		System.out.println("Circle1 class");
		circle.draw();
		circle.area();
	}
	
}