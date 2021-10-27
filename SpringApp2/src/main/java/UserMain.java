import org.capg.dao.ShoppingKart;
import org.capg.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user1 = ctx.getBean("user1",User.class);
		User user2 = ctx.getBean("user2",User.class);

		System.out.println(user1.getUserId()+"  "+user1.getUserName()+"  "+user1.getUserSalary());
		System.out.println();
		System.out.println(user2.getUserId()+"  "+user2.getUserName()+"  "+user2.getUserSalary());
		
	}
}
