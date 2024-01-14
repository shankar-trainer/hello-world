package edu.coforge.java8;

interface Addition {
	void addition(int a, int b); 
	void addition(float a, float b); 
}
public class AdditionPrg {
	public static void main(String[] args) {
		//new AdditionPrg().addition1.addition(11, 22);
	
		 Addition addition1=new Addition() {
				@Override
				public void addition(float a, float b) {
					
					System.out.println("sum is "+(a+b));
				}
				@Override
				public void addition(int a, int b) {
					System.out.println("sum is "+(a+b));
				}
			};
			addition1.addition(11, 22);
			addition1.addition(11.22f, 22.45f);
	
	}
}
