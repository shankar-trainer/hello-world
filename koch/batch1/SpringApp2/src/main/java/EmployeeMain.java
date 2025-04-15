import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.AppConfig;
import com.cts.model.Car;
import com.cts.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
//		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	 ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
	//	Employee bean = ctx.getBean(Employee.class);
		Employee bean = ctx.getBean("getEmployee",Employee.class);
		
		Employee bean1 = ctx.getBean(Employee.class);
		
		bean1.setEmployeeId(9009);
		bean1.setEmployeeName("bhasakar");
		bean1.setEmployeeSalary(25000);
		
		System.out.println(bean);
		System.out.println(bean1);
		
		System.out.println("Employee1 data ");
		System.out.println("\tId  :  "+bean.getEmployeeId());
		System.out.println("\tName  :   "+bean.getEmployeeName());
		System.out.println("\tSalary   :   "+bean.getEmployeeSalary());
		
		
		System.out.println("\nEmployee2 data ");
		System.out.println("\tId  :  "+bean1.getEmployeeId());
		System.out.println("\tName  :  "+bean1.getEmployeeName());
		System.out.println("\tSalary  :   "+bean1.getEmployeeSalary());
		
		Car c=bean.getCar();
		
		System.out.println("\nCar Information");
		System.out.println("\tReg no : "+c.getRegNo());
		System.out.println("\tModel  :  "+c.getModel());
		System.out.println("\tLocation :  "+c.getLocation());
		
		
		
		
		ctx.close();
	}
}
