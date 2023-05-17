package edu.chitkara;

import java.util.StringTokenizer;

public class StringTokenizerPrg1 {

	public static void main(String[] args) {
		
		String var="we are learning java";
		   // is present since jdk1.0
		 // default delimiter white space \t \n \r \f 
		StringTokenizer stringTokenizer=new StringTokenizer(var);
		System.out.println("no of tokesn "+stringTokenizer.countTokens());
		
		while(stringTokenizer.hasMoreTokens())
			System.out.println(stringTokenizer.nextElement());
		
		//String split -- jdk1.4
		
		
		
	}
}
