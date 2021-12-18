
public class Character_Wrapper {

	public static void main(String[] args) {
		
		Character x='a';
		
		System.out.println("alphabet "+Character.isAlphabetic(x));
		System.out.println("digit "+Character.isDigit(x));
		
		System.out.println("isletter or digit "+Character.isLetterOrDigit(x));
		
		x='%';
		if(!Character.isLetterOrDigit(x))
			System.out.println(x+" is special character");
	}
}
