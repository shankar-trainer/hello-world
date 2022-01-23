
public class StringReverse2 {
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
		String s = "we all are indian";
		System.out.println(s);
		System.out.println(reverse(s));
		
		System.out.println("hello world");
		System.out.println(reverse("hello world"));
	}
}
