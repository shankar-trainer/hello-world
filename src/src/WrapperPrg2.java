
public class WrapperPrg2 {

	public static void main(String[] args) {
		String age = "33";

		int parseInt = Integer.parseInt(age);
		// parseXXX -- parse String and return primitive numeric

		// toString

		Long l1 = 76677676L;
		String s1 = l1.toString();

		Integer valueOf = Integer.valueOf("554");
		// parse String and return Wrapper class numeric
		System.out.println(valueOf);
		
		
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isAlphabetic('a'));
		System.out.println("letter or digit "+Character.isLetterOrDigit('1'));
		
		if(!Character.isLetterOrDigit('$'))
		 System.out.println("it is special character");
		else 
			System.out.println("it is letter or digit ");
			
	}
}
