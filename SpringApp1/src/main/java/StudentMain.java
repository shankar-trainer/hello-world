import org.capg.Employee;
import org.capg.annotation.model.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class StudentMain {

	public static void main(String[] args) {

		BeanFactory factory;
		 factory = new ClassPathXmlApplicationContext("applicationContext.xml");

	Student bean1 = factory.getBean("st1", Student.class);
	System.out.println(bean1.getRoll()+"  "+bean1.getName()+"  "+bean1.getSubject());

	System.out.println("\n");
	Student bean2 = factory.getBean("st2", Student.class);
	System.out.println(bean2.getRoll()+"  "+bean2.getName()+"  "+bean2.getSubject());
	
	}
}
