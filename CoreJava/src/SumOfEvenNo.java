import java.util.Scanner;

public class SumOfEvenNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int counter=1, n,sum=0;
		while(counter<=10) {
			System.out.println("Enter even no "+counter+" :  ");
			n=sc.nextInt();
			if(n%2!=0)
				continue;
			
				sum=sum+n;
				counter++;
		}
		System.out.println("sum of 10 even no is "+sum);
		sc.close();
	}
}
