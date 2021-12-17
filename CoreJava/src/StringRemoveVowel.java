import java.util.Scanner;

public class StringRemoveVowel {

	public static void main(String[] args) {
		// String var1 = new Scanner(System.in).nextLine();
		String var1 = "we are learning";

		char ar1[] = var1.toCharArray();
		char ar2[] = new char[ar1.length];

		int j=0;
		for (int i = 0; i < ar1.length;i++) {
			if (ar1[i] != 'A' && ar1[i] != 'a' && ar1[i] != 'e' && ar1[i] != 'E' && ar1[i] != 'i' && ar1[i] != 'I'
				&& ar1[i] != 'O' && ar1[i] != 'o' && ar1[i] != 'u' && ar1[i] != 'U') {
				ar2[j++] = ar1[i];
			}
			else
				continue;
		}

		System.out.println(new String(ar2));
	}
}
