
public class StringExample4 {

	public static void main(String[] args) {
		
		String mail="emp_ramkumar@gmail.com";
		
		if(mail.startsWith("emp") && mail.endsWith(".com") && mail.indexOf("@")>=4)
			System.out.println("valid mail id ");
		else if(!mail.startsWith("emp"))
			System.out.println("invalid mail id  not starts with emp");
		
		
		else if(!mail.endsWith(".com"))
			System.out.println("invalid mail id not ends with .com");
		
		else if(mail.indexOf("@")<=3) 
			System.out.println("invalid mail id not ends with @");
		
		
		
		
		
	}
}
