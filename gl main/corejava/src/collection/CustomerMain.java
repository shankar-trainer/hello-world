package collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CustomerMain {

	public static void main(String[] args) {

		HashMap<Integer, Customer> cust_map = new HashMap<>();

		Customer customer[] = new Customer[3];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
			System.out.println("Enter customer id, name and location");
			customer[i].setCust_id(scanner.nextInt());
			scanner.nextLine();
			customer[i].setCust_name(scanner.nextLine());
			customer[i].setCust_location(scanner.next());

			cust_map.put(customer[i].getCust_id(), customer[i]);
		}

		Set<Integer> cust_id_set = cust_map.keySet();

		for (Integer integer : cust_id_set) {
			Customer customer2 = cust_map.get(integer);
			System.out.println(
					customer2.getCust_id() + "  " + customer2.getCust_name() + "  " + customer2.getCust_location());
		}

		
		Set<Entry<Integer, Customer>> cset = cust_map.entrySet();
		
		for (Entry<Integer, Customer> entry : cset) {
			Customer cs1=entry.getValue();
			System.out.println(entry.getKey()+"  "+cs1.getCust_name()+"  "+cs1.getCust_location());
			
		}
		
		scanner.close();

	}
}
