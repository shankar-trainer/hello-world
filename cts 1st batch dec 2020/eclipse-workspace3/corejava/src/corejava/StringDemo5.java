package corejava;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String var="we are learning java";
		String[] split = var.split(" ");
		
		System.out.println("splitted words");
		
		
		for (int i = 0; i < split.length; i++) {
			
			System.out.println(split[i]);
		}
		
		
		System.out.println("for each");
		
		for (String string : split) {
			System.out.print(string+" ,  ");
		}
		
		var="we-are-learning-java";
		
		System.out.println();
		split = var.split("-");
		
		for (String string : split) {
			System.out.print(string+" ,  ");
		}

		var="we-are_learning-java";
		
		split = var.split("-_");
		
		
	}
}
