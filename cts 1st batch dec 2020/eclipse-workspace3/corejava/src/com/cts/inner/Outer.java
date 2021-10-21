package com.cts.inner;

public class Outer {

	float dollar = 700;

	private class inner {
		float rs;
      //static String city;

		void disp() {
			rs = dollar * 70;
			System.out.println("dollar " + dollar + " is " + rs + " Rupees");
		}
	}

	public static void main(String[] args) {
   
		//inner in1=new inner();
   
		Outer outer=new Outer();
	
		Outer.inner in1=new Outer().new inner();
		in1.disp();
		
	
	}
}
