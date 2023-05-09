package edu.chitkara;

public class StringMethodReplace {

	public static void main(String[] args) {
		// replace -- it replace character wise 
		String var1="we are learning java. java is oop based";
		String replace = var1.replace('e', 'z');
		System.out.println(replace);
		
		//replaceAll  - replace word wise
		System.out.println(var1.replaceAll("java","python"));
	}
	
}
