import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.AppConfig;
import com.cts.model.Car;
import com.cts.model.Employee;
import com.cts.model.Person;

public class PersonMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Person.class);

		//Person person = applicationContext.getBean(Person.class);
//		Person person = applicationContext.getBean("person",Person.class);
		Person person = applicationContext.getBean("person1",Person.class);
		System.out.println(person);
		
		System.out.println("Person data");
		System.out.println("\tid "+person.getPersonId());
		System.out.println("\tname "+person.getPersonName());
		System.out.println("\tage "+person.getPersonAge());
		System.out.println("\tdob "+person.getDob());
		
		
		System.out.println("\nBook list ");
		person.getBookList().forEach(a->System.out.println("\t"+a));

		System.out.println("\nBike  set ");
		person.getBikeSet().forEach(a->System.out.println("\t"+a));
		
		
		System.out.println("\nHome map ");
		person.getHomeMap().forEach((k,v)->System.out.println("\t"+k+"   "+v));
		
		
		
	}
}
