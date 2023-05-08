package edu.chitkara;

public class StringJoin {

	public static void main(String[] args) {
		String ar1[]= {
				"java",
				"python",
				"angular",
				"react",
				"bootstrap"
		};
		String s1=""; 
s1=String.join(" and",ar1[0],ar1[1],ar1[2],ar1[3],ar1[4] );
	    
	    System.out.println(s1);
		
	}
}
