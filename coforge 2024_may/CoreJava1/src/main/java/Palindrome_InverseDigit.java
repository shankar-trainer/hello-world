public class Palindrome_InverseDigit {

	static int inverse(int d) {
		int s = 0;

		while (d != 0) {
			s = s * 10 + d % 10;
			d = d / 10;
		}
		return s;
	}

	public static void main(String[] args) {

		int p = 12321;

		System.out.println(p + " reverse is " + inverse(p));
		System.out.println(p + " is palindrome " + (inverse(p) == p));

		p = 45678;
		
		System.out.println("=====================================\n");
		System.out.println(p + " reverse is " + inverse(p));
		System.out.println(p + " is palindrome " + (inverse(p) == p));
	}
}
