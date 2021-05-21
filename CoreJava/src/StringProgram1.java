
public class StringProgram1 {

	public static void main(String[] args) {
		
		String s1="abc";// immutable 
		
		String s2="abc";
		
		char ar1[]= {'a','b','c'};
		
		String s3= new String(ar1);
		
		System.out.println(s1);
		s1.concat("hello ");
		
		System.out.println(s1);
	
		
		
	}
}
