
public class PersonMain {

	public static void main(String[] args) {
		
		
		Address address=new Address(889, "aagra", "UP");
		
		Person person=new Person(1, "sudhanshu kumar", 45, address);
		
		System.out.println("Person data ");
		
		System.out.println("\tid "+person.getPersonId());
		System.out.println("\tname "+person.getPersonName());
		System.out.println("\tage "+person.getPersonAge());
		
		System.out.println("\n\t Address");
		System.out.println("\tid :"+person.getAddress().getAddrId());
		System.out.println("\tcity :"+person.getAddress().getAddrCity());
		System.out.println("\tstate :"+person.getAddress().getAddrState());
	}
}
