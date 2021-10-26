import java.util.Properties;
import java.util.Set;
import org.capg.annotation.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain2 {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

//		User bean = factory.getBean("user1", User.class);
		//User bean = factory.getBean(User.class);
		User bean = factory.getBean("user",User.class);

		System.out.println(bean.getUserId());
		System.out.println(bean.getUserName());
		System.out.println(bean.getUserSalary());

	}
}
