
public class Shape {
	void draw() {
		System.out.println("drawing");
	}
	
	void Erase() {
		System.out.println("erasing ");
	}
	private void show() {
		System.out.println("show method");
	}
	static void shapeInfo() {
		System.out.println("shape Info ");
	}
}


class Rectagle extends Shape{
	 public static void main(String[] args) {
		Rectagle rectagle=new Rectagle();
		System.out.println("Rectangle class");
		rectagle.draw();
		rectagle.Erase();
		shapeInfo();
		//rectagle.show();
	}
} 
class Circle extends Shape{
	
} 
class Square extends Shape{
	
} 
class ShapeMain {
	public static void main(String[] args) {
		Square square=new Square();
		System.out.println("square class");
		square.draw();
		square.Erase();
		
		Circle circle=new Circle();
		System.out.println("Circle class");
		circle.draw();
		circle.Erase();
		
	}
}
