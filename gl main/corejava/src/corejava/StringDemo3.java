package corejava;

public class StringDemo3 {
	public static void main(String[] args) {

		String var1 = " we are learning java ";

		System.out.println(var1.length());

		System.out.println(var1.toUpperCase());
		System.out.println(var1.trim().length());

		var1 = "";
		if (var1.isEmpty())
			System.out.println("its empty");

		String email = "ram@gmail.com";

		int pos = email.indexOf("@");
		if (pos >= 0)
			System.out.println("email is valid ");
		else
			System.out.println("invalid email ");
		
		System.out.println(email.charAt(3));
		
		if(email.endsWith(".com"))
			System.out.println("valid mail id ends with .com");
		
		String emp_id="emp_gl001";
		
		if(emp_id.startsWith("emp_gl"))
			System.out.println("right ");
		
		String city="chdnnai";
		String city1="cicnnai";
		
		System.out.println(city.compareTo(city1));
		
		
		String var4 = " we are learning java. java is most poular language ";
		
		String var5=var4.replace('e', 'h');
		System.out.println(var5);
		
		System.out.println(var4.replaceAll("java", "python"));
		
	}
}
