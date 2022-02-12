import org.lpu.model.Address;
import org.lpu.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Student st1 = beanFactory.getBean("stud1", Student.class);

		Address address = st1.getAddress();

		System.out.println("student school details ");
		System.out.println("roll is  " + st1.getRoll());
		System.out.println("name is  " + st1.getName());
		System.out.println("marks is  " + st1.getMarks());

		System.out.println("\naddress  ");
		System.out.println("\t id "+address.getAddr_id());
		System.out.println("\t sector "+address.getSector());
		System.out.println("\t city "+address.getCity());
		
		
		System.out.println("set of books "+st1.getBooks());
		System.out.println("list  of exams "+st1.getExams());
		System.out.println("map   of fees "+st1.getFee());
		
	}
}
