
public class CalulationMain {
   int x=10;
   static int y=20;

	 public static void main(String[] args) {
			
		 int a=10;
		 int b=20;
		 
		 System.out.println("sum of "+a+" and "+b +" is "+Calculation.addition(a,b));
		 System.out.println("subtraction  of "+a+" and "+b +" is "+Calculation.subtraction(a,b));
		 System.out.println("multiplication of "+a+" and "+b +" is "+Calculation.multiplication(a,b));
		 System.out.println("Country is "+Calculation.country);
		 
	//	 System.out.println(x);  // inside static method static members can be accessed directly using class name
		                          // inside static method non static/instance members can be accessed by the object 
		 System.out.println(y);
		 System.out.println(CalulationMain.y);
		 
		 CalulationMain c=new CalulationMain();
		 System.out.println(c.x);
	}

}
