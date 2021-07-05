
public class WrapperEx3 {

	public static void main(String[] args) {
		
		char c='A';
		System.out.println(Character.toUpperCase(c));
		
		String ar1= "hello";
		
		for (char c1 : ar1.toCharArray()) {
			System.out.println(Character.toUpperCase(c1));
		}
		
		System.out.println(Character.isLetter(c));
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isLetterOrDigit(c));
		
		c='%';
		if(!Character.isLetterOrDigit(c))
			System.out.println(c+" is special symbol");
		
	}
}
