import java.util.Scanner;

public class SumOf10No {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n;
		int c=1;
		
		while(c<=10)
		{
			System.out.println("Enter no");
			n=sc.nextInt();
			sum=sum+n;
			c=c+1;
		}
		System.out.println("sum is "+sum);
	}
}
