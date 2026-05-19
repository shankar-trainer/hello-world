import java.util.Scanner;

public class HiLow {

	static void LoHi() {
		int n = 0, hi = 0, low = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i <= 15; i++) {

			System.out.println(" Enter no");
			n = scanner.nextInt();
			if (i == 0) {
				hi = n;
				low = n;
			} else if (n >= hi)
				hi = n;
			else if (n <= low)
				low = n;

			if (i == 9)
				break;
		}
		System.out.println("highest no is " + hi);
		System.out.println("lowest no is " + low);
		scanner.close();
	}

	public static void main(String[] args) {
		LoHi();
	}
}
