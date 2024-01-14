
public class StringExample7 {

	public static void main(String[] args) {
		
		String s1="hello";
		char s2[]="       i am fine  ".toCharArray();
		
		s1.getChars(0, 5, s2, 0);
		
		System.out.println(new String(s2));
		
		System.out.println("hello".equals("hello"));
		System.out.println("HelLo".equals("hello"));
		
		System.out.println("HelLo".equalsIgnoreCase("hello"));
		
		System.out.println("we are learning java".substring(5, 15));
		
		
	}
}
