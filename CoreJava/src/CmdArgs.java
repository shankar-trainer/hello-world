
public class CmdArgs {

	public static void main(String[] args) {

		System.out.println("first " + args[0]);
		System.out.println("second  " + args[1]);
		System.out.println(" third " + args[2]);
		System.out.println("fourth  " + args[3]);

		System.out.println("for loop \n");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
		System.out.println("sum is " + sum);

	}
}
