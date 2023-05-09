package edu.chitkara;

public class StringBufferProgram1 {

	public static void main(String[] args) {
		
		String var1="hello";
		var1.concat("world");
		System.out.println(var1);
		//StringBuffer var2="hello"; // error 
		
		StringBuffer var2=new StringBuffer("hello"); // error 
		
		System.out.println(var2);
		var2.append(" world ");
		System.out.println(var2);
		var2.insert(5,"india");
		System.out.println(var2);
      
		var2.delete(3, 8);
		System.out.println(var2);
		var2.reverse();
		System.out.println(var2);
		
		
	}
}
