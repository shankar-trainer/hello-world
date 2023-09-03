
public class StringPrg1 {

	public static void main(String[] args) {
		
		String s=" hello ";
		System.out.println(s);
		s.concat("world");
		
		System.out.println(s);

		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim().length());
		System.out.println(s.length());
		
		
		String trim = s.trim();
		System.out.println(trim.length());
		System.out.println(s.length());
		
	}
}
