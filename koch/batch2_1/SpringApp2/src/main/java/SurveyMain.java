import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.config.ApplicationConfig;
import com.cts.model.Employee;
import com.cts.model.Survey;

public class SurveyMain {

	public static void main(String[] args) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(
			Survey.class);
	
//	  Survey bean = ctx.getBean(Survey.class);
	  Survey bean = ctx.getBean("survey",Survey.class);
	
	  System.out.println(bean);
	}
}
