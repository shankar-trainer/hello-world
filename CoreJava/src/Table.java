import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number");
		int n = sc.nextInt();
		int count = 1;
		
		System.out.println("table of "+n);
		while (count <= 10) {
			System.out.println(n+" * "+count+" = "+(n * count));
			count++;
		}

		sc.close();

	}
}
