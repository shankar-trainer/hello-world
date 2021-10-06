package util;

import java.util.StringTokenizer;

public class Ex3 {

	public static void main(String[] args) {
		String var="we%are$learning%java";
		
	//	var.split();
		
		StringTokenizer tokenizer=new StringTokenizer(var,"%|$");
			
		while(tokenizer.hasMoreTokens())
			System.out.println(tokenizer.nextElement());
		
	System.out.println(tokenizer.countTokens());
	
	}
}
