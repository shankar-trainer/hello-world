
public class CommandLineArgs {

	
	public static void main(String[] args) {
	
		System.out.println("first argument "+args[0]);
		System.out.println("second argument "+args[1]);
		//System.out.println("3rd argument "+args[2]);
		//System.out.println("4th  argument "+args[3]);
		
		System.out.println("\nAll Elements ");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("\nusing for each");
		for (String string : args) {
			System.out.println(string);
		}
	}
}
