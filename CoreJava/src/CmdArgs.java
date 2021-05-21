
public class CmdArgs {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);

		System.out.println("---------------------------");
		
		for (String string : args) {
			System.out.println(string);
		}
	}
}
