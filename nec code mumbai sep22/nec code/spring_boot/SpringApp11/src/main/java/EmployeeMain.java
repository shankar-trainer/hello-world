import org.nec.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Employee emp = (Employee) beanFactory.getBean("emp1");
		Employee emp1 = (Employee) beanFactory.getBean("emp1");

		emp1.setId(1);
		emp1.setName("parag kumar");
		emp1.setSalary(67000);
		
		System.out.println("Employee1 values ");
		System.out.println("id "+emp.getId());
		System.out.println("name  "+emp.getName());
		
		
		System.out.println("Employee2 values ");
		System.out.println("id "+emp1.getId());
		System.out.println("name  "+emp1.getName());
		
	}
}
