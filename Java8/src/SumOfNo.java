import java.util.Scanner;

public class SumOfNo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String status="y";
		int y=0,sum=0;
		
		
		//while(status.equals("y")) 
		for(;status.equals("y");)
		{
			System.out.println("Enter no ");
			y=scanner.nextInt();
			sum=sum+y;
			System.out.println("take another no  y\\n");
			status=scanner.next();
		}
		System.out.println("sum is "+sum);
		
		scanner.close();
		
	}
}
