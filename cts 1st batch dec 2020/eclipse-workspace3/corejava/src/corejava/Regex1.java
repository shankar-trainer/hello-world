package corejava;

public class Regex1 {

	public static void main(String[] args) {
		
		String age="12";
		
		System.out.println(age.matches("[0-9]+"));
		
		
		System.out.println("ramkumar".matches("[a-z]+"));
		System.out.println("RamKumar".matches("[A-Za-z]+"));

		System.out.println("Ram Kumar".matches("[A-Za-z]+\\s[A-Za-z]+"));
		
		
		System.out.println("name of 10 chars "+"mohankumar".matches("[A-Za-z]{10}"));
		System.out.println("name of 5 to 10 chars "+"mohan".matches("[A-Za-z]{5,10}"));
		
		//hexdecimal code  # a-f 0-9{6}
		
		System.out.println("hex code ");
		
		System.out.println("#123abc".matches("#[abcdef0-9]{6}"));
		
		
		
		
		
	}
}
