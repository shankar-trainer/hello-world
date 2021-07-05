import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int amt, time;
		float rate, i;
		do {
			System.out.println("Enter amount ");
			amt = sc.nextInt();
		} while (amt <= 0);

		do {
			System.out.println("Enter time ");
			time = sc.nextInt();
		} while (time <= 0);

		do {
			System.out.println("Enter rate  ");
			rate = sc.nextFloat();
		} while (rate <= 0);

		i=amt*rate*time/100;
		System.out.println("interest is "+i);
		
		sc.close();
	}

}
