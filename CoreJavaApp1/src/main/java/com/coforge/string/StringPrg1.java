package com.coforge.string;

public class StringPrg1 {

	public static void main(String[] args) {
		
		String var1="hello";// create object in string pool
		System.out.println(var1);
		
		var1.concat("world");
		System.out.println(var1);
		                               
		String var2="hello";    // var1 and var2 both refers same object
		
		System.out.println(var1==var2);// == checks references
		System.out.println(var1.equals(var2));//.equals checks the content
		
		
		String var3=new String("hello");//object outside string pool
		                               // var1,var3 refers different object
		
		System.out.println(var1==var3);
		System.out.println(var1.equals(var3));
		
		
		
		
	}
}
