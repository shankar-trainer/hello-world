package edu.chitkara;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder builder=new StringBuilder("hello");
		builder.append(" world");
		System.out.println(builder);

		System.out.println(builder.reverse());
		
	}
}
