package edu.chitkara;

public class StringProgram1 {

	public static void main(String[] args) {
		
		String var1="hello"; // same refernces
		String var2="hello"; 
		String var3=new String("hello"); // new Object 
		
		if(var1==var2)
			 System.out.println(" var1== var2");
		
		if(var1==var3)
			System.out.println(" var1== var3");  // == works with references

		if(var1.equals(var3))
			System.out.println(" var1 equals  var3");  // == works with references
		
		
		
	}
}
