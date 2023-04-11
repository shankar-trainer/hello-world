
public class ManagerMain {

	public static void main(String[] args) {
		Phone phone[]=new Phone[2];
		phone[0]=new Phone(43, 6556565669l,"office", "nokia", 30000);
		phone[1]=new Phone(44, 6556565699l,"home", "oppo", 50000);
		
		Address address1=new Address(1001,"sector1","hyderabad","telengana",6776776);
		Manager manager1=new Manager(67876678,"suman kumar","india",67000,address1,phone);
		
		System.out.println("Manager Information ");
		
		System.out.println("\tmanager id "+manager1.getManagerId());
		System.out.println("\tmanager name "+manager1.getManagerName());
		System.out.println("\tmanager location "+manager1.getManagerLocation());
		System.out.println("\tmanager salary "+manager1.getManagersalary());
		
		
		System.out.println("\nAddress ===============");
		
		Address address = manager1.getAddress();
		
		System.out.println("\taddress id "+address.getAddressId());
		System.out.println("\taddress street "+address.getAddressStreet());
		System.out.println("\tcity is "+address.getAddressCity());
		System.out.println("\tstate is "+address.getAddressState());
		
		System.out.println("\taddress id "+manager1.getAddress().getAddressPin());
		
		System.out.println("\nPhone ===============");
		
		for(Phone p:manager1.getPhone())
		{
			System.out.println("-----------------------------------");
			System.out.println("\n\t  id  :"+p.getPhoneId());
			System.out.println("\t  no :"+p.getPhoneNo());
			System.out.println("\t  type :"+p.getPhoneType());
			System.out.println("\t  model :"+p.getPhoneModel());
			System.out.println("\t  cost :"+p.getPhoneCost());
			System.out.println("-----------------------------------\n");
		}
		
		
	}
}
