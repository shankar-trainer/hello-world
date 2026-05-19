
public class StringTest1 {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s);
		s.concat(" world");

		System.out.println(s);
		s.replace('l', 'P');
		System.out.println(s);

		String p1 = s.concat(" world");

		System.out.println(p1);
		System.out.println(s.replace('l', 'P'));
		System.out.println(s);
		

		
	}
}
