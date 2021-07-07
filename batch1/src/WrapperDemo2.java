

public class WrapperDemo2 {

	public static void main(String[] args) {
		int p=10;
		
		System.out.println(Integer.toString(p));
		System.out.println("hex string "+Integer.toHexString(p));
		System.out.println("binary string "+Integer.toBinaryString(p));
		System.out.println(Integer.toOctalString(p));
		
		
		System.out.println("hex string "+Integer.toString(p,16));
		System.out.println("binary  string "+Integer.toString(p,2));
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		char ch='a';
		
		System.out.println(Character.isAlphabetic(ch));
		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isLetterOrDigit(ch));

		ch='$';
		
		System.out.println(!Character.isLetterOrDigit(ch));
		
		if(!Character.isLetterOrDigit(ch))
			System.out.println(ch+" is special char");
	}
}
