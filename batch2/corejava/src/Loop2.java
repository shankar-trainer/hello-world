import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a no ");
		int a=sc.nextInt();
		
		for (int i = 1; i <=10; i++) {
			System.out.println(i+" * "+a+" = "+(i*a));
		}
		
	}
}
