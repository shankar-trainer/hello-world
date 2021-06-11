import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {

		for (int i = 1, j = 5; i <= 10; i++, j = j + 5) {
			System.out.println(i + "  " + j);
		}

		System.out.println("enter no for factorial");

		int fact = new Scanner(System.in).nextInt();
        int f=1;
		for(int x=1;x<=fact;x++)
			f=f*x;
		
		System.out.println("factorial  is "+f);
	}
}
