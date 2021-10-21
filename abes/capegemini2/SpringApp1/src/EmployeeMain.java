import org.com.model.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

		Employee emp1 = factory.getBean("emp1", Employee.class);
		emp1.show();
		System.out.println(emp1);
		System.out.println("Employee Information");
		System.out.println("\tId is "+emp1.getId());
		System.out.println("\tName is "+emp1.getName());
		System.out.println("\tSalary is "+emp1.getSalary());
	}
}
