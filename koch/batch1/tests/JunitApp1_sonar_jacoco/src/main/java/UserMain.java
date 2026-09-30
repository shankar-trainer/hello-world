import com.cts.model.User;

public class UserMain {

	public static void main(String[] args) {
	User	user = new User(4545455, "ratanakar kumar", 44);
	User	user1 = new User(4545455, "ratanakar kumar", 44);

	System.out.println(user.equals(user1));
	System.out.println(user.hashCode());
	System.out.println(user1.hashCode());

	}
}
