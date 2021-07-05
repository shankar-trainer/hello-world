
public class StringDemo1 {

	public static void main(String[] args) {
		
		String s="hello";
		  // 1 object
		System.out.println(s.length());
		
		s=s.concat(" world ");
		//2nd object 
		
		System.out.println(s.concat(" world "));
		
		System.out.println(s);
		System.out.println(s.toUpperCase());
		
		
		
	}
}
