
public class StringPalindrome {

	public static void main(String[] args) {
		String var="abc";
		String var2="";
		int l=var.length();
		
		for (int i = l-1; i >=0; i--) {
			var2=var2+var.charAt(i);
		}
		
		if(var.equals(var2))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
			
	}
}
