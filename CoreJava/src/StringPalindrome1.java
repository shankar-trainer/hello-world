
public class StringPalindrome1 {

	public static void main(String[] args) {
		
		String var1="aba";
		char ar1[]=var1.toCharArray();
		char ar2[]=new char[ar1.length];
		int x=0;
		for (int i = ar1.length-1; i>=0; i--) {
			ar2[i]=ar1[x++];
		}
		
		String var2=new String(ar2);
		
		System.out.println("Palindrome "+var1.equals(var2));
	}
}
