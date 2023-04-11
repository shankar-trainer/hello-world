
public class PersonMain {

	public static void main(String[] args) {

		/*
		 * Teacher teacher=new Teacher(); Father father=new Father(); Customer
		 * customer=new Customer();
		 * 
		 * teacher.personInfo(); father.personInfo(); customer.personInfo();
		 */

		Person person;

		person = new Teacher();
		person.personInfo();

		person = new Father();
		person.personInfo();

		person = new Customer();
		person.personInfo();

	}
}
