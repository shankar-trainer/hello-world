
public class StringExample4 {

	public static void main(String[] args) {
		String s1="we are learning java";
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		
		
		for (int i = 0; i <s1.length(); i++) {
			System.out.print(s1.charAt(i)+",  ");
			if(i%4==0)
				System.out.println();
		}
		
		char ar[]=s1.toCharArray();
		System.out.println(" \n using for each ");
		for (char c : ar) {
			System.out.print(c+",  ");
		}
		
	}
}
