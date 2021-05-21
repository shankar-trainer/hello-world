import java.util.Scanner;
/**
 * 
 * @author admin
 * <br>This is factorial program
 * <br>Date   26/3//2021
 */

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int k = 1;
		int fact = 1;
		while (k <= p) {
			fact = k * fact;
			k++;
		}

		System.out.println(fact);

	}

}
