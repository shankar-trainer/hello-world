
public class StringExample2 {

	public static void main(String[] args) {
		
		String s1="hello";
		String s2="hello";
		String s3="hello";
		String s4="hello";
		
		// all s1,s2,s3, s4 will be created inside String Pool 
		// all s1,s2,s3, s4 will refers the same object 
		
		//==   checks references 
		// 4 reference variable but single object 
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s4);
		System.out.println(s2==s3);
		System.out.println(s2==s3);
		
		String s5=new String("hello"); // s5 creates new object outside string pool
		// 5 reference variable , 2 objects
		
		System.out.println(s1==s5);
		// .equals -- checks content not references
		
		System.out.println(s1.equals(s5));
				
		System.out.println("Enter name");
		String nm=new java.util.Scanner(System.in).next();
		
		System.out.println(nm=="ram");
		System.out.println(nm.equals("ram"));
		
	}
}
