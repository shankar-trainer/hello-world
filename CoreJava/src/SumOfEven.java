import java.util.Scanner;

public class SumOfEven {

	static int sum() {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		int i = 1;
		// for (int i = 1; i <= 10;)
		while (i <= 10) {

			System.out.println(i + " Enter even no ");
			n = sc.nextInt();
			if (n % 2 != 0)
				continue;
			else {
				sum = sum + n;
				i++;
			}
		}
		return sum;
	}
}
