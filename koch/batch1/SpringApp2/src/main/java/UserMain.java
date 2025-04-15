import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.AppConfig;
import com.cts.model.Car;
import com.cts.model.Employee;
import com.cts.model.User;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		User user = ctx.getBean(User.class);

		System.out.println(user);

	}
}
