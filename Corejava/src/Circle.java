
public class Circle {

	  float radius;
	  
	  void area() {
       System.out.println("Area is "+(3.14F*radius*radius));		  
	  }
	  
	  void circumference() {
		System.out.println("Circumference is  "+(2*3.14F*radius));  
	  }
	  
	  public static void main(String[] args) {
	  java.util.Scanner sc=new java.util.Scanner(System.in);
	  
	  Circle circle=new Circle();
	  
	  System.out.println("Enter radius");
	  circle.radius=sc.nextFloat();
	  
	  circle.area();
	  circle.circumference();
	}
}
