
public class CommandArgs {

	public static void main(String[] args) {
	
		System.out.println("First name is "+args[0]);
		System.out.println("Last name is "+args[1]);
		System.out.println("Salary   is "+args[2]);
		
		System.out.println();
		
		for (String string : args) {
			System.out.println(string);
		}
		
	}
}
