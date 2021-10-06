package collection;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		String ar[] = new String[x];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = scanner.next();
		}

		int y = scanner.nextInt();

	System.out.println(UserMainCode.countWord(ar, y));
		

	}
}
