public class StringPrg2 {

	public static void main(String[] args) {
		String s1 = "we are learning java";
		String res[] = s1.split(" ");

		System.out.println(res.length);
		for (String string : res) 
			System.out.print(string + "   ");
		
		s1 = "learning-java-is-now-easy";

		res = s1.split("-");
		System.out.println();
		for (String string : res) 
			System.out.print(string + "   ");
	    
		s1 = "we-are&learning-java";
		res = s1.split("-|&");
		System.out.println();
		for (String string : res) {
			System.out.print(string + "   ");
		}

	}
}
