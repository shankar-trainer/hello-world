
public class PersonMain {

	public static void main(String[] args) {
		
		Person person=new Person();// person is reference variable which holds reference/address of object
		//person.id=0;
		//person.name="";
		//person.salary=-9000;
		//person.location="a";
		
		person.setId(898989);
		person.setName("amit kumar");
		person.setLocation("delhi");
		person.setSalary(56000);

		
		System.out.println("person information ");
		System.out.println("id is "+person.getId());
		System.out.println("name is "+person.getName());
		System.out.println("salary is "+person.getSalary());
		System.out.println("location is "+person.getLocation());
	}
}
