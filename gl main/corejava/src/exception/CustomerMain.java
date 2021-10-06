package exception;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter id > 0");
			Customer customer=new Customer();
			customer.setId(scanner.nextInt());

			System.out.println("Enter name > 5 chars ");
			scanner.nextLine();
			customer.setName(scanner.nextLine());
			
			System.out.println("Enter salary >0 ");
			customer.setSalary(scanner.nextFloat());
			
		
			System.out.println("Customer Information");
			System.out.println("\tId is "+customer.getId());
			System.out.println("\tName is "+customer.getName());
			System.out.println("\tSalary is "+customer.getSalary());
			
		} catch (CustomerException e) {		
		System.out.println(e.getMessage());
		}	
		
	}
}
