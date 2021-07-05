
public class StringPoolDemo {

	public static void main(String[] args) {
		String s1="hello";  // s1  --- object 1  -- string pool
		String s2="hello";  // s1  --- object 1  -- string pool
		
		String s3=new String("hello");  // s3 -- heap  object 2
		// ==   checks reference 
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s2));
	  
	}
}
