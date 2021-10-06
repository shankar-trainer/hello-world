package orgc.om;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class App1 {
	
	public static void main(String[] args) {
  
	ConfigurableApplicationContext ctx=	SpringApplication.run(App1.class);	
	 Employee e=  ctx.getBean(Employee.class);
	
	 System.out.println("id is "+e.getId());
	 System.out.println("name is "+e.getName());
  
      System.out.println(" hello world");
	}
}
