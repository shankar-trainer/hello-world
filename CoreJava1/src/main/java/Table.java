
public class Table {

	static void tableDisplay(int a) {
		int c=1;
		do {
			System.out.println(c+" * "+a+" = "+(c*a));
			c++;
		} while (c<=10);
		
	}
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter no ");
		int a=sc.nextInt();
		tableDisplay(a);
		sc.close();
	}
	
}
