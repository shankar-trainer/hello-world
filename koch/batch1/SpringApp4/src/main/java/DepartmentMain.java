import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.ApplicationConfig;
import com.cts.model.Department;

public class DepartmentMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Department bean = applicationContext.getBean(Department.class);
		
		System.out.println(bean);
	}
}
