import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.model.Insurance;

public class InsuranceMain {

	public static void main(String[] args) {
		
	//	ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		ApplicationContext ctx=new FileSystemXmlApplicationContext("../SpringApp3/src/main/resources/application.xml");
		///SpringApp3/src/main/resources/application.xml
 		Insurance bean = ctx.getBean(Insurance.class);
		
 		System.out.println(bean);
	}
}
