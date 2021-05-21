
public class PersonMain {

	public static void main(String[] args) {
	 Person person=new Person();
	 person.setPerId(43434);
	 person.setPerLocation("chennai");
	 person.setPerName("mahesh kumar");
	 //person.setCountry("india");
	 Person.setCountry("India");
	 
	 
	 System.out.println(person.getPerId());
	 System.out.println(person.getPerName());
	 System.out.println(person.getPerLocation());
	 
	 System.out.println(Person.getCountry());
	}
}
