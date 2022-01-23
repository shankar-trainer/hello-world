
public class StringOperation2 {

	public static void main(String[] args) {
		String s = "we all are indian";
		String[] split = s.split(" ");
	
		for (String string : split) {
			System.out.println(string);
		}
	
		System.out.println("-----------");
		String s2="we-are-learning-java";
	
		split = s2.split("-");
		
		for (String string : split) {
			System.out.println(string);
		}
	
		String name="";
		
		if(name.isEmpty())
			System.out.println("name is empty");
		else 
			System.out.println("name is "+name);
	

	}
}
