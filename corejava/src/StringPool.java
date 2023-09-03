
public class StringPool {

	public static void main(String[] args) {
		String s1="hello"; // created in pool in heap
		String s2="hello";// created in pool in heap
		
		// s1, s2 refers the same object
		// 2 reference and one object 
		
		String s3=new String("hello"); // outside the pool in heap
		
		//s3 refers different object 
		
		// 3 reference and 2 object 
		// 2 reference in string pool
		// 1 reference s3 outside the pool
		
		System.out.println(s1==s2);// true
		System.out.println(s1==s3);// false 
		
		// == it checks the reference 
		
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		
		// .equals checks the content 
		
		
		
	}
}
