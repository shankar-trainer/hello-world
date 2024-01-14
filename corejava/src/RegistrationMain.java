
public class RegistrationMain {

	public static void main(String[] args) {
		
		Registration registration[]=new Registration[2];
		
		registration[0]=new Registration(787887, "suman kumar", "delhi", false);
		registration[1]=new Registration(787889, "pankaj kumar", "noida", true);
		
		
		
		for (Registration registration2 : registration) {
			System.out.println("\nRegistration Information \n");
			System.out.println("\tid is "+registration2.getUserId());
			System.out.println("\tname  is "+registration2.getUserName());
			System.out.println("\tlocation  is "+registration2.getUserLocation());
			System.out.println("\tmarried  "+registration2.isUserMartialStatus());
		}
		
		
	}
}
