
public class StringDemo1 {

	public static void main(String[] args) {
		String s1="hello world";
		String s2="hello world";
		
		String s3=new String("hello world");
		
	
		if(s1==s2) {
			System.out.println("reference using s1 == s2");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1 equas s2");
		}
	
		
		if(s1==s3) {
			System.out.println("reference using s1 == s3");
		}
		
		if(s1.equals(s3)) {
			System.out.println("s1 equals s3");
		}
		
		System.out.println("hello"=="hello");
		System.out.println("hello"==new String("hello"));
		
	}
}
