package corejava;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		String s="we-are-learning-java";
		
		Scanner sc=new Scanner(s);
		sc.useDelimiter("-");
		
		while(sc.hasNext())
		     System.out.println(sc.next());
		
	}
}
