
public class Calculation {
	  // static or class variable 

	static String country="india";
	
	  // static or class method 
	 static int addition(int a, int b) {
		 return a+b;
	 }
	 static int subtraction(int a, int b) {
		 return a-b;
	 }
	 static int multiplication(int a, int b) {
		 return a*b;
	 }
	 
	 public static void main(String[] args) {
		
		 int a=10;
		 int b=20;
		 
		 System.out.println("sum of "+a+" and "+b +" is "+addition(a,b));
		 System.out.println("subtraction  of "+a+" and "+b +" is "+subtraction(a,b));
		 System.out.println("multiplication of "+a+" and "+b +" is "+multiplication(a,b));
		 System.out.println("multiplication of "+a+" and "+b +" is "+Calculation.multiplication(a,b));
		 System.out.println("country is "+country);
		 System.out.println("country is "+Calculation.country);
		 
		 System.out.println(Math.PI);
		 System.out.println(Math.sin(Math.PI/2));
		 System.out.println(Math.E);
		 
	}
}
