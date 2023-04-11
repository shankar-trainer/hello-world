import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.User;
import com.abc.UserInfo;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

		System.out.println("\nUser1 Info\n");
		User user = ctx.getBean("user", UserInfo.class);

		System.out.println(user);
		user.getUserInfo();

		System.out.println("\nUser2 Info");

		user = ctx.getBean("user1", UserInfo.class);
		user.getUserInfo();

	}
}
