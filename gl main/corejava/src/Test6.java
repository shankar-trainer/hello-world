
public class Test6 {

	public static void main(String[] args) {
		
	/*	String s="hello";
		
		char c3[]=s.toCharArray();
		char f=s.charAt(2);
		f++;
		c3[2]=f;
		
		System.out.println(c3);*/
		
		/*System.out.println("he4llo".matches(".*\\d{1,}.*"));
		
		System.out.println("he4llo".matches(".*[0-9]{1,}.*"));
		System.out.println("he@4llo".matches(".*[$@#]{1,}.*"));
		System.out.println("he@lo".matches("^[a-z]+[A-Z]+[0-9]+[$@#]+{6,20}$"));*/
		
		System.out.println("helloworld".matches("\\w{4,15}"));
		System.out.println("helloworld".matches("[a-z]{4,15}"));
		
		//[a-z][A-Z]  \\w   
		//  [0-9] \\d
		
		System.out.println("hello world".matches("[a-z]{1,10}\\s[a-z]{1,10}"));
		System.out.println("HELLO world".matches("\\w{1,10}\\s\\w{1,10}"));
		
		System.out.println("HELLO world".replaceAll("\\s", "-"));
			
	}
}
