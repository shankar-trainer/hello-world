
public class StringExample6 {

	public static void main(String[] args) {
		String s = "hello world to java";

		System.out.println(s.contains("to"));
		System.out.println(s.contains("world"));

		System.out.println(s.substring(4));
		System.out.println(s.substring(4, 8));

		String[] split = s.split(" ");
		
		System.out.println("using split");
		
		for (String string : split) 
			System.out.println(string);

		s = "we-are-learning-java";
		split = s.split("-");
		
		System.out.println("using split with delimiter -");
		for (String string : split) 
			System.out.print(string+" ,");

		s = "we-are&learning-java#i%am-learning#python";
		split = s.split("-|&|#|%");
		
		System.out.println("\nusing split with delimiter - and &");
		for (String string : split) 
			System.out.print(string+" ,");
		
		
		
	}
}
