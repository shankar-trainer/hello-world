
public class CustomerMain {

	public static void main(String[] args) {
		Customer customer=new Customer();
		/*
		customer.id=-89889;
		customer.name="m";
		customer.salary=0;
		*/
		customer.setId(877676);
		customer.setName("amar kumar");
		customer.setSalary(120000);
		
		System.out.println("customer data ");
		System.out.println("id is "+customer.getId());
		System.out.println("name is "+customer.getName());
		System.out.println("salary is "+customer.getSalary());
	}
}
