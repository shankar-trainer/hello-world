import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.ApplicationConfig;
import com.cts.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
//		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Employee bean = ctx.getBean(Employee.class);
		Employee bean1 = ctx.getBean(Employee.class);
		
		bean1.setId(87878787);
		bean1.setName("sunil");
		bean1.setSalary(58000);

		System.out.println(bean);
		System.out.println(bean1);
		
//		System.out.println("\tid :" + bean.getId());
//		System.out.println("\tname :" + bean.getName());
//		System.out.println("\tsalary :" + bean.getSalary());
		ctx.close();
	}
}
