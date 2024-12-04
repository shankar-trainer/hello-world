
public class StringPalindrome {

	static boolean checkPalindrome(String s) {

		char ar[] = new char[s.length()];
		int index = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			ar[index++] = s.charAt(i);
		}

		return s.equals(new String(ar));
	}
	
	static boolean checkPalindrome1(String s) {
	  // use String toCharArray()
		
		char ar[] = new char[s.length()];
		int index = 0;
		char ar1[]=s.toCharArray();
		
		for (int i = s.length() - 1; i >= 0; i--) {
			ar[index++] = ar1[i];
		}
		return s.equals(new String(ar));
		
	}
	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1 + " is palindrome " + checkPalindrome(s1));
		s1 = "abcba";
		System.out.println(s1 + " is palindrome " + checkPalindrome(s1));
		System.out.println(s1 + " is palindrome " + checkPalindrome1(s1));
	}
}
