
public class StringProgram7 {

	public static void main(String[] args) {

		
		String var1="we are learning  java";
		String var2="we-are-learning-java";
		
		String ar1[]= var1.split(" ");
		for (String string : ar1) {
			System.out.print(string+",");
		}
		
		System.out.println();
		 ar1= var2.split("-");
		for (String string : ar1) {
			System.out.print(string+",");
		}
		
		
		String s11="hello";
		s11.concat("world");
		System.out.println(s11);

		//StringBuffer buffer="hello";
		StringBuffer buffer=new StringBuffer("hello");

		buffer.append(" world");
		
		System.out.println(buffer);
		
		buffer.insert(7," to ");
		System.out.println(buffer);
		
		buffer.reverse();
		
		System.out.println(buffer);
		
		buffer.delete(5, 8);
		System.out.println(buffer);
		
	}
}
