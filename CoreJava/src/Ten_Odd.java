import java.util.Scanner;

public class Ten_Odd {

	static int Odd_No_Sum() {
		int n, sum = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10;) {
			System.out.println((i + 1) + " : Enter odd no ");
			n = scanner.nextInt();
			if (n % 2 != 0) {
				i++;
				sum = sum + n;
			} else
				continue;
		}
		scanner.close();
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("sum is " + Odd_No_Sum());
	}
}
