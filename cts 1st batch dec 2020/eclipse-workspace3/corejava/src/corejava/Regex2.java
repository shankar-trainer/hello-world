package corejava;

public class Regex2 {

	public static void main(String[] args) {
		
		String id="1235";
		
		System.out.println(id.matches("[0-9]{4}"));
		System.out.println(id.matches("\\d{4}"));
		
		String name="Ram_kumar89";
		
		// alphanumberic a-z A-Z 0-9 _    \\w
		
		System.out.println(name.matches("[a-z-A-Z0-9_]+"));
		System.out.println(name.matches("\\w+"));
		
		System.out.println("ram kumar".matches("\\w+\\s\\w+"));
		
		
		String var="we are learning java";
		
		System.out.println(var.matches("^we.*"));// we in the start
		System.out.println(var.matches(".*java$"));// java in the last
		
		//01-11-2008
		
		//[\\d{1,2}-\\d{1,2}-\\d{1,4}]
		
		System.out.println("10-02-1999".matches("\\d{1,2}-\\d{1,2}-\\d{1,4}"));
	}
}
