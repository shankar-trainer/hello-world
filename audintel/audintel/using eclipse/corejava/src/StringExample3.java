
public class StringExample3 {

	
	public static void main(String[] args) {
		String s1="cat"; // string pool
		String s2="cat";  // string pool
                                            // s1 and s2 both refers the same object 		
		
		String s3=new String("cat"); // outside  string pool
			                               // s3 refers newly created object
		
		
		System.out.println(s1==s2);//== check references
		
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3)); // .equals checks the content
		
		System.out.println("hello"=="hello");
		System.out.println("hello"==new String("hello"));
		
		System.out.println("hello".equals(new String("hello")));
		
		
	}
}
