package edu.chitkara;

import java.util.StringTokenizer;

public class StringTokenizerPrg2 {

	public static void main(String[] args) {
		String var1="we-all-are-indian.we&are$learning&java";
		
		StringTokenizer tokenizer=new 
	//			StringTokenizer(var1,"-");
		StringTokenizer(var1,"-&$");
		
		while(tokenizer.hasMoreTokens())
			System.out.println(tokenizer.nextToken());

	}
}
