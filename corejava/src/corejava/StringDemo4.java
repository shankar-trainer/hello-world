package corejava;

public class StringDemo4 {

	public static void main(String[] args) {

		String s = "we are learning java. we will learn devops also";

		int pos = s.indexOf("we");
		if (pos >= 0)
			System.err.println("found at " + pos);
		else
			System.out.println("not found");

		String mail="ramkumar@gmail.com";
		
		if(mail.endsWith(".com"))
			System.out.println("\nvalid mail");
		else
			System.out.println("\ninvalid mail");
		
		String eid="cts-anuj-343443";
		
		if(eid.startsWith("cts"))
			System.out.println("valid id");
		else
			System.out.println("invalid id ");
		
		
	}
}
