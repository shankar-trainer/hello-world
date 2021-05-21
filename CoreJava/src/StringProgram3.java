
public class StringProgram3 {

	public static void main(String[] args) {
		
		String s1="abc";// immutable // refers obj1
		String s2="abc";// refers obj1
		
		String s3=s2;   // refers  obj1 
		
		String s4="hello";  // refers obj2 
		
		//s1 , s2, s3, s4  object in string pool
	
		String s5=new String("abc");// obj3 new String()  -- create object in heap 
		String s6=new String("abc");// obj 4
		
		// ==  checks the reference 
		// .equals -- checks the content 
		
		if(s1==s2) {
			System.out.println("s1==s2");
		}
		if(s1.equals(s2)) {
			System.out.println("s1 equals (s2)");
		}
		
		if(s1==s6)
			System.out.println(" not work ");

		
		if(s1.equals(s6))
			System.out.println("  s1 equals s6 ");
		
		
		
	}
}
