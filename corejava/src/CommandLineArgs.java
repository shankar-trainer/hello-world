
public class CommandLineArgs {

	public static void main(String[] args) {
		
		System.out.println("id "+args[0]);
		System.out.println("name "+args[1]);
		
		for (String string : args) {
			System.out.println(string);
		}
	}
}
