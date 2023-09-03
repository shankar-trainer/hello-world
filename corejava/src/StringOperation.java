
public class StringOperation {

	public static void main(String[] args) {
		
		String var="abcba";
		
		char[] charArray = var.toCharArray();
		char ar1[]=new char[charArray.length];
		
		String concat = var.concat("  hello");
		System.out.println(concat);
		System.out.println(var);
		
		System.out.println("palindrome check program");
		int index=0;
		
		for (int i = ar1.length-1; i>=0; i--) {
			ar1[i]=charArray[index++];
		}
		
		String s=new String(ar1);
		if(var.equals(s))
			System.out.println(var+" is palindrome");
		else
		System.out.println(var+" is not  palindrome");
		
		
	}
}
