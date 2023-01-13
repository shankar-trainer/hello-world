
public class StringExample2 {

	public static void main(String[] args) {
		String s = "we all are learning java";

		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		int count = 0;

		for (int x = 0; x < s.length(); x++) {
			if (s.charAt(x) == 'a' || s.charAt(x) == 'e' || s.charAt(x) == 'i' || s.charAt(x) == 'o'
					|| s.charAt(x) == 'u')
				count++;
		}

		System.out.println("no of vowels is " + count);

		System.out.println("reversing program ");

		char ar[] = s.toCharArray();
		char rev[] = new char[ar.length];
		count = 0;

		for (int i = rev.length - 1; i >= 0; i--) {
			rev[i] = ar[count++];
		}

		String rev1 = new String(rev);
		System.out.println(rev1);

	}
}
