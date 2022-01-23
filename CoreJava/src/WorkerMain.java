
public class WorkerMain {

	public static void main(String[] args) {

		Address address = new Address();
		Worker worker = new Worker();

		address.setAddressId(1);
		address.setAddressCity("noida"); 
		address.setAddressStreet("sector 1");
		address.setAddressState("UP");

		worker.setId(10001);
		worker.setName("sri kanth muthya");
		worker.setWages(700);
		
		worker.setAddr(address);

		System.out.println("Worker data ");
		System.out.println("id "+worker.getId());
		System.out.println("name "+worker.getName());
		System.out.println("wages "+worker.getWages());
		
		System.out.println("\nAddress\n");
		
		Address addr=worker.getAddr();
		
		System.out.println("\t address  id  "+addr.getAddressId());
		System.out.println("\t address  street  "+addr.getAddressStreet());
		System.out.println("\t address  city  "+addr.getAddressCity());
		System.out.println("\t address  state  "+addr.getAddressState());
	}
}
