import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		int x, y, z;

		String name = sc.nextLine();
		System.out.println("Enter two number ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = x + y;
		System.out.println("sum is " + z);
		System.out.println("my name is "+name);

	}
}
