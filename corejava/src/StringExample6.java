
public class StringExample6 {

	public static void main(String[] args) {

		// String email="coforge_10001_mohan@gmail.com";
		String email = "coforge_10001_mohangmail.com";

		if (!email.startsWith("coforge")) 
			System.out.println("invalid mail id \ndoes not starts with coforge");
		 else if (!email.endsWith(".com")) 
			System.out.println("invalid mail id \ndoes not ends with .com");
			else if(email.indexOf("@")<=0)
				System.out.println("invalid mail id \ndoes not have @ sign ");
					
		 else
			System.out.println("valid email");

	}
}
