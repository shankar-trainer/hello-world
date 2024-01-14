import java.util.Scanner;

public class AverageAge {

	static int calculateAverage(int[] age){
		int sum=0;
		for (int i : age) {
			sum=sum+i;
		}
		return sum/age.length;
		
	}

	public static void main(String[] args) {
		int age[];
		int n;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter total no.of employees:");
		n = scanner.nextInt();

		age = new int[n];

		if (n < 2) {
			System.out.println("Please enter a valid employee count");
			return;
		}

		System.out.println("Enter the age for 3 employees:");
		for (int i = 0; i < age.length; i++) {
         age[i]=scanner.nextInt();
		 if(age[i]<28 || age[i]>40)
		 {
			 System.out.println("Invalid age encountered!");
			 return;
		 }
		}

		System.out.println("The average age is "+calculateAverage(age));
	}
}
