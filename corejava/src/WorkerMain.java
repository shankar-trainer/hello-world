
public class WorkerMain {

	public static void main(String[] args) {
		
		Address address1=new Address(1, "laxminagar", "new delhi", 110091);
		
		Worker worker1=new Worker(900010, "shyam kumar", 600, address1);
		Worker worker2=new Worker(900011, "hari kumar", 700, new Address(2, "gr noida", "alpha", 78787));
				
		System.out.println("\nWorker1 Detail");
		System.out.println("\tid  "+worker1.getId());
		System.out.println("\tname "+worker1.getName());
		System.out.println("\twages "+worker1.getWages());
		
		System.out.println("Address......... ");
		
		Address address_1=worker1.getAddress();
		System.out.println("\taddress id "+address_1.getAddrId());
		System.out.println("\taddress location "+address_1.getAddrLocation());
		System.out.println("\taddress city "+address_1.getAddrCity());
	
		System.out.println("==============================");
		System.out.println("\nWorker2 Detail");
		System.out.println("\tid "+worker2.getId());
		System.out.println("\tname "+worker2.getName());
		System.out.println("\t wages"+worker2.getWages());
		
		System.out.println("Address......... ");
		
		Address address_2=worker2.getAddress();
		System.out.println("\taddress id "+address_2.getAddrId());
		System.out.println("\taddress location "+address_2.getAddrLocation());
		
		System.out.println("\taddress location "+worker2.getAddress().getAddrLocation());
		
		System.out.println("\taddress city "+address_2.getAddrCity());
	
		
	}
}
