public class Shape {
   String color;
   
  void area() {
	  System.out.println("Area method");
  }	
}
class Circle1 extends Shape{
  float radius;  	
}
class Rectangle extends Shape{
  float width;
  float length;
}