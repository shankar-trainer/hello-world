import java.util.Scanner;

public class AssociateMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Associate associate=new Associate();
		
		System.out.println("Enter the associate id:");
		associate.setAssociateId(scanner.nextInt());
		
		System.out.println("Enter the associate name:");
		scanner.nextLine();
		associate.setAssociateName(scanner.nextLine());
		
		System.out.println("Enter the number of days:");
		associate.trackAssociateStatus(scanner.nextInt());
		
		System.out.println("The associate "+associate.getAssociateName() +"      work status : "+associate.getWorkStatus());
			
		
		scanner.close();
		
	}
}
