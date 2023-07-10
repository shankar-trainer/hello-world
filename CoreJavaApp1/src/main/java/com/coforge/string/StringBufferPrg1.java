package com.coforge.string;

public class StringBufferPrg1 {

	public static void main(String[] args) {
		String s="hello";
		
		//StringBuffer buffer="hello"; // wrong not accept string literal
		
		StringBuffer buffer=new StringBuffer(s);
		System.out.println(buffer);
		
		buffer.append(" world");
		System.out.println(buffer);
		
		buffer.delete(2, 4);
		System.out.println(buffer);
		buffer.insert(3, " greeting ");
		System.out.println(buffer);
		System.out.println(buffer.reverse());
		
		
		
		
	}
}
