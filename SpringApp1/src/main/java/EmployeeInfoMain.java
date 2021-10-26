import org.capg.EmployeeInfo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeInfoMain {
	public static void main(String[] args) {

		BeanFactory factory;
		factory = new ClassPathXmlApplicationContext("beans.xml");

		EmployeeInfo bean = factory.getBean("info", EmployeeInfo.class);
		bean.hello();
		
	}
}
