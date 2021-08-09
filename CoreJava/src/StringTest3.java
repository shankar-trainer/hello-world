
public class StringTest3 {

	public static void main(String[] args) {
		char c[] = { 'w', 'e', 'l', 'c', 'o', 'm', 'e' };

		String ch = new String(c);
		System.out.println(ch);
		
		String var="we are learning java ";
		
		char[] charArray = var.toCharArray();
		
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.print(charArray[i]);
		}

		String p1="hello";// 1 reference variable 1 object
		
		p1=p1.concat(" world");// 1 reference  variable 2 object 
		
		System.out.println("\n"+p1);
	}
}
