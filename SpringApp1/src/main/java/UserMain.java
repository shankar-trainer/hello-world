
import org.lpu.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {
		//BeanFactory  
	ConfigurableApplicationContext	beanFactory=new ClassPathXmlApplicationContext("beans.xml");
		
		User bean = beanFactory.getBean("user",User.class);
	 
		System.out.println(bean);
	
		beanFactory.close();
	}
}
