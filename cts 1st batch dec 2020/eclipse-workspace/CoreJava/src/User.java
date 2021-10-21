
public class User {

	int id;
	Integer pincode;
	String name;
	float cost;
	char grade;
	
 /*User() {
	// TODO Auto-generated constructor stub
}	
*/
	void disp(String s){
		System.out.println("inside method "+s);
		
	}
	
	public static void main(String[] args) {
		User user=new User();
		System.out.println(user.id);
		System.out.println(user.name);
		System.out.println(user.cost);
		System.out.println(user.grade);
		System.out.println(user.pincode);
	
		user.disp(null);
	}
}
