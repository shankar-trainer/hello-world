import org.capg.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmployeeMain {

	public static void main(String[] args) {

		BeanFactory factory;
		// factory = new ClassPathXmlApplicationContext("beans.xml");
		factory = new FileSystemXmlApplicationContext
				("../SpringApp1/src/main/resources/beans.xml");

		Employee bean = factory.getBean("emp1", Employee.class);

		// System.out.println(bean.getId());
		// System.out.println(bean.getName());
		// System.out.println(bean.getSalary());

		System.out.println(bean.display());

		XmlBeanFactory factory2 = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Employee bean1 = factory2.getBean("emp1", Employee.class);

		System.out.println(bean1.display());
		
	}
}
