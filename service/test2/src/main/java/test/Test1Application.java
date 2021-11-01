package test;
import org.com.dao.StudentInfoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan({"org.com.dao","org.com.model"})
//@ComponentScan("org.com.dao")
//@ComponentScan("org.com.model")
//@ComponentScans()
//@SpringBootConfiguration
public class Test1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Test1Application.class, args);
		StudentInfoImpl impl = ctx.getBean("st", StudentInfoImpl.class);
		impl.message();
	}
}
