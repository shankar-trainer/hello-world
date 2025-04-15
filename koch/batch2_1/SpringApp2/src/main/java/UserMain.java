import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.ApplicationConfig;
import com.cts.model.Employee;
import com.cts.model.User;

public class UserMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
			
//	User bean = ctx.getBean(User.class);
	User bean = ctx.getBean("getUser",User.class);
	
	System.out.println(bean);
	
	}
}
