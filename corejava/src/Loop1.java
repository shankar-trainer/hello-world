public class Loop1 {

	public static void main(String[] args) {
		int c = 1;

		System.out.println("loop with counter ");
		while (c <= 10) {
			System.out.println(c);
			c = c + 1;
		}

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("loop without counter ");

		int sum = 0;
		System.out.println();
		String ch = "y";
		int p = 0;

		while (ch.equals("y")) {
			System.out.println("enter no");
			p = sc.nextInt();
			sum = sum + p;
			System.out.println("continue y\\n");
			ch = sc.next();
		}
		System.out.println("sum is " + sum);
		sc.close();
	}
}
