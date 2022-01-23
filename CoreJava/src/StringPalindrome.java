
public class StringPalindrome {
 
	static String reverse(String s) {
		char[] charArray = s.toCharArray();
		char ar2[] = new char[charArray.length];

		for (int i = ar2.length - 1, j = 0; i >= 0; i--) {
			ar2[j++] = charArray[i];
		}

		String rev1 = new String(ar2);
		return rev1;
	}
	
	public static void main(String[] args) {
		
		String var1="abcba";
		
		System.out.println(var1.equals(reverse(var1)));
		
		System.out.println("abcde".equals(reverse("abcde")));
		System.out.println("121".equals(reverse("121")));
		System.out.println("12134".equals(reverse("12134")));
		
		
	}
}
