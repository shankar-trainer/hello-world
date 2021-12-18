//super class
// it has more than one sub class
public class Shape {
      int id;
   private   String name;
	
	 public void draw() {
	  System.out.println("draw the shape");	 
	 }
	 
	 public void area() {
		 System.out.println("draw the area");	 
	 }
	 
}
//sub class -- only one super class
class Rectangle extends Shape{
	
}
//sub class  only one super class
class Circle extends Shape{
	
}

class ShapeMain{
	public static void main(String[] args) {
		//Rectangle is a Shape
		//Circle is a Shape
		
		Rectangle rectangle=new Rectangle();
		rectangle.id=87878;
		//rectangle.name="";
		
		Circle circle=new Circle();
		circle.id=778778;
	
		System.out.println("Rectangle id "+rectangle.id);
		rectangle.draw();
		rectangle.area();
		
		System.out.println("Circlele id "+rectangle.id);
		circle.draw();
		circle.area();
		
	}
}
