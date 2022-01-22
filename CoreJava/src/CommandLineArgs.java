//java CommandLineArgs 1000 hello delhi
public class CommandLineArgs {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

		System.out.println("all arguments ");
		for (String string : args) {
			System.out.println(string);
		}
	}
}
