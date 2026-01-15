package corejava;

public class MaxMin {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		int low = 0, high = 0, n, c = 1;

		do {
			System.out.println("enter number");
			n = sc.nextInt();

			if (c == 1)
				low = high = n;
			else if (n > high)
				high = n;

			else if (n < low)
				low = n;
			c++;
		} while (c <= 10);

		System.out.println("highest no is " + high);
		System.out.println("lowest no is " + low);
	}
}
