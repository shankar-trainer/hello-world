package ogg.capg.main;

import org.capg.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
		User bean = beanFactory.getBean("user1", User.class);

		User bean1 = beanFactory.getBean( User.class);
		bean1 = new User(1, "sundar c", "sundar@gmail.com");

		System.out.println("bean instance\n");
		System.out.println(bean.getUserId());
		System.out.println(bean.getUserName());
		System.out.println(bean.getEmail());


		System.out.println();
		System.out.println("bean1 instance\n");
		
		System.out.println(bean1.getUserId());
		System.out.println(bean1.getUserName());
		System.out.println(bean1.getEmail());

	}
}
