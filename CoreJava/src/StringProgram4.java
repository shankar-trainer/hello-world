
public class StringProgram4 {

	public static void main(String[] args) {
		
		
		if("hello"=="hello")
			System.out.println(" hi.. ");
		
		if("hello"==new String("hello"))
			System.out.println(" welcome  ");

		if("hello".equals(new String("hello")))
			System.out.println(" welcome .. ");
		
		if("hello".contentEquals(new String("hello")))
			System.out.println(" greeting .. ");
		
		
		
		
	}
}
