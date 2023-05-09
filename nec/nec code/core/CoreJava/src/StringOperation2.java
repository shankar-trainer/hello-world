
public class StringOperation2 {

	public static void main(String[] args) {
		
		String s1="java is popular language.java is used every where";
		
		char c[]= new char[30];
		char c1[]= new char[30];
		
		s1.getChars(6, 15, c, 0);
		
		System.out.println(c);
		
		
		s1.getChars(6, 15, c1, 10);
		
		System.out.println(c1);
		
		System.out.println(s1.replace('a', 'z'));
		
		System.out.println(s1.replaceAll("java", "python"));
		
		char ar[]= {'h','e','l','l','o'};
		
		String valueOf = String.valueOf(ar);
		
	}
}
