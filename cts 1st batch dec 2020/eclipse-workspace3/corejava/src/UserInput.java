import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first no1");
		int n1 = sc.nextInt();

		System.out.println("Enter first no2");
		int n2 = sc.nextInt();

		System.out.println("addition is " + (n1 + n2));

		String s1 = sc.next();// single string, word

		sc.nextLine();// enter token from the previous

		String s2 = sc.nextLine(); // multi line

		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);

	}
}
