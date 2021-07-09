
public class Shape {

	 void draw(String s) {
		 System.out.println("draw the shape "+s);
	 }
}

class Rectangle extends Shape {
	
	@Override
//private  not  
//protected    ok
	
     public void draw(String s1) {
	  System.out.println("draw the rectangle "+s1);
	
	  super.draw("in super  class");
	}
	
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		rectangle.draw("in rectnagle class");
	}
}