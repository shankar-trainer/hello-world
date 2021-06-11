import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no");
		int x=scanner.nextInt();

		if(x%2==0)
			System.out.println("even no");
		else
			System.out.println("odd no");
		
		String res=((x%2==0)?"even":"odd");
		System.out.println(res);
		
		
	}
}
