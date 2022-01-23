public class Shape {//  super, parent, base class
//private	// private is not inherited 
String color="red";
	int size=100;
	void draw() {
		System.out.println("draw the shape");
	}

	void area() {
		System.out.println("area of shape");
	}
}

class Rectangle extends Shape {  // child class, derived class, extended class 
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		System.out.println("Rectangle ");
		rectangle.area();
		rectangle.draw();
		System.out.println("color is "+rectangle.color);
		System.out.println("size is "+rectangle.size);
	}
}

class Square extends Shape {

	public static void main(String[] args) {
		System.out.println("square shape  ");
		Square square=new Square();
		square.area();
		square.draw();
		System.out.println("color is "+square.color);
		System.out.println("size is "+square.size);
	
	}
}
//class Circle extends Square, Rectangle{// no multiple inheritance is allowed 
	
//}