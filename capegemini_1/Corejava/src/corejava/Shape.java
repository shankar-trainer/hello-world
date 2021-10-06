package corejava;

public class Shape {
	String color="black";
	int size=678;
public	void draw() {
		System.out.println("draw method ");
	}
//protected
 //private  
 void area() {
		System.out.println("area method ");
	}
 static void show(){
	 System.out.println("show method in shape class");
 }
 
}
class Rectangle extends Shape{
	void rectInfo(){
		System.out.println("Rectangle class");
		System.out.println("color is "+color);
		System.out.println("size is "+size);
	}
}
class Circle extends Shape{
	void circleInfo(){
		System.out.println("circle info");
	}
}

class ShapeMain{
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		Circle circle=new Circle();
		rectangle.rectInfo();
		rectangle.area();
		rectangle.draw();
		
		circle.circleInfo();
		circle.draw();
		circle.area();
		
		Circle.show();
		Rectangle.show();
		
		
		System.out.println(circle.color);
		System.out.println(circle.size);
		
		
	}
}