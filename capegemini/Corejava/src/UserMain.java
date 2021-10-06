
public class UserMain {

	public static void main(String[] args) {
		User user=new User();
		/*user.id=-76698;
		user.name="ram";
		user.city="";*/

		user.setId(-1000);
		user.setName("ram");
		user.setCity("");
		
		System.out.println("User Information");
		System.out.println("id is "+user.getId());
		System.out.println("name is "+user.getName());
		System.out.println("city is "+user.getCity());
	}
}
