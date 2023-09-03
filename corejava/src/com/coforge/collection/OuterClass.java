package com.coforge.collection;

public class OuterClass {

	int x=90;
	
	private class Inner{
		
		int y=10;
		
		public Inner(int y) {
			super();
			this.y = y;
		}

		void disp() {
			System.out.println("x is  "+x);
		}
	}
	
	public static void main(String[] args) {
		OuterClass class1=new OuterClass();
		
//		OuterClass.Inner inner=new OuterClass().new Inner();
		OuterClass.Inner inner=class1.new Inner(20);
		
		System.out.println(inner.y);
		inner.disp();
	}
	
}
