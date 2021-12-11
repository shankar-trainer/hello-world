import java.util.Scanner;

public class SumOf10Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 1, n, sum = 0;
        int max=0,min=0;
        
		while (counter <= 10) {
			System.out.println("Enter number ");
			n = sc.nextInt();
			sum = sum + n;
			if(counter==1) 
				max=min=n;
			else if(n>=max) 
				max=n;
			else if(n<=min) 
				min=n;
			
			counter++;
		}
		System.out.println("Highest no is "+max);
		System.out.println("Lowest no is "+min);
		
		System.out.println("sum is " + sum);

		sc.close();
	}
}
