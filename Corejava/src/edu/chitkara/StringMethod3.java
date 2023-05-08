package edu.chitkara;

public class StringMethod3 {

	public static void main(String[] args) {
		String var1 = "we are learning java";
		System.out.println("after split array elements are  ");

		String[] split = var1.split(" ");
		for (String string : split)
			System.out.println(string);

System.out.println("after split array elements are  ");
		var1 = "we-all-are-indian";
		split = var1.split("-");
		for (String string : split) 
			System.out.println(string);
		

	}
}
