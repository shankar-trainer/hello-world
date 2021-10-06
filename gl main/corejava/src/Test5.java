
public class Test5 {

	public static void main(String[] args) {
		
		char c='%';
		
		System.out.println(Character.isAlphabetic(c));
		System.out.println(Character.isDigit(c));
		
		System.out.println(Character.isLetterOrDigit(c));
		
		if(!Character.isLetterOrDigit(c))
		  System.out.println("special char");
		
		
		int x=10;
	  Integer p=new Integer(x);
	  
	  
	}
}
