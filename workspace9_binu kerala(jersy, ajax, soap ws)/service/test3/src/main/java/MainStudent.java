
import org.com.dao.StudentInfoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		StudentInfoImpl info = (StudentInfoImpl) ctx.getBean("st");
		info.message();
	}
}
