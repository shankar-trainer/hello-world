
public class WrapperDemo5 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.min(11, 3));
		char s ='1';
		 if(Character.isDigit(s))
			 System.out.println(s+" is digit");
		s='a';
		 if(Character.isAlphabetic(s))
			 System.out.println(s+" is alphabet");
        s='$';
        if(Character.isLetterOrDigit(s))
			 System.out.println(s+" is alphabet or digit");
        else 
        	System.out.println(s+" is a special character");
		        
		
		
	}
}
