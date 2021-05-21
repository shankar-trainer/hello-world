
public class StringProgram5 {

	public static void main(String[] args) {

		String var = "we are learning java. we are learning java8  ";

		System.out.println(var.length());

		int pos = var.indexOf("are");
		if (pos >= 0)
			System.out.println("found at " + pos);

		System.out.println(var.indexOf('l'));
		System.out.println(var.indexOf("we"));

		System.out.println(var.lastIndexOf("we"));

		String email = "ram@gmail.com";

		if (email.endsWith(".com") && (email.indexOf('@') >= 0))
			System.out.println("email is valid");

		String empId="cts1001";
		if(empId.startsWith("cts"))
			System.out.println("valid employee id  ");
		
		System.out.println(var.codePointAt(5)+"  ----  "+var.charAt(5));
		

	}
}
