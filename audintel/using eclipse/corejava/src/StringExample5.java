
public class StringExample5 {

	public static void main(String[] args) {
		String var1="we are learning java";
		
		System.out.println(var1.substring(4));
		System.out.println(var1.substring(4,12));
		
		String var2="this is java training";
		
		char ch[]=var1.toCharArray();
		var2.getChars(4, 10,ch , 5);
		System.out.println(ch);
		
	}
}
