import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.Student;
import com.abc.User;
import com.abc.UserInfo;

public class Studentmain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		Student bean = ctx.getBean(Student.class);
		
		System.out.println(bean);
		
	}
}
