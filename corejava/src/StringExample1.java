public class StringExample1 {

	public static void main(String[] args) {
	
		String s1="abc";
		String s2="abc";
		String s3="abc";
		
		// all s1, s2,s3 will refer the same object in string pool
		// == checks references 
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String s4=new String("abc"); 
		// create new object outside string pool 
		
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
	}
}
