import java.beans.Customizer;

import org.com.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {

    Person p1= (Person) new ClassPathXmlApplicationContext("beans.xml").getBean("cust");		
		
    System.out.println(p1);
	}

}