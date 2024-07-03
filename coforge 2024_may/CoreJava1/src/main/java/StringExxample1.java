
public class StringExxample1 {

	public static void main(String[] args) {
		
		
		String s1=new String("hello "); // not recommended
		
		String s2="hello"; //    "" string object 
		
		System.out.println(s2);
		s2.concat("world");   // String is immutable(not modifiable)
		System.out.println(s2); 
		
		
		
	}
}
