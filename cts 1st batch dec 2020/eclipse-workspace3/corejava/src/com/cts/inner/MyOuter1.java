package com.cts.inner;

interface Phone{
	void call(); 
}


class Hello implements Phone{
	@Override
	public void call() {
	}
}


public class MyOuter1  {

	Phone phone=new Phone() {
		
		@Override
		public void call() {
			System.out.println("call by phone");
		}
	};
	
	public static void main(String[] args) {
		new MyOuter1().phone.call();
		
	}
}
