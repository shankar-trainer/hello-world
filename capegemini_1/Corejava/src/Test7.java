import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		float amount;
		int time;
		float rate;
		String name;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter  name");
		name = scanner.nextLine();

		System.out.println("Enter  amount");
		amount = scanner.nextFloat();

		System.out.println("Enter  time");
		time = scanner.nextInt();

		System.out.println("Enter rate ");
		rate = scanner.nextFloat();
		float interest = amount * rate * time / 100;
		System.out.println("interest amount is " + interest);
		
		Math.cbrt(a);

	}
}
