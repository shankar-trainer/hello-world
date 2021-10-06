package org.com.edu;

public class Outer2 {

	public static void main(String[] args) {
		int x=1000;
		
		class Inner{
			int y=2000;
			void disp(){
				System.out.println("Inner y is "+y);
				System.out.println("Outer x is "+x);				
			}
		}
		Inner inner=new Inner();
		
		inner.disp();
	}
}
