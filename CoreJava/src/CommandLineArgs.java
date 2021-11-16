
public class CommandLineArgs {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		System.out.println("all values ");
		
		
		for (String string : args) {
		  System.out.print(string+", ");	
		}
	}
}
