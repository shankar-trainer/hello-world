package com.coforge.collection;

// functional interface have only one method

interface Hello {
	void show();
}
@FunctionalInterface
interface Addition{
	int sum(int a,int b);
}
public class AnnonyMous {

	public static void main(String[] args) {

		Hello hello = new Hello() {
			@Override
			public void show() {
				System.out.println("show method ");
			}
		};
		
		Hello hello2=()->System.out.println("show method.. ");
		hello.show();
		hello2.show();
		
		Addition addition=(p,q)-> p+q;
		
		System.out.println("sum is "+addition.sum(11, 22));

		
	}
}
